package day1;

import java.io.IOException;
import java.util.List;

public class Day1App {

    public static void main(String[] args) throws IOException {
        final SonarReader reader = new SonarReader("src/main/resources/depth_input.txt");
        final List<Integer> depthReadings = reader.read();

        final int depthIncreases = new SonarSweeper().findDepthIncreases(depthReadings);

        System.out.printf("There are %d depth increases", depthIncreases);
    }

}
