package org.hubson404.pathfinder;

public class Field {

    private final int row;
    private final int column;
    private boolean isRightEmpty;
    private boolean isLeftEmpty;
    private boolean isTopEmpty;
    private boolean isBottomEmpty;

    FieldType fieldType;

    public Field(int row, int col, FieldType fieldType) {
        this.row = row;
        this.column = col;
        this.fieldType = fieldType;
    }

    public void checkNextRightField(Field[][] board) {
        isRightEmpty = checkAdjecentField(DirectionType.RIGHT, board);
    }

    public void checkNextLeftField(Field[][] board) {
        isLeftEmpty = checkAdjecentField(DirectionType.LEFT, board);
    }

    public void checkNextTopField(Field[][] board) {
        isTopEmpty = checkAdjecentField(DirectionType.UP, board);
    }

    public void checkNextBottomField(Field[][] board) {
        isBottomEmpty = checkAdjecentField(DirectionType.DOWN, board);
    }

    private boolean checkAdjecentField(DirectionType direction, Field[][] board) {
        int nextRow = row;
        int nextColumn = column;

        if (direction == DirectionType.RIGHT) {
            nextColumn = +1;
        }
        if (direction == DirectionType.LEFT) {
            nextColumn--;
        }
        if (direction == DirectionType.UP) {
            nextRow++;
        }
        if (direction == DirectionType.DOWN) {
            nextColumn--;
        }
        Field adjecentField = board[nextRow][nextColumn];

        return adjecentField.fieldType == FieldType.EMPTY;
    }

    @Override
    public String toString() {
        return "Field{" +
                "fieldType=" + fieldType +
                '}';
    }
}
