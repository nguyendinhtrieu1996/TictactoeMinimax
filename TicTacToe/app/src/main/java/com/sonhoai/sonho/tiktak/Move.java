package com.sonhoai.sonho.tiktak;

/**
 * Created by sonho on 3/21/2018.
 */
//đại diện cho 1 nước đi
public class Move {
    private int rowIndex;
    private int colIndex;

    public Move() {
    }

    public Move(int rowIndex, int colIndex) {
        this.rowIndex = rowIndex;
        this.colIndex = colIndex;
    }

    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }

    public int getColIndex() {
        return colIndex;
    }

    public void setColIndex(int colIndex) {
        this.colIndex = colIndex;
    }
}
