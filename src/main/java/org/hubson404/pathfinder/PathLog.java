package org.hubson404.pathfinder;

import java.util.ArrayList;
import java.util.List;

public class PathLog {

    int boardWidth = 10;
    int boardHeight = 5;
    private final String startingField;

    public List<String> path = new ArrayList<>();

    public PathLog(String startingFieldCoordinates) {
        startingField = startingFieldCoordinates;
        resetPath();
    }

    public void resetPath() {
        path.clear();
        path.add(startingField);
    }

    private String[][] setNewEmptyBoard() {
        String[][] board = new String[boardHeight][boardWidth];
        for (int i = 0; i < boardHeight; i++) {
            for (int k = 0; k < boardWidth; k++) {
                board[i][k] = " ";
            }
        }
        return board;
    }
}
