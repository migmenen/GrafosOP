package Data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class GrafoDirigido {
	
	private final int V;
	private final List<List<Integer>> adj;
	
	public GrafoDirigido(int Vertices) 
	{
		V = Vertices;
		adj = new ArrayList<List<Integer>>();
		for(int i=1; i<=V; i++)
			adj.add(new ArrayList<Integer>());
	}
	
	
	//check if g has cycles.
	//if not, list vertex in topological order
	//if yes, list the set of vertex that compose the cycles
		
	public List<List<Integer>> getCycles(GrafoDirigido g)
	{
		//List<List<Integer>> list = new ArrayList<List<Integer>>();
		
		boolean[] visited, recStack;
		visited = new boolean[g.V];
		recStack = new boolean[g.V];

		for (int i = 0; i < g.V; i++) 
		{
			visited[i] = false;
			recStack[i] = false;
		}
		
		return recCycleCalc(g.V, visited, recStack);
		
		
		//return list;		
	}
	
	private List<List<Integer>> recCycleCalc(int indice, boolean[] visitados, boolean[] stack)
	{
		return null;
	}
	
	public GrafoDirigido read()
	{
		
		GrafoDirigido g = null;
		
		//portatil
		//File file = new File("C:\\Users\\Miguel\\git\\GrafosOP\\.git\\GrafosOP\\misc\\examplegrafos.txt"); 
		//tocho
		File file = new File("C:\\Users\\migue\\git\\GrafosOP\\GrafosOP\\misc\\examplegrafos.txt"); 

		BufferedReader br;
		try
		{
			br = new BufferedReader(new FileReader(file));
			String st; 
			int curIndex = 0;
			
			st = br.readLine();
			g = new GrafoDirigido(Integer.parseInt(st));
			
			while ((st = br.readLine()) != null && curIndex < g.V) 
			{
				for	(int i=0; i<st.length(); i++)
				{
					char c = st.charAt(i);
					try 
					{
						int t = Integer.parseInt(c+"");
						g.adj.get(curIndex).add(t);						
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
