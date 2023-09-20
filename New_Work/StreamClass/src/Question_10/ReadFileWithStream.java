package Question_10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadFileWithStream {

    public static void main(String[] args) {

        try {
            Files.lines(Path.of("C:\\Users\\Asus\\Desktop\\Interview Questions\\MultiThreading.txt")).forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
