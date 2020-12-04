package fileReader;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReader3000 {

	public static void main(String[] args) throws IOException { // this FileNotFoundException (line14) means
																// the file in line 13 'might' not be
																// available

		// http://textfiles.com/100/captmidn.txt

		File file = new File("C:/Users/jpike/Documents/MyJavaPractice/JavaBasics_II/fileReader/captmidn.txt");
		Scanner scan = new Scanner(file);

		String fileContent = "<<< THIS IS A NEW FILE MADE BY ME IN JAVA >>>";

		while (scan.hasNextLine()) {
			fileContent = fileContent.concat(scan.nextLine() + "\n");
		}

		FileWriter writer = new FileWriter(
				"C:/Users/jpike/Documents/MyJavaPractice/JavaBasics_II/fileReader/newFile.txt"); // had to add/import a
																									// "throws
																									// declaration"
		writer.write(fileContent);
		writer.close();
	}

}
