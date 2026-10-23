import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

class exp20 {
    public static void main(String[] args) {
        Path directory = Path.of("nio-demo");
        Path source = directory.resolve("source.txt");
        Path copy = directory.resolve("copy.txt");
        try {
            Files.createDirectories(directory);
            Files.writeString(source, "Java NIO file operations");
            System.out.println("Exists: " + Files.exists(source));
            System.out.println("Content: " + Files.readString(source));
            Files.copy(source, copy, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Copied file: " + copy.toAbsolutePath());
            Files.move(copy, directory.resolve("moved.txt"), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Files in directory:");
            try (var paths = Files.list(directory)) {
                paths.forEach(System.out::println);
            }
            Files.deleteIfExists(directory.resolve("moved.txt"));
            Files.deleteIfExists(source);
            Files.deleteIfExists(directory);
        } catch (IOException e) {
            System.out.println("NIO error: " + e.getMessage());
        }
    }
}
