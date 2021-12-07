package day2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

record NavigationReader(String pathUrl) {
    // TODO: 07.12.21 clean up
    List<Command> read() throws IOException {
        try (Stream<String> stream = Files.lines(Paths.get(pathUrl))) {
            return stream.map(x -> {
                final String[] commandString = x.trim().split(" ");
                return new Command(
                        Direction.from(commandString[0]).orElseThrow(() -> new RuntimeException()),
                        Integer.parseInt(commandString[1]));
            }).collect(Collectors.toList());
        }
    }
}
