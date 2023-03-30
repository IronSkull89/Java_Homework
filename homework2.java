import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.*;
import StringPack.Strings;


public class homework2 {
    public static void main(String[] args) {

        System.out.println(Strings.buildString(7, 'f','K'));

        buildFile("file.txt",100, "TEXT");
    }

    static void buildFile(String fileName, int n, String str) {
        Path path = Paths.get(fileName);
        if (Files.notExists(path)) {
            try {
                Files.createFile(path);
                try(FileWriter writer = new FileWriter(fileName, false))
                {
                    writer.write(Strings.buildString(n, str));
                    writer.flush();
                } catch(IOException ex) {
                    System.out.println(ex.getMessage());
                }
            } catch (Exception e) {
                System.out.println("При создании файа произошла ошибка" + e.getMessage());
            }
        }
    }
}
