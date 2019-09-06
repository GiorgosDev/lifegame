package dev.georgiy.lifegame.beans;

import java.util.HashSet;
import java.util.Set;

public class Field {
    int width;
    int hight;

    public Set<Point> listNeighbourPoints(PointIntImpl point) {
        Set<Point> neighbours = new HashSet<>();
        //todo process borders
        neighbours.add(new PointIntImpl(point.getX()+1, point.getY()));
        neighbours.add(new PointIntImpl(point.getX()+1, point.getY()-1));
        neighbours.add(new PointIntImpl(point.getX()-1, point.getY()+1));
        neighbours.add(new PointIntImpl(point.getX()-1, point.getY()));
        neighbours.add(new PointIntImpl(point.getX()-1, point.getY()-1));
        neighbours.add(new PointIntImpl(point.getX()+1, point.getY()+1));
        neighbours.add(new PointIntImpl(point.getX(), point.getY()-1));
        neighbours.add(new PointIntImpl(point.getX(), point.getY()+1));
        return neighbours;
    }
}
