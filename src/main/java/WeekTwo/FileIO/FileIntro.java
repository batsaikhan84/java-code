package WeekTwo.FileIO;

import java.io.File;
import java.io.IOException;

public class FileIntro {
    static void createFile() {
        File file = new File("Data.txt");
        try {
            boolean isFile = file.createNewFile();
            if (isFile) {
                System.out.println("File created");
            } else {
                System.out.println("File exists");
            }
        } catch (IOException e) {
            System.out.println("File not found!");
            e.getMessage();
        }
    }

    public static void main(String[] args) {
        createFile();
    }
}
