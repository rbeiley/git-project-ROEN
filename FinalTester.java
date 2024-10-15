import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.NoSuchAlgorithmException;

public class FinalTester {
    public static void main(String[]args) throws NoSuchAlgorithmException, IOException
    {
        Git test = new Git();
        String author = "Christian Stubbeman";
        String message = "im testing a commit";
        test.initRepo();
        File stageFile = new File("./Staging");
        stageFile.createNewFile();
            Path blob2Path = stageFile.toPath();
            BufferedWriter writer = Files.newBufferedWriter(blob2Path);
            writer.write("Hi this is a test");
            writer.close();
        String commitHash = test.getInHead();
        test.Stage(stageFile.toPath() + "");
        test.commit(author, message);
        test.checkout(commitHash);
    }
}