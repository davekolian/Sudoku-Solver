package code;

import java.util.List;

public class Cell implements Cloneable{
    private int pos;
    private int row;
    private int col;
    private int box;
    private int value;
    private int predictAmt;
    private int[] predictVals;

    public Cell(int pos, int row, int col, int box, int value) {
        this.pos = pos;
        this.row = row;
        this.col = col;
        this.box = box;
        this.value = value;
    }

    public Cell(int pos, int row, int col, int box, int value, int predictAmt, int[] predictVals) {
        this.pos = pos;
        this.row = row;
        this.col = col;
        this.box = box;
        this.value = value;
        this.predictAmt = predictAmt;
        this.predictVals = predictVals;
    }

    public int getPos() {
        return pos;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public int getBox() {
        return box;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getPredictAmt() {
        return predictAmt;
    }

    public void setPredictAmt(int predictAmt) {
        this.predictAmt = predictAmt;
    }

    public int[] getPredictVals() {
        return predictVals;
    }

    public void setPredictVals(int[] predictVals) {
        this.predictVals = predictVals;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Cell clone = (Cell)super.clone();
        return clone;
    }
}
