import java.io.*;
import java.lang.reflect.Field;
import java.util.Scanner;

public class FileCopy {
    public static Scanner in;
    public static String name;
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("D:\\test.txt");
        fileWriter.write("Some very important massege");
        fileWriter.close();
        try (FileInputStream file = new FileInputStream("D:\\test.txt")) {
            FileOutputStream out = createTXT();
            copyFromFile(file, out);
        }
    }

    private static FileOutputStream createTXT() throws FileNotFoundException {
        in = new Scanner(System.in);
        System.out.println("Enter file name:txt");
        name = in.nextLine();
        FileOutputStream fileCreateTest = new FileOutputStream("D:\\" + name + ".txt");
        return fileCreateTest;
    }

    private static void copyFromFile(FileInputStream inFile, FileOutputStream outFile) throws IOException {
        while (inFile.available() > 0){
            int data = inFile.read();
            outFile.write(data);
        }
        inFile.close();
        outFile.close();
    }
}
