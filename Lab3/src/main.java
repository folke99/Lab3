import java.io.FileNotFoundException;
import java.io.IOException;

public class main {
	public main() throws FileNotFoundException 
	{
		GraphIO g = new GraphIO();
		try {
			g.readFile(g, "gridgraph.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
