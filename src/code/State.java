package code;

import java.util.ArrayList;
import java.util.List;

public class State {
    List<Cell> cells = new ArrayList<>();

    public State() {
    }

    public State(List<Cell> cells) {
        this.cells = cells;
    }

    public List<Cell> getCells() {
        return cells;
    }

    //Function which returns the start state
    public State start(int[][] input) {
        State startState = new State();

        int numberOfCells = input[0].length * input.length;
        int digits = (int) Math.sqrt(numberOfCells);
        int x = 0;
        int y = 0;
        int rowCounter = 1;
        int colCounter = 1;
        int boxCounter = 1;
        
        for (int i = 0; i < numberOfCells; i++) {
            if (i % digits == 0 && i != 0) rowCounter++;
            if (i % digits == 0)
                colCounter = 1;
            else
                colCounter++;

            if (digits == 9) {
                if ((rowCounter >= 1 && rowCounter <= 3) && (colCounter >= 1 && colCounter <= 3)) boxCounter = 1;
                if ((rowCounter >= 1 && rowCounter <= 3) && (colCounter >= 4 && colCounter <= 6)) boxCounter = 2;
                if ((rowCounter >= 1 && rowCounter <= 3) && (colCounter >= 7 && colCounter <= 9)) boxCounter = 3;
                if ((rowCounter >= 4 && rowCounter <= 6) && (colCounter >= 1 && colCounter <= 3)) boxCounter = 4;
                if ((rowCounter >= 4 && rowCounter <= 6) && (colCounter >= 4 && colCounter <= 6)) boxCounter = 5;
                if ((rowCounter >= 4 && rowCounter <= 6) && (colCounter >= 7 && colCounter <= 9)) boxCounter = 6;
                if ((rowCounter >= 7 && rowCounter <= 9) && (colCounter >= 1 && colCounter <= 3)) boxCounter = 7;
                if ((rowCounter >= 7 && rowCounter <= 9) && (colCounter >= 4 && colCounter <= 6)) boxCounter = 8;
                if ((rowCounter >= 7 && rowCounter <= 9) && (colCounter >= 7 && colCounter <= 9)) boxCounter = 9;
            } else if (digits == 4) {
                if ((rowCounter >= 1 && rowCounter <= 2) && (colCounter >= 1 && colCounter <= 2)) boxCounter = 1;
                if ((rowCounter >= 1 && rowCounter <= 2) && (colCounter >= 3 && colCounter <= 4)) boxCounter = 2;
                if ((rowCounter >= 3 && rowCounter <= 4) && (colCounter >= 1 && colCounter <= 2)) boxCounter = 3;
                if ((rowCounter >= 3 && rowCounter <= 4) && (colCounter >= 3 && colCounter <= 4)) boxCounter = 4;
            } else {
                if ((rowCounter >= 1 && rowCounter <= 2) && (colCounter >= 1 && colCounter <= 3)) boxCounter = 1;
                if ((rowCounter >= 1 && rowCounter <= 2) && (colCounter >= 4 && colCounter <= 6)) boxCounter = 2;
                if ((rowCounter >= 3 && rowCounter <= 4) && (colCounter >= 1 && colCounter <= 3)) boxCounter = 3;
                if ((rowCounter >= 3 && rowCounter <= 4) && (colCounter >= 4 && colCounter <= 6)) boxCounter = 4;
                if ((rowCounter >= 5 && rowCounter <= 6) && (colCounter >= 1 && colCounter <= 3)) boxCounter = 5;
                if ((rowCounter >= 5 && rowCounter <= 6) && (colCounter >= 4 && colCounter <= 6)) boxCounter = 6;
            }

            startState.getCells().add(new Cell(i, rowCounter, colCounter, boxCounter, input[x][y]));
            //System.out.println("i: " + i + " row: " + rowCounter + " col: " + colCounter + " box: " + boxCounter + " value: " +  startState.getCells().get(i).getValue());

            if ((i + 1) % digits == 0 && i != 0) {
                y = 0;
                x++;
            } else y++;

        }

        return startState;
    }

    //Function to get all the values in a box
    public String getValuesInBox(int box) {
        String result = "";
        for (Cell cell : getCells()) {
            if (cell.getBox() == box)
                result += cell.getValue();
        }

        return result;
    }

    //Function to get all the values in a row
    public String getValuesInRow(int row) {
        String result = "";
        for (Cell cell : getCells()) {
            if (cell.getRow() == row)
                result += cell.getValue();
        }
        return result;
    }

    //Function to get all the values in a column
    public String getValuesInCol(int col) {
        String result = "";
        for (Cell cell : cells) {
            if (cell.getCol() == col)
                result += cell.getValue();
        }
        return result;
    }

    //Function used to make a deep copy of the previous list of cells from the old state to the new state
    public static List<Cell> prevStateCells(List<Cell> origList) {
        try {
            List<Cell> clone = new ArrayList<>();

            for (Cell cell : origList) {
                clone.add((Cell) cell.clone());
            }

            return clone;

        } catch (CloneNotSupportedException e) {
            throw new InternalError(e);
        }
    }
}
