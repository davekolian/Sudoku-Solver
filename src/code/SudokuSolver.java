package code;

import java.util.ArrayList;
import java.util.List;

public class SudokuSolver {

    public static int mainType;

    public static int startSolutionCheck(State state, int type) {
        ArrayList<Node> nodes = new ArrayList<>(); //List of all nodes
        mainType = type;

        nodes.add(new Node(state, null));

        int answer = moreSolutions(nodes.get(0), nodes);

        return answer;
    }

    //Function which checks if an operation is allowed
    public static Boolean isLegal(State state, Cell cell, int newValue) {
        int size = (int) Math.sqrt(state.getCells().size()); //16 -> 4, 36 -> 6, 81 -> 9
        if (newValue < 1 || newValue > size) return false;

        //Checks all values in the selected cell's box with the newValue
        char[] ar1 = state.getValuesInBox(cell.getBox()).toCharArray();
        for (char value : ar1) {
            if (Character.getNumericValue(value) == newValue) return false;
        }

        //Checks all values in the selected cell's column with the newValue
        char[] ar2 = state.getValuesInCol(cell.getCol()).toCharArray();
        for (char value : ar2) {
            if (Character.getNumericValue(value) == newValue) return false;
        }

        //Checks all values in the selected cell's row with the newValue
        char[] ar3 = state.getValuesInRow(cell.getRow()).toCharArray();
        for (char value : ar3) {
            if (Character.getNumericValue(value) == newValue) return false;
        }

        //Checks all values in the selected cell's diagonal with newValue IF X-Sudoku is selected
        if (mainType == 4) {
            char[] ar4 = state.getValuesInDiag(cell.getPos()).toCharArray();
            if (ar4.length != 0) {
                for (char value : ar4) {
                    if (Character.getNumericValue(value) == newValue) return false;
                }
            }
        }

        return true;
    }

    //Function which checks all the cells in the specified state to see if it's full
    public static Boolean isFull(State state) {
        for (Cell cell : state.getCells()) {
            if (cell.getValue() == 0) return false;
        }

        return true;
    }

    //Function involved with backtracking and producing more childNodes
    public static int moreSolutions(Node parentNode, List<Node> listOfNodes) {
        int cantAdd = 0;
        int found = 0;
        int digits = (int) Math.sqrt(parentNode.getState().getCells().size());

        for (Cell cell : parentNode.getState().getCells()) {
            if (found == -1)
                return -1; //cause the startSolutionCheck to go to the start in case no solution can be found
            if (cell.getValue() == 0) {
                for (int i = 1; i <= digits; i++) {
                    if (isLegal(parentNode.getState(), cell, i)) {
                        List<Cell> newList = State.prevStateCells(parentNode.getState().getCells()); //makes a deep copy of the prev state's list of cells
                        newList.get(cell.getPos()).setValue(i);
                        Node childNode = new Node(new State(newList), parentNode);
                        //listOfNodes.add(childNode);
                        //childNode.getState().toStringe();
                        if (isFull(childNode.getState())) {
                            //System.out.println("Answer State: ");
                            //System.out.println(childNode.getState());
                            //System.out.println("Size of nodes list: " + listOfNodes.size());
                            //exit(0); //Exit the program, done cause backtracking thousands of nodes back is memory hungry
                            WindowController.fillPuzzle(childNode.getState());
                            return 1;
                        }
                        found = moreSolutions(childNode, listOfNodes); //call the startSolutionCheck again to see if it has more childNodes
                        if (found == 1) return 1;
                    } else if (cantAdd == digits) {
                        return -1; //returns to the prev node if it cannot find more childNodes and continue checking if there are other possible nodes with the parentNode
                    } else {
                        cantAdd++;
                    }
                }
            }
        }

        return found;
    }
}


