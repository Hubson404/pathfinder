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

    public FieldType getCurrentFieldType() {
        return currentField.fieldType;
    }

    public void resetIndexPosition() {
        setRow(initialRow);
        setColumn(initialColumn);
    }

    public void moveRight() {
        setColumn(column + 1);
        getField();
    }

    public void moveLeft() {
        setColumn(column - 1);
        getField();
    }

    public void moveUp() {
        setRow(row - 1);
        getField();
    }

    public void moveDown() {
        setRow(row + 1);
        getField();
    }

    public int getInitialRow() {
        return initialRow;
    }

    public int getInitialColumn() {
        return initialColumn;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    @Override
    public String toString() {
        return "CurrentIndex{" +
                "row=" + row +
                ", column=" + column +
                ", currentFieldType=" + currentField.fieldType +
                '}';
    }
}
