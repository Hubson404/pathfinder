package org.hubson404.pathfinder;

public class Field {

    int row;
    int column;

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
