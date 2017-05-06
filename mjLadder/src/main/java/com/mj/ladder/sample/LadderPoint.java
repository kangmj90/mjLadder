package com.mj.ladder.sample;

public class LadderPoint {
    private int col;
    private int row;

    public LadderPoint() {

    }

    public LadderPoint(int row, int col) {
        this.col = col;
        this.row = row;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getCol() {
        return col;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getRow() {
        return row;
    }

    @Override
    public boolean equals(Object obj) {
        LadderPoint otherLadderPoint = (LadderPoint) obj;

        return (otherLadderPoint != null)
                && (this.col == otherLadderPoint.getCol())
                && (this.row == otherLadderPoint.getRow());

    }
}
