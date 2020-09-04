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
    public State start() {
        State startState = new State();
        /*int[][] input = {{0, 0, 0, 0, 0, 0, 0, 0, 0}, //Default empty boxes
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0}};*/

        int[][] input = {{8, 0, 0, 0, 0, 0, 0, 0, 0}, //Hardest puzzle ever
                         {0, 0, 3, 6, 0, 0, 0, 0, 0},
                         {0, 7, 0, 0, 9, 0, 2, 0, 0},
                         {0, 5, 0, 0, 0, 7, 0, 0, 0},
                         {0, 0, 0, 0, 4, 5, 7, 0, 0},
                         {0, 0, 0, 1, 0, 0, 0, 3, 0},
                         {0, 0, 1, 0, 0, 0, 0, 6, 8},
                         {0, 0, 8, 5, 0, 0, 0, 1, 0},
                         {0, 9, 0, 0, 0, 0, 4, 0, 0}};
        /*int[][] input = {{3, 7, 0, 0, 0, 1, 0, 0, 0}, //Example of Expert puzzle
                                 {0, 0, 0, 9, 0, 2, 0, 0, 0},
                                 {0, 0, 0, 0, 0, 6, 5, 1, 0},
                                 {0, 0, 2, 0, 0, 0, 6, 4, 0},
                                 {1, 9, 0, 0, 0, 0, 0, 0, 0},
                                 {0, 4, 0, 0, 0, 9, 0, 2, 0},
                                 {0, 0, 4, 0, 0, 0, 1, 5, 0},
                                 {0, 0, 0, 8, 0, 0, 0, 0, 0},
                                 {6, 0, 0, 5, 0, 0, 7, 0, 0}};*/
        /*int[][] input = {{0, 0, 0, 0, 0, 0, 0, 0, 0}, //Example of hard puzzle
                {0, 1, 2, 0, 3, 4, 5, 6, 7},
                {0, 3, 4, 5, 0, 6, 1, 8, 2},
                {0, 0, 1, 0, 5, 8, 2, 0, 6},
                {0, 0, 8, 6, 0, 0, 0, 0, 1},
                {0, 2, 0, 0, 0, 7, 0, 5, 0},
                {0, 0, 3, 7, 0, 5, 0, 2, 8},
                {0, 8, 0, 0, 6, 0, 7, 0, 0},
                {2, 0, 7, 0, 8, 3, 6, 1, 5}};*/
        /*int[][] input = {{1, 0, 0, 7, 0, 8, 9, 0, 0}, //Example of medium puzzle
                {6, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 8, 6, 0, 1, 0, 7, 4},
                {0, 1, 0, 3, 0, 0, 0, 9, 6},
                {0, 0, 0, 0, 0, 0, 2, 0, 0},
                {8, 2, 4, 0, 0, 0, 7, 5, 0},
                {0, 0, 2, 8, 9, 0, 0, 0, 1},
                {3, 8, 0, 5, 2, 0, 0, 0, 0},
                {0, 0, 0, 0, 6, 3, 0, 0, 0}};*/
/*        int[][] input = {{0, 0, 7, 6, 8, 0, 0, 0, 1}, //Example of an easy puzzle
                {0, 0, 0, 0, 3, 0, 8, 0, 5},
                {5, 8, 0, 2, 0, 9, 0, 6, 0},
                {9, 3, 0, 0, 6, 0, 0, 2, 4},
                {6, 0, 8, 0, 4, 0, 5, 0, 9},
                {0, 0, 0, 1, 9, 0, 0, 8, 6},
                {3, 5, 4, 0, 2, 6, 0, 0, 0},
                {0, 0, 9, 0, 0, 0, 6, 0, 0},
                {0, 6, 2, 0, 5, 1, 0, 4, 0}};*/

        /*int[][] input = {{0, 0, 0, 3}, //Example of a 2x2 puzzle
                         {0, 0, 0, 2},
                         {3, 0, 0, 0},
                         {4, 0, 0, 0}};*/
        //make a check to see if the puzzle is right
        int lengthOfCells = input[0].length * input.length;
        int x = 0;
        int y = 0;
        int rowCounter = 1;
        int colCounter = 1;
        int boxCounter = 1;

        if (lengthOfCells == 16) {
            for (int i = 0; i < 16; i++) {
                if (i % 4 == 0 && i != 0) rowCounter++;
                if (i % 4 == 0) colCounter = 1;
                else colCounter++;
                if ((rowCounter == 1 || rowCounter == 2) && (colCounter == 1 || colCounter == 2)) boxCounter = 1;
                if ((rowCounter == 1 || rowCounter == 2) && (colCounter == 3 || colCounter == 4)) boxCounter = 2;
                if ((rowCounter == 3 || rowCounter == 4) && (colCounter == 1 || colCounter == 2)) boxCounter = 3;
                if ((rowCounter == 3 || rowCounter == 4) && (colCounter == 3 || colCounter == 4)) boxCounter = 4;

                startState.getCells().add(new Cell(i, rowCounter, colCounter, boxCounter, input[x][y]));
                //System.out.println("i: " + i + " row: " + rowCounter + " col: " + colCounter + " box: " + boxCounter + " value: " +  startState.getCells().get(i).getValue());

                if ((i + 1) % 4 == 0 && i != 0) {
                    y = 0;
                    x++;
                } else y++;

            }
        } else if (lengthOfCells == 36) {
            for (int i = 0; i < lengthOfCells; i++) {
                if (i % 6 == 0 && i != 0) rowCounter++;
                if (i % 6 == 0)
                    colCounter = 1;
                else
                    colCounter++;

                if ((rowCounter == 1 || rowCounter == 2) && (colCounter >= 1 && colCounter <= 3)) boxCounter = 1;
                if ((rowCounter == 1 || rowCounter == 2) && (colCounter >= 4 && colCounter <= 6)) boxCounter = 2;
                if ((rowCounter == 3 || rowCounter == 4) && (colCounter >= 1 && colCounter <= 3)) boxCounter = 3;
                if ((rowCounter == 3 || rowCounter == 4) && (colCounter >= 4 && colCounter <= 6)) boxCounter = 4;
                if ((rowCounter == 5 || rowCounter == 6) && (colCounter >= 1 && colCounter <= 3)) boxCounter = 5;
                if ((rowCounter == 5 || rowCounter == 6) && (colCounter >= 4 && colCounter <= 6)) boxCounter = 6;

                startState.getCells().add(new Cell(i, rowCounter, colCounter, boxCounter, input[x][y]));
                //System.out.println("i: " + i + " row: " + rowCounter + " col: " + colCounter + " box: " + boxCounter + " value: " +  startState.getCells().get(i).getValue());

                if ((i + 1) % 6 == 0 && i != 0) {
                    y = 0;
                    x++;
                } else y++;

            }
        } else if (lengthOfCells == 81) {
            for (int i = 0; i < lengthOfCells; i++) {
                if (i % 9 == 0 && i != 0) rowCounter++;
                if (i % 9 == 0)
                    colCounter = 1;
                else
                    colCounter++;

                if ((rowCounter >= 1 && rowCounter <= 3) && (colCounter >= 1 && colCounter <= 3)) boxCounter = 1;
                if ((rowCounter >= 1 && rowCounter <= 3) && (colCounter >= 4 && colCounter <= 6)) boxCounter = 2;
                if ((rowCounter >= 1 && rowCounter <= 3) && (colCounter >= 7 && colCounter <= 9)) boxCounter = 3;
                if ((rowCounter >= 4 && rowCounter <= 6) && (colCounter >= 1 && colCounter <= 3)) boxCounter = 4;
                if ((rowCounter >= 4 && rowCounter <= 6) && (colCounter >= 4 && colCounter <= 6)) boxCounter = 5;
                if ((rowCounter >= 4 && rowCounter <= 6) && (colCounter >= 7 && colCounter <= 9)) boxCounter = 6;
                if ((rowCounter >= 7 && rowCounter <= 9) && (colCounter >= 1 && colCounter <= 3)) boxCounter = 7;
                if ((rowCounter >= 7 && rowCounter <= 9) && (colCounter >= 4 && colCounter <= 6)) boxCounter = 8;
                if ((rowCounter >= 7 && rowCounter <= 9) && (colCounter >= 7 && colCounter <= 9)) boxCounter = 9;

                startState.getCells().add(new Cell(i, rowCounter, colCounter, boxCounter, input[x][y]));
                //System.out.println("i: " + i + " row: " + rowCounter + " col: " + colCounter + " box: " + boxCounter + " value: " +  startState.getCells().get(i).getValue());

                if ((i + 1) % 9 == 0 && i != 0) {
                    y = 0;
                    x++;
                } else y++;

            }
        }

        return startState;
    }

    @Override
    public String toString() {
        String result = "";
        int count = 1;
        if (getCells().size() == 16) {
            for (Cell cell : getCells()) {
                result += cell.getValue() + " ";
                if (count % 2 == 0) result += "| ";
                if (count % 4 == 0) result += "\n";
                if (count % 8 == 0) result += "-------------\n";
                count++;
            }
        } else if (getCells().size() == 36) {
            for (Cell cell : getCells()) {
                result += cell.getValue() + " ";
                if (count % 3 == 0) result += " | ";
                if (count % 6 == 0 && count != 0) result += "\n";
                if (count % 12 == 0 && count != 0) result += "----------------\n";
                count++;
            }
        } else if (getCells().size() == 81) {
            for (Cell cell : getCells()) {
                result += cell.getValue() + " ";
                if (count % 3 == 0) result += " | ";
                if (count % 9 == 0 && count != 0) result += "\n";
                if (count % 27 == 0 && count != 0) result += "--------------------------\n";
                count++;
            }
        }
        return result;
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
