package dev.georgiy.lifegame;

import dev.georgiy.lifegame.beans.Point;
import dev.georgiy.lifegame.beans.PointIntImpl;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class PointTest {
    @Test
    public void noNeighbourPoints(){
        Set<Point> pointsSeeded = new HashSet<>();
        Point point = new PointIntImpl(0,0);
        int neighborsCount = point.countNeighborsInSet(pointsSeeded);
        Assert.assertEquals(0, neighborsCount);
    }

    @Test
    public void oneNeighbourPoint(){
        Set<Point> pointsSeeded = new HashSet<>();
        pointsSeeded.add(new PointIntImpl(0,0));
        Point point = new PointIntImpl(0,1);
        Assert.assertEquals(1, point.countNeighborsInSet(pointsSeeded));
    }

    @Test
    public void twoNeighbourPoint(){
        Set<Point> pointsSeeded = new HashSet<>();
        pointsSeeded.add(new PointIntImpl(0,0));
        pointsSeeded.add(new PointIntImpl(1,2));
        Point point = new PointIntImpl(0,1);
        Assert.assertEquals(2, point.countNeighborsInSet(pointsSeeded));
    }

    @Test
    public void threeNeighbourPoint(){
        Set<Point> pointsSeeded = new HashSet<>();
        pointsSeeded.add(new PointIntImpl(0,0));
        pointsSeeded.add(new PointIntImpl(1,2));
        pointsSeeded.add(new PointIntImpl(-1,0));
        Point point = new PointIntImpl(0,1);
        Assert.assertEquals(3, point.countNeighborsInSet(pointsSeeded));
    }


    @Test
    public void getNeighbourPointsSize(){
        PointIntImpl point = new PointIntImpl(0,1);
        Set<Point> neighbours = point.listNeighbourPoints();
        Assert.assertEquals(8, neighbours.size());
    }

    @Test
    public void checkNeighbourPoints(){
        PointIntImpl point = new PointIntImpl(0,1);
        Set<Point> neighbours = point.listNeighbourPoints();
        Assert.assertTrue(neighbours.contains(new PointIntImpl(-1,2)));
        Assert.assertTrue(neighbours.contains(new PointIntImpl(0,2)));
        Assert.assertTrue(neighbours.contains(new PointIntImpl(1,2)));
        Assert.assertTrue(neighbours.contains(new PointIntImpl(-1,1)));
        Assert.assertTrue(neighbours.contains(new PointIntImpl(1,1)));
        Assert.assertTrue(neighbours.contains(new PointIntImpl(-1,0)));
        Assert.assertTrue(neighbours.contains(new PointIntImpl(0,0)));
        Assert.assertTrue(neighbours.contains(new PointIntImpl(1,0)));
    }
}
