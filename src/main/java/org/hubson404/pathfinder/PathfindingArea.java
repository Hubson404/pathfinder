package org.hubson404.pathfinder;

import java.util.Arrays;


public class PathfindingArea {

    private final int boardHeight;
    private final int boardWidth;

    private final Field[][] board;

    public PathfindingArea(int boardWidth, int boardHeight) {
        this.boardWidth = boardWidth;
        this.boardHeight = boardHeight;
        this.board = new Field[this.boardHeight][this.boardWidth];
    }

    public Field[][] getBoard() {
        return board;
    }

    @Override
    public String toString() {
        return "PathfindingArea{" +
                "boardHeight=" + boardHeight +
                ", boardWidth=" + boardWidth +
                ", board=" + Arrays.toString(board) +
                '}';
    }
}
