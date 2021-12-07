package day2;

import java.io.IOException;
import java.util.List;

public class Day2App {

    public static void main(String[] args) throws IOException {
        final NavigationReader reader = new NavigationReader("src/main/resources/navigation_input.txt");
        final List<Command> commands = reader.read();
    }

}
