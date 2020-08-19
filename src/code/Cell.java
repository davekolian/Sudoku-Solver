package code;

public class Cell {
    private int pos;
    private int row;
    private int col;
    private int box;
    private int value;

    public Cell(int pos, int row, int col, int box, int value) {
        this.pos = pos;
        this.row = row;
        this.col = col;
        this.box = box;
        this.value = value;
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

}
