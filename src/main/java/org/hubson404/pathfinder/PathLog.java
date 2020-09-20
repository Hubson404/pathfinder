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
    }
}
