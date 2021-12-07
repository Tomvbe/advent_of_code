package day1;

import org.jetbrains.annotations.Nullable;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

import static org.apache.commons.lang3.Validate.notNull;

public class SonarSweeper {

    int findDepthIncreases(List<Integer> depthMeasurements) {
        return findDepthIncreases(new ArrayDeque<>(depthMeasurements), 0);
    }

    private int findDepthIncreases(@Nullable Deque<Integer> depthMeasurements, int count) {
        if (depthMeasurements == null || depthMeasurements.size() < 2) {
            return count;
        }

        final int firstValue = depthMeasurements.pollFirst();
        final int secondValue = notNull(depthMeasurements.peekFirst());
        if (firstValue < secondValue) {
            count++;
        }

        return findDepthIncreases(depthMeasurements, count);
    }
}
