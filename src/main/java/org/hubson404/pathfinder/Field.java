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

    @Override
    public String toString() {
        return "Field{" +
                "fieldType=" + fieldType +
                '}';
    }
}
