package WeekTwo.FileIO;

import java.io.*;

public class FileIntro {
    //create a file
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
    //write a file
    static void writeFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Data.txt"))) {
            String message = "This is file writer";
            writer.write(message);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //read a file
    static void readFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader("Data.txt"))) {
            String currentLine;
            while ((currentLine = reader.readLine()) != null) {
                System.out.println(currentLine);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.getMessage();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Done reading the file");
        }
    }


    public static void main(String[] args) {
        createFile();
        writeFile();
        readFile();
    }
}
