package code;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.exit;


public class SudokuSolver {

    public static void main(String[] args) {
        ArrayList<Node> nodes = new ArrayList<>();
        nodes.add(new Node(new State().start(), null));

        System.out.println("Starting State: ");
        System.out.println(nodes.get(0).getState());

        moreSolutions(nodes.get(0), nodes);
    }

    public static Boolean isLegal(State state, Cell cell, int newValue) {

        if (state.getCells().size() == 16) {
            if (newValue < 1 || newValue > 4)
                return false;
        } else if (state.getCells().size() == 36) {
            if (newValue < 1 || newValue > 6)
                return false;
        } else if (state.getCells().size() == 81) {
            if (newValue < 1 || newValue > 9)
                return false;
        }


        char[] ar1 = state.getValuesInBox(cell.getBox()).toCharArray();
        for (char value : ar1) {
            if (Character.getNumericValue(value) == newValue) return false;
        }

        char[] ar2 = state.getValuesInCol(cell.getCol()).toCharArray();
        for (char value : ar2) {
            if (Character.getNumericValue(value) == newValue) return false;
        }

        char[] ar3 = state.getValuesInRow(cell.getRow()).toCharArray();

        for (char value : ar3) {
            if (Character.getNumericValue(value) == newValue) return false;
        }

        return true;
    }

    public static int moreSolutions(Node parent, List<Node> listOfNodes) {
        int cantAdd = 0;
        int found = 0;

        for (Cell cell : parent.getState().getCells()) {
            if (cell.getValue() == 0) {
                if (found == -1)
                    return -1; //breaks the recursive function if solution is found
                for (int i = 1; i <= 9; i++) {
                    if (isLegal(parent.getState(), cell, i)) {
                        List<Cell> newList = State.prevStateCells(parent.getState().getCells());
                        Node childNode = new Node(new State(newList), parent);
                        newList.get(cell.getPos()).setValue(i);
                        listOfNodes.add(childNode);
                        //System.out.println(childNode.getState());
                        if (State.isFull(childNode.getState())) {
                            System.out.println("Answer State: ");
                            System.out.println(childNode.getState());
                            System.out.println("Size of nodes list: " + listOfNodes.size());
                            exit(0);
                        }
                        found = moreSolutions(childNode, listOfNodes); //call the function again to see if it has more childNodes
                    } else if (cantAdd == 9) {
                        return -1;
                    } else {
                        cantAdd++;
                    }
                }
            }
        }
        return found;
    }

}
