package code;

import java.util.ArrayList;

public class SudokuSolver {
    int[] row1;
    int[] row2;
    int[] row3;
    int[] row4;
    int[] row5;
    int[] row6;
    int[] row7;
    int[] row8;
    int[] row9;

    int[] col1;
    int[] col2;
    int[] col3;
    int[] col4;
    int[] col5;
    int[] col6;
    int[] col7;
    int[] col8;
    int[] col9;

    public static void main(String[] args) {
        SudokuSolver ss = new SudokuSolver();
        ss.sudokuSplitter();

    }

    public void sudokuSplitter(){ // 3, , 4, 1, ...
        ArrayList<Cell> cells = new ArrayList<>(16);
        ArrayList<State> states = new ArrayList<>();
        int stateCounter = 0;

        states.add(new State(cells, 0,0).start());
        //System.out.println(states.get(0));
        //System.out.println(states.get(0).getValuesInBox(4));
        function(states.get(0));



        boolean cond = true;
        int levelCounter = 1;
        int parentCounter = 0;
        long sTime = System.nanoTime();
        long eTime = 0;
        /*while(cond){
            int boxChoice = findCrowdedBox(states.get(stateCounter));
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
            int[] pCells = {c1, c2, c3, c4};
            for(int i = 0; i < 4; i++){
                if (cells.get(pCells[i]).getValue() == 0) {
                    for(int j = 1; j <= 4; j++){
                        if(states.get(stateCounter).isLegal(states.get(stateCounter),cells.get(pCells[i]), j)){
                            System.out.println(states.get(stateCounter));
                            cells.get(pCells[i]).setValue(j);
                            states.add(new State(cells, 0, 0));
                            stateCounter++;
                            break;
                        }
                    }
                }
            }
            if(states.get(stateCounter).isFull(states.get(stateCounter))) {
                cond = false;
                eTime = System.nanoTime();
                System.out.println(states.get(stateCounter));
            }
        }
*/
        long timeSpent = eTime - sTime;
        System.out.println(timeSpent + " nano seconds!");


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
    public void function(State state){
        int box = findCrowdedBox(state);
        int row = findCrowdedRow(state);
        int col = findCrowdedCol(state);

        //Maybe find a common object/cell
    }


}
