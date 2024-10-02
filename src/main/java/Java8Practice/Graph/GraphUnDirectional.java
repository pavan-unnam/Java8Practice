package Java8Practice.Graph;

//collecrtion of vertexes and edes sames two diminsional array or adjascent matrix
public class GraphUnDirectional {
	int v;
	int e;
	int [][] adjMatrix; 
	
	
	public GraphUnDirectional(int nodes) {
		this.v = nodes;
		this.e = 0;
		adjMatrix = new int[nodes][nodes];
	}
	
	public void addEdge(int i, int j, int val) {
		this.adjMatrix[i][j] = val;
		this.adjMatrix[j][i] = val;
		e++;
	}
	
	public String toPrint() {
		StringBuilder sb = new StringBuilder();
		sb.append(v+" vertexes, "+e+" edges "+"\n");
		for(int i =0; i<v; i++) {
			sb.append(i+ " : ");
			for(int w : adjMatrix[i]) {
				sb.append(w+ " ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}

}
