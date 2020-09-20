package org.hubson404.pathfinder;

import java.util.ArrayList;
import java.util.List;

public class PathLog {

    int boardWidth = 10;
    int boardHeight = 5;
    private final String startingField;
    private String[][] board;

    public List<String> path = new ArrayList<>();

    public PathLog(String startingFieldCoordinates) {
        startingField = startingFieldCoordinates;
        resetPath();
    }

    public void resetPath() {
        path.clear();
        path.add(startingField);
    }

    public void markPath() {

        board = setNewEmptyBoard();

        for (int i = 0; i < path.size(); i++) {

            String symbol = "";

            String[] coords = path.get(i).split(",");
            int currentY = Integer.parseInt(coords[0]);
            int currentX = Integer.parseInt(coords[1]);

            if (i < path.size() - 1) {
                String[] coordsNext = path.get(i + 1).split(",");
                int nextY = Integer.parseInt(coordsNext[0]);
                int nextX = Integer.parseInt(coordsNext[1]);

                if (currentY > nextY) {
                    symbol = "↑";
                }
                if (currentY < nextY) {
                    symbol = "↓";
                }
                if (currentX > nextX) {
                    symbol = "←";
                }
                if (currentX < nextX) {
                    symbol = "→";
                }
            }

            if (i == path.size() - 1) {
                symbol = "F";
            }
            board[currentY][currentX] = symbol;
        }
    }

    public void displayPath() {

        markPath();

        for (int i = 0; i < boardWidth * 4; i++) {
            System.out.print("-");
        }
        System.out.println("-");
        for (String[] row : board) {
            for (String field : row) {
                System.out.print("| " + field + " ");

            }
            System.out.println("|");
            for (int i = 0; i < boardWidth * 4; i++) {
                System.out.print("-");
            }
            System.out.println("-");
        }
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
