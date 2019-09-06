package dev.georgiy.lifegame.beans;

import java.util.Set;

public interface Point {
    Integer getX();
    Integer getY();
    int countNeighborsInSet(Set<Point> pointsSeeded);
    Set<Point> listNeighbourPoints();
}
