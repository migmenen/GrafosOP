package Data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class GrafoDirigido {
	
	public class Arista{
		
		private int x;
		private int y;
		
		public Arista(int X, int Y)
		{
			x = X;
			y = Y;
		}
		
		public int getX() { return x; };
		public int getY() { return y; };
		
		public String toString() {
			return "[" + x + " " + y + "]";
		}
		
	}
	
	private List<List<Arista>> aristas;
	
	public GrafoDirigido() {
		aristas = new ArrayList<List<Arista>>();
	}
	
	public GrafoDirigido read()
	{
		GrafoDirigido g = new GrafoDirigido();
		
		File file = new File("C:\\Users\\Miguel\\git\\GrafosOP\\.git\\GrafosOP\\misc\\examplegrafos.txt"); 
		  
		BufferedReader br;
		try
		{
			br = new BufferedReader(new FileReader(file));
			String st; 
			int curIndex = 0;
			while ((st = br.readLine()) != null) 
			{
				int x,y;
				x = y = -1;
				g.aristas.add(new ArrayList<Arista>());
				for	(int i=0; i<st.length(); i++)
				{
					char c = st.charAt(i);
					try {
						int t = Integer.parseInt(c+"");
						if(x == -1)
							x = t;
						else 
						{
							y = t;
							g.aristas.get(curIndex).add(new Arista(x,y));
							x = y = -1;
						}
							
					}
					catch(Exception e) {
						//no hace na y lee el siguente
					}
				}
				curIndex++;
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}		
		return g;
	}

}
