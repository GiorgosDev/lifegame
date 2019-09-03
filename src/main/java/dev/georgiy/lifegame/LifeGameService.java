package dev.georgiy.lifegame;

import dev.georgiy.lifegame.beans.Point;
import dev.georgiy.lifegame.utils.RoundUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
public class LifeGameService {

    @RequestMapping(value = "/nextGeneration")
    public Set<Point> getNextGeneration(Set<Point> pointSet) {
        return RoundUtils.getNextGeneration(pointSet);
    }

}
