package org.hubson404.pathfinder;

public class Field {

    FieldType fieldType;

    public Field(FieldType fieldType) {
        this.fieldType = fieldType;
    }

    @Override
    public String toString() {
        return "Field{" +
                "fieldType=" + fieldType +
                '}';
    }
}
