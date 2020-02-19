

import java.io.IOException;

public class Main {
	
	public static void main(String[] args) {
		GraphIO g = new GraphIO();
		try {
			g.readFile(g, "gridgraph.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
