package dev.georgiy.lifegame;

import dev.georgiy.lifegame.beans.Point;
import dev.georgiy.lifegame.beans.PointIntImpl;
import dev.georgiy.lifegame.utils.RoundUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@RestController
public class LifeGameService {

    @RequestMapping(value = "/nextGeneration")
    public Set<Point> getNextGeneration(@RequestBody PointIntImpl[] pointSet) {
        return RoundUtils.getNextGeneration(new HashSet<>(Arrays.asList(pointSet)));
    }

    @RequestMapping(value = "/health")
    public Boolean healthCheck() {
        return true;
    }

}
