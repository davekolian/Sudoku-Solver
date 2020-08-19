package code;

import java.util.ArrayList;

public class State {

    ArrayList<Cell> cells = new ArrayList<>(16);
    int level;
    int parent;

    public State(ArrayList<Cell> cells, int level, int parent) {
        this.cells = cells;
        this.level = level;
        this.parent = parent;
    }

    public State start(){
        State startState = new State(cells, 0, 0);
        int[][] input = {{4, 3, 0, 0}, {1, 2, 3, 0}, {0, 0, 2, 0}, {2, 1, 0, 0}};
        int x = 0;
        int y = 0;
        int rowCounter = 1;
        int colCounter = 1;
        int boxCounter = 1;

        for(int i = 0; i < 16; i++) {
            if (i % 4 == 0 && i != 0) rowCounter++;
            if (i % 4 == 0) colCounter = 1;
            else colCounter++;
            if ((rowCounter == 2 || rowCounter == 1) && (colCounter == 2 || colCounter == 1)) boxCounter = 1;
            if ((rowCounter == 2 || rowCounter == 1) && (colCounter == 4 || colCounter == 3)) boxCounter = 2;
            if ((rowCounter == 4 || rowCounter == 3) && (colCounter == 2 || colCounter == 1)) boxCounter = 3;
            if ((rowCounter == 4 || rowCounter == 3) && (colCounter == 4 || colCounter == 3)) boxCounter = 4;

            cells.add(new Cell(i, rowCounter, colCounter, boxCounter, input[x][y]));
            //System.out.println("row: " + rowCounter + " col: " + colCounter + " box: " + boxCounter + " value: " + cells.get(i).getValue() + " ");

            if ((i+1) % 4 == 0 && i != 0) {
                y = 0;
                x++;
            }
            else y++;

        }
        return startState;
    }

    @Override
    public String toString() {
        String result = "";
        int count = 1;
        for(Cell cell : cells){
            result += cell.getValue() + " ";
            if (count % 4 == 0) result += " | ";
            count++;
        }
        return result;
    }

    public String getValuesInBox(int box){
        String result = "";
        for(Cell cell : cells){
            if(cell.getBox() == box)
                result += cell.getValue();
        }

        return result;
    }

    public String getValuesInRow(int row){
        String result = "";
        for (Cell cell: cells){
            if (cell.getRow() == row)
                result += cell.getValue();
        }
        return result;
    }

    public String getValuesInCol(int col){
        String result = "";
        for (Cell cell: cells){
            if (cell.getCol() == col)
                result += cell.getValue();
        }
        return result;
    }

    public Boolean isLegal(State state, Cell cell, int newValue){

        if(newValue < 1 || newValue > 4) return false;

        char[] ar1 = state.getValuesInBox(cell.getBox()).toCharArray();
        for (char value : ar1){
            if (Character.getNumericValue(value) == newValue) return false;
        }

        char[] ar2 = state.getValuesInCol(cell.getCol()).toCharArray();
        for (char value : ar2){
            if (Character.getNumericValue(value) == (char) newValue) return false;
        }

        char[] ar3 = state.getValuesInRow(cell.getRow()).toCharArray();
        for (char value : ar3){
            if (Character.getNumericValue(value) == (char) newValue) return false;
        }

        return true;
    }

    public Boolean isFull(State state){
        for (Cell cell : state.cells){
            if (cell.getValue() == 0) return false;
        }
        return true;
    }
}
