package lab3;
import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class GraphIO implements Graph {	
	
	public void readFile(Graph g, String filename) throws IOException {
		
		try {
			File thisFile = new File(filename);
			Scanner scan = new Scanner(thisFile);
			String currentLine = scan.nextLine();
			int linesRead = 0;

			while (scan.hasNextLine()) {
				if (linesRead >= Integer.parseInt(currentLine)) {
					while (scan.hasNextLine()) {
						g.addEdge(Integer.parseInt(scan.next()), Integer.parseInt(scan.next()),	Integer.parseInt(scan.next()));
					}
				}
				else {
					while (scan.hasNextLine() && linesRead < Integer.parseInt(currentLine)) {
						g.addNode(Integer.parseInt(scan.next()), Integer.parseInt(scan.next()),	Integer.parseInt(scan.next()));
						linesRead++;
					}
				}
			}
			scan.close();

		} catch (NoSuchElementException e) {
			System.out.println(e);
		}
	}

	public void addNode(int id, int x, int y) {

	}

	public void addEdge(int id1, int id2, int weight) {

	}
}