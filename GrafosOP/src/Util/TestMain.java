package Util;

import Data.GrafoDirigido;

public class TestMain {
	
	
	public static void main(String[] args)
	{
		GrafoDirigido g = new GrafoDirigido(3);
		g.read();
		
		//check if g has cycles.
		//if not, list vertex in topological order
		//if yes, list the set of vertex that compose the cycles
		
	}
}
 