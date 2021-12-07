package day1;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class SonarSweeper {

    int findDepthIncreases(@NotNull List<Integer> depthMeasurements, int depth) {
        if (depthMeasurements.size() < depth + 1) {
            return 0;
        }

        int count = 0;

        for (int i = 0; i < depthMeasurements.size() - depth; i++) {
            int first = depthMeasurements.get(i);
            int second = depthMeasurements.get(i + depth);

            if (second > first) {
                count++;
            }
        }

        return count;
    }

}
