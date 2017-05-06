package com.mj.ladder.sample;

import java.util.ArrayList;
import java.util.List;

public class Ladder {

    private final static int DIRECTION_LEFT = 0;
    private final static int DIRECTION_RIGHT = 1;
    private final static int DIRECTION_DOWN = 2;
    private final static LadderPoint[] DIRECTION_INCREMENT = {new LadderPoint(0, -1)
                                                              , new LadderPoint(0, 1)
                                                              , new LadderPoint(1, 0)};
    private List<LadderPoint> ladderPoints = new ArrayList<LadderPoint>();
    private int lastRow = 0;
    LadderPoint currentPosition;
    LadderPoint lastPosition;
    LadderPoint pointOfLeftAtCurrentPoint;
    LadderPoint pointOfRightAtCurrentPoint;

    public LadderPoint getCurrentPosition() {
        return movePointWithClone(currentPosition, 0, 0);
    }

    public void setCurrentPosition(LadderPoint ladderPoint) {
        lastPosition = movePointWithClone(currentPosition, 0, 0);
        currentPosition = ladderPoint;

        int left_row_distance = DIRECTION_INCREMENT[DIRECTION_LEFT].getRow();
        int left_col_distance = DIRECTION_INCREMENT[DIRECTION_LEFT].getCol();
        pointOfLeftAtCurrentPoint = movePointWithClone(currentPosition, left_row_distance, left_col_distance);

        int right_row_distance = DIRECTION_INCREMENT[DIRECTION_RIGHT].getRow();
        int right_col_distance = DIRECTION_INCREMENT[DIRECTION_RIGHT].getCol();
        pointOfRightAtCurrentPoint = movePointWithClone(currentPosition, right_row_distance, right_col_distance);
    }

    public int countOfLines() {
        return this.ladderPoints.size();
    }

    public void addLineOfRightDirection(LadderPoint ladderPoint) {
        this.ladderPoints.add(ladderPoint);
        lastRow = Math.max(lastRow, ladderPoint.getRow());
    }

    public boolean isLeftMove() {
        return isSameLines(pointOfLeftAtCurrentPoint) && !isSameLastPosition(pointOfLeftAtCurrentPoint);
    }

    public boolean isRightMove() {
        return isSameLines(currentPosition) && !isSameLastPosition(pointOfRightAtCurrentPoint);
    }

    private boolean isSameLines(LadderPoint ladderPoint) {
        for (LadderPoint line : this.ladderPoints) {
            if (line.equals(ladderPoint))
                return true;
        }
        return false;
    }

    private boolean isSameLastPosition(LadderPoint ladderPoint) {
        return ladderPoint.equals(lastPosition);
    }

    public void moveLeft() {
        setCurrentPosition(pointOfLeftAtCurrentPoint);
    }

    private LadderPoint movePointWithClone(LadderPoint ladderPoint, int row_distance, int col_distance) {
        if (ladderPoint == null)
            return ladderPoint;
        return new LadderPoint(ladderPoint.getRow() + row_distance, ladderPoint.getCol() + col_distance);
    }

    public void moveRight() {
        setCurrentPosition(pointOfRightAtCurrentPoint);
    }

    public int play(int start_position) {
        this.lastPosition = null;
        setCurrentPosition(new LadderPoint(1, start_position));

        for (;currentPosition.getRow() <= this.lastRow;) {
            boolean isLeftMove = isLeftMove();
            boolean isRightMove = isRightMove();

            if (isLeftMove && isRightMove)
                moveDown();
            else if (isLeftMove)
                moveLeft();
            else if (isRightMove)
                moveRight();
            else
                moveDown();
        }
        return currentPosition.getCol();
    }

    public void clearLines() {
        this.ladderPoints.clear();
    }

    public void moveDown() {
        int row_distance = DIRECTION_INCREMENT[DIRECTION_DOWN].getRow();
        int col_distance = DIRECTION_INCREMENT[DIRECTION_DOWN].getCol();

        LadderPoint movedPointToDown = movePointWithClone(currentPosition, row_distance, col_distance);
        setCurrentPosition(movedPointToDown);
    }
}
