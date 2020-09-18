package org.hubson404.pathfinder;

public class CurrentIndex {

    private final int initialRow;
    private final int initialColumn;
    private int row;
    private int column;
    private Field currentField;
    private final Field[][] board;

    public CurrentIndex(int row, int column, Field[][] board) {
        this.row = row;
        this.column = column;
        this.initialRow = row;
        this.initialColumn = column;
        this.board = board;
        getField();
    }

    private void getField() {
        currentField = board[row][column];
    }
}
