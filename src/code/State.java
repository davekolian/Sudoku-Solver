package code;

import java.util.ArrayList;
import java.util.List;

public class State {

    List<Cell> cells = new ArrayList<>();
    int level;

    public State(List<Cell> cells) {
        this.cells = cells;
    }

    public State() {
    }

    public State start(){
        State startState = new State();
        //int[][] input = {{0, 3, 0, 0}, {0, 0, 0, 1}, {3, 0, 0, 0}, {0, 0, 2, 0}}; //Main
        //int[][] input = {{0, 3, 0, 0}, {0, 0, 0, 1}, {3, 0, 0, 0}, {0, 0, 2, 0}}; //Solved
        int[][] input = {{0, 0, 0, 0}, {0, 0, 1, 0}, {4, 0, 0, 0}, {0, 2, 0, 3}}; //problem with empty boxes
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

            startState.getCells().add(new Cell(i, rowCounter, colCounter, boxCounter, input[x][y]));
            //System.out.println("i: " + i + " row: " + rowCounter + " col: " + colCounter + " box: " + boxCounter + " value: " +  startState.getCells().get(i).getValue());

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
        for(Cell cell : getCells()){
            result += cell.getValue() + " ";
            if (count % 4 == 0) result += " | ";
            count++;
        }
        return result;
    }

    public String getValuesInBox(int box){
        String result = "";
        for(Cell cell : getCells()){
            if(cell.getBox() == box)
                result += cell.getValue();
        }

        return result;
    }

    public String getValuesInRow(int row){
        String result = "";
        for (Cell cell: getCells()){
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

    public List<Cell> getCells() {
        return cells;
    }

    public static List<Cell> prevStateCells(List<Cell> origList){
        try {
            List<Cell> clone = new ArrayList<>();

            for (Cell cell : origList) {
                clone.add((Cell) cell.clone());
            }

            return clone;
        } catch (CloneNotSupportedException e){
            throw new InternalError(e);
        }
    }

    public static Boolean isFull(State state){
        for (Cell cell : state.getCells()){
            if (cell.getValue() == 0) return false;
        }
        return true;
    }

}
