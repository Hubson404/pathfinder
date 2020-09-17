package org.hubson404.pathfinder;

import java.util.Arrays;

import static org.hubson404.pathfinder.FieldType.*;


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
                board[i][k] = new Field(i, k, Empty);
            }
        }
    }

    public void showBoard() {
        for (int i = 0; i < boardWidth * 4; i++) {
            System.out.print("-");
        }
        System.out.println("-");
        for (Field[] row : board) {
            for (Field field : row) {
                if (field.fieldType == Empty) {
                    System.out.print("|   ");
                }
                if (field.fieldType == Start) {
                    System.out.print("|SRT");
                }
                if (field.fieldType == Finish) {
                    System.out.print("|FNS");
                }
                if (field.fieldType == Obstacle) {
                    System.out.print("|-#-");
                }
            }
            System.out.println("|");
            for (int i = 0; i < boardWidth * 4; i++) {
                System.out.print("-");
            }
            System.out.println("-");
        }
    }

    public void placeStartField(int row, int col) {
        board[row - 1][col - 1] = new Field(row, col, Start);
    }

    public void placeFinishField(int row, int col) {
        board[row - 1][col - 1] = new Field(row, col, Finish);
    }

    public void placeObstacleField(int row, int col) {
        board[row - 1][col - 1] = new Field(row, col, Obstacle);
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
