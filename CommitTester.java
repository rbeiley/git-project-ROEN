import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.NoSuchAlgorithmException;

public class CommitTester {
    public static void main(String[]args) throws NoSuchAlgorithmException, IOException
    {
        Git test = new Git();
        test.initRepo();
        test.MakeHead();
        //Adding first commit tests
        File blobFile = new File("data");
        File blob2File = new File("dataBlob");
        File directoryFile = new File("directoryFile");
        File random = new File("directoryFile/random");
        File random2 = new File("directoryFile/random/random2.txt");
        if (!blobFile.exists()) {
            blobFile.createNewFile();
            Path blobPath = blobFile.toPath();
            BufferedWriter writer = Files.newBufferedWriter(blobPath);
            writer.write("derp");
            writer.close();
        }
        if (!blob2File.exists()) {
            blob2File.createNewFile();
            Path blob2Path = blob2File.toPath();
            BufferedWriter writer = Files.newBufferedWriter(blob2Path);
            writer.write("Taasdofefawefahawefhwaeog");
            writer.close();
        }
        //Sets up directories for first commit
        if (!directoryFile.exists()) {
            directoryFile.mkdir();
        }
        if (!random.exists()) {
            random.mkdir();
        }
        if (!random2.exists()) {
            random2.createNewFile();
            Path blobPath = random2.toPath();
            BufferedWriter writer = Files.newBufferedWriter(blobPath);
            writer.write("derp2");
            writer.close();
        }
        test.MakeSnapshot();
        test.MakeCommitFile("Christian Stubbeman", "this is the first commit");
    }
}
