package day2;

import org.jetbrains.annotations.Nullable;

import java.util.Arrays;
import java.util.Optional;

public enum Direction {
    FORWARD, DOWN, UP;

    static Optional<Direction> from(@Nullable String directionString) {
        return Arrays.stream(values())
                .filter(directionName -> directionName.name().toLowerCase().equals(directionString))
                .findFirst();
    }
}
