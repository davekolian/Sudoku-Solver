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
        //System.out.println(boxChoice);

        boolean cond = true;
        int levelCounter = 1;
        int parentCounter = 0;
        long sTime = System.nanoTime();
        long eTime = 0;
        while(cond){
            int boxChoice = findCrowdBox(states.get(stateCounter));
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

        long timeSpent = eTime - sTime;
        System.out.println(timeSpent + " nano seconds!");


    }

    public int findCrowdBox(State state){
        int numOfZeros = 0;
        int max = 4;
        int boxNum = 1;
        char[] nums;
        for (int i = 1; i <= 4; i++){
            nums = state.getValuesInBox(i).toCharArray();
            for (char digits : nums){
                if (digits == '0') numOfZeros++;
            }
            if(max > numOfZeros && numOfZeros != 0) {
                max = numOfZeros;
                boxNum = i;
            }
            numOfZeros = 0;
        }
        return boxNum;
    }


}
