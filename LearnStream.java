
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;



public class LearnStream {

    public static void main(String[] args) throws IOException {

        File myFile = new File("D:\\Projects\\JavaProjects\\LearningCollections\\testFile.txt");
        if(myFile.exists())
            System.out.println("file exists");
        else
            myFile.createNewFile();


        // write to the file

        FileWriter fileWriter = new FileWriter(myFile, true);
        fileWriter.write("saarthak\n");
        fileWriter.write("prakash\n");
        fileWriter.close();


        Scanner sc = new Scanner(myFile);
        while(sc.hasNextLine())
            System.out.println(sc.nextLine());

        sc.close();
    }
}
