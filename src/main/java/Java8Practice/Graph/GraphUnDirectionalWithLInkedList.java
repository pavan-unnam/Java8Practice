package Java8Practice.Graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class GraphUnDirectionalWithLInkedList {
	LinkedList<Integer> adj[];
	int v;
	int e;
	@SuppressWarnings("unchecked")
	GraphUnDirectionalWithLInkedList(int nodes) {
		this.v = nodes;
		this.e = 0;
		this.adj = new LinkedList[nodes];
		for(int i =0; i<nodes; i++) {
			this.adj[i] = new LinkedList<Integer>();
		}
	}
	
	public void addEdge(int i, int j) {
		this.adj[i].add(j);
		this.adj[j].add(i);
	}
	
	public String toPrint() {
		StringBuilder sb = new StringBuilder();
		sb.append(v+" vertexes, "+e+" edges "+"\n");
		for(int i =0; i<v; i++) {
			sb.append(i+ " : ");
			for(int w : adj[i]) {
				sb.append(w+ " ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}
	
	//breadth first search or level order search in tree
	public void bfs(int s) {
		boolean [] vistited =new boolean[v];
		
		Queue<Integer> qL = new LinkedList<Integer>();
		vistited[s]= true;
		qL.offer(s);
		
		while(!qL.isEmpty()) {
			int u = qL.poll();
			System.out.println(u+ " ");
			
			for(int v : adj[u]) {
				if(!vistited[v]) {
					vistited[v] = true;
					qL.offer(v);
				}
				
			}
		}
	}
	
	//depth first search with iteration 
	public void dfs(int s) {
		boolean [] vistited =new boolean[v];
		
		Stack<Integer> qL = new Stack<Integer>();
		qL.push(s);
		
		while(!qL.isEmpty()) {
			int u = qL.pop();
			if(!vistited[u]) {
				vistited[u] = true;
				System.out.println(u+ " ");
			
			for(int v : adj[u]) {
				if(!vistited[v]) {
					qL.push(v);
				}
				
			}
			}
		}
	}
	
	//dfs with recursion
	public void dfs() {
		boolean [] vistited =new boolean[v];
		for(int i =0; i<v; i++) {
			if(!vistited[i]) {
				dfs(i,vistited);
			}
		}
	}

	private void dfs(int i, boolean[] vistited) {
		vistited[i]=true;
		System.out.println(i + " ");
		
		for(int w : adj[v]) {
			if(!vistited[w]) {
				dfs(w,vistited);
			}
		}
		
	}

}
