import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * General utility module that allows for reading input from a file
 */
public class InputReader {

    /**
     * Read in lines from a file name
     * @param fileName
     * @return
     * @throws FileNotFoundException
     */
    public static List<String> getLinesFromFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);

        List<String> fileLines = new ArrayList<>();

        while(scanner.hasNext()) {
            fileLines.add(scanner.nextLine());
        }

        scanner.close();
        return fileLines;
    }

}
