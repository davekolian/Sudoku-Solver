package code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SudokuSolver {

    public static void main(String[] args)   {
        SudokuSolver ss = new SudokuSolver();
        ss.sudokuSplitter();

    }

    public void sudokuSplitter()   { // 3, , 4, 1, ...
        ArrayList<Cell> cells = new ArrayList<>(16);
        ArrayList<State> states = new ArrayList<>();
        ArrayList<Node> nodes = new ArrayList<>();
        int stateCounter = 0;

        //System.out.println(states.get(0));
        //System.out.println(states.get(0).getValuesInBox(4));
        //function(states.get(0));

        boolean isBox = true;
        boolean isRow = false;
        boolean isCol = false;

        boolean cond = true;
        //long sTime = System.nanoTime();
        //long eTime = 0;

        nodes.add(stateCounter, new Node(new State().start(), null));
        int lastChangedCellPos = 0;
        int lastValue = 0;
        int cantAdd = 0;
        boolean oopsie = false;



        while(cond) {
            int[] bCells;
            int j = 0;

            if (isBox){
                bCells = posOfCellsBox(nodes.get(stateCounter).getState());
                //System.out.println(bCells[0] + " " + bCells[1]  + " " +  bCells[2]  + " " +  bCells[3]);
            } else if (isRow)
                bCells = posOfCellsRow(nodes.get(stateCounter).getState());
            else
                bCells = posOfCellsCol(nodes.get(stateCounter).getState());

            //System.out.println("box: " + findCrowdedBox(nodes.get(stateCounter).getState()));
            if(!oopsie) {
                for (int i = 0; i < 4; i++) {
                    if (nodes.get(stateCounter).getState().getCells().get(bCells[i]).getValue() == 0) {
                        for (j = 1; j <= 4; j++) {
                            //System.out.println(j+"i: " + i + " s: " + stateCounter + " p: "  + bCells[i] + " v: "  + nodes.get(stateCounter).getState().getCells().get(bCells[i]).getValue());
                            if (isLegal(nodes.get(stateCounter).getState(), nodes.get(stateCounter).getState().getCells().get(bCells[i]), j)) {
                                //System.out.println("Putting " + j + " in " + bCells[i]);
                                stateCounter++;

                                List<Cell> newCellList = State.prevStateCells(nodes.get(stateCounter - 1).getState().getCells());
                                nodes.add(stateCounter, new Node(new State(newCellList), nodes.get(stateCounter - 1))); //made new node, parent is prev node
                                nodes.get(stateCounter).getState().getCells().get(bCells[i]).setValue(j); //sets the value of the cell in the new node/state
                                System.out.println("{" + stateCounter + "} " + nodes.get(stateCounter).getState());
                                lastValue = j;
                                lastChangedCellPos = bCells[i];
                                cantAdd = 0;
                                break;
                            }
                            else if (cantAdd == 4) {
                                oopsie = true;
                                cantAdd = 0;
                                break;
                            } else
                                cantAdd++;
                        }
                    }
                }
            }
            else {
                //System.out.println("Made oopsie!");
                nodes.remove(stateCounter);
                --stateCounter;
                if(nodes.get(stateCounter).getState().getCells().get(lastChangedCellPos).getValue() == 0) {
                    if (isLegal(nodes.get(stateCounter).getState(), nodes.get(stateCounter).getState().getCells().get(lastChangedCellPos), ++lastValue)) {
                        stateCounter++;

                        List<Cell> newCellList = State.prevStateCells(nodes.get(stateCounter - 1).getState().getCells());
                        if (nodes.get(stateCounter - 1) != null)
                            nodes.add(stateCounter, new Node(new State(newCellList), nodes.get(stateCounter - 1))); //made new node, parent is prev node
                        else
                            nodes.add(stateCounter, new Node(new State(newCellList), null)); //made new node, parent is prev node

                        nodes.get(stateCounter).getState().getCells().get(lastChangedCellPos).setValue(lastValue); //sets the value of the cell in the new node/state
                        System.out.println("{" + stateCounter + "} " + nodes.get(stateCounter).getState());
                        oopsie = false;
                    }
                }
            }

            if(State.isFull(nodes.get(stateCounter).getState())) cond = false;
        }

        //long timeSpent = eTime - sTime;
        //System.out.println(timeSpent + " nano seconds!");


    }

    public int findCrowdedBox(State state){
        int box = 1;
        int max = 4;

        for (int i = 1; i <= 4; i++){
            int numOfZeroes = 0;

            char[] values = state.getValuesInBox(i).toCharArray();
            for(char value : values){
                if(value== '0') numOfZeroes++;
            }
            if(numOfZeroes < max && numOfZeroes != 0){
                box = i;
                max = numOfZeroes;
            }

        }
        return box;
    }

    public int findCrowdedRow(State state){
        int row = 1;
        int max = 4;

        for (int i = 1; i <= 4; i++){
            int numOfZeroes = 0;

            char[] values = state.getValuesInRow(i).toCharArray();
            for(char value : values){
                if(value== '0') numOfZeroes++;
            }
            if(numOfZeroes < max && numOfZeroes != 0){
                row = i;
                max = numOfZeroes;
            }
        }
        return row;
    }

    public int findCrowdedCol(State state){
        int col = 1;
        int max = 4;

        for (int i = 1; i <= 4; i++){
            int numOfZeroes = 0;

            char[] values = state.getValuesInCol(i).toCharArray();
            for(char value : values){
                if(value== '0') numOfZeroes++;
            }
            if(numOfZeroes < max && numOfZeroes != 0){
                col = i;
                max = numOfZeroes;
            }
        }
        return col;
    }

    /*public Integer[] findPosOfEmpty(State state){
        ArrayList<Integer> pos = new ArrayList<>();
        int counter = 0;

        for (int i = 0; i < 16; i++){
            if(state.cells.get(i).getValue() == 0) pos.add(i);
        }

        return pos.toArray(new Integer[0]);
    }

    public int cellWithMostAdj(State state){
        int cellPos = 0;
        Integer[] arr = findPosOfEmpty(state);




        return cellPos;
    }*/
    /*public void function(State state){
        int box = findCrowdedBox(state);
        int row = findCrowdedRow(state);
        int col = findCrowdedCol(state);

        //Maybe find a common object/cell
    }*/

    public int[] posOfCellsBox(State state){
        int boxChoice = findCrowdedBox(state);
        int c1 = 0;
        switch (boxChoice){
            case 1:
                c1 = 0;
                break;
            case 2:
                c1 = 2;
                break;
            case 3:
                c1 = 8;
                break;
            case 4:
                c1 = 10;
                break;
        }

        int c2 = c1 + 1;
        int c3 = c1 + 4;
        int c4 = c2 + 4;

        return new int[]{c1, c2, c3, c4};
    }

    public int[] posOfCellsRow(State state){
        int rowChoice = findCrowdedRow(state);
        int c1 = 0;
        switch (rowChoice){
            case 1:
                c1 = 0;
                break;
            case 2:
                c1 = 4;
                break;
            case 3:
                c1 = 8;
                break;
            case 4:
                c1 = 12;
                break;
        }

        int c2 = c1 + 1;
        int c3 = c2 + 1;
        int c4 = c3 + 1;

        return new int[]{c1, c2, c3, c4};
    }

    public int[] posOfCellsCol(State state){
        int colChoice = findCrowdedCol(state);
        int c1 = 0;
        switch (colChoice){
            case 1:
                c1 = 0;
                break;
            case 2:
                c1 = 1;
                break;
            case 3:
                c1 = 2;
                break;
            case 4:
                c1 = 3;
                break;
        }

        int c2 = c1 + 4;
        int c3 = c2 + 4;
        int c4 = c3 + 4;

        return new int[]{c1, c2, c3, c4};
    }

    //Can make the functions shorter if possible ^

    public Boolean isLegal(State state, Cell cell, int newValue){

        if(newValue < 1 || newValue > 4) return false;

        char[] ar1 = state.getValuesInBox(cell.getBox()).toCharArray();
        for (char value : ar1){
            if (Character.getNumericValue(value) == newValue) return false;
        }

        char[] ar2 = state.getValuesInCol(cell.getCol()).toCharArray();
        for (char value : ar2){
            if (Character.getNumericValue(value) == newValue) return false;
        }

        char[] ar3 = state.getValuesInRow(cell.getRow()).toCharArray();

        for (char value : ar3){
            if (Character.getNumericValue(value) == newValue) return false;
        }

        return true;
    }
}
