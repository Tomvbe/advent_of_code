package day1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

record SonarReader(String pathUrl) {

    List<Integer> read() throws IOException {
        try (Stream<String> stream = Files.lines(Paths.get(pathUrl))) {
            return stream.map(Integer::valueOf).collect(Collectors.toList());
        }
    }

}
