package org.hubson404.pathfinder;

import java.util.Arrays;

import static org.hubson404.pathfinder.FieldType.Empty;
import static org.hubson404.pathfinder.FieldType.StartField;


public class PathfindingArea {

    private final int boardHeight;
    private final int boardWidth;

    private final Field[][] board;

    public PathfindingArea(int boardWidth, int boardHeight) {
        this.boardWidth = boardWidth;
        this.boardHeight = boardHeight;
        this.board = new Field[this.boardHeight][this.boardWidth];
        fillBoardWithEmptyFields(this.board);
    }

    private void fillBoardWithEmptyFields(Field[][] board) {
        for (int i = 0; i < boardHeight; i++) {
            for (int k = 0; k < boardWidth; k++) {
                board[i][k] = new Field(Empty);
            }
        }
    }

    public void placeStartField(int row, int col) {
        board[row-1][col-1] = new Field(StartField);
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
