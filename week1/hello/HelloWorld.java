import edu.duke.FileResource;

public class HelloWorld {
	public void runHello () {
		FileResource res = new FileResource("hello_unicode.txt");       // Open up the file
		for (String line : res.lines()) {                               // for loop on each lines
			System.out.println(line);                                   // print line
		}
	}
}
