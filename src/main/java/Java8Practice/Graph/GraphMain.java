package Java8Practice.Graph;

public class GraphMain {

	public static void main(String[] args) {
		GraphUnDirectional gud = new GraphUnDirectional(5);
		gud.addEdge(0, 1, 2);
		gud.addEdge(0, 2, 3);
		gud.addEdge(0, 3, 4);
		System.out.println(gud.toPrint());
		
		GraphUnDirectionalWithLInkedList gudLL = new GraphUnDirectionalWithLInkedList(5);
		
		gudLL.addEdge(0, 1);
		gudLL.addEdge(1, 2);
		gudLL.addEdge(2, 3);
		gudLL.addEdge(4, 3);
		System.out.println(gudLL.toPrint());
		gudLL.bfs(0); // breadth first search
		gudLL.dfs(0); // depth search first
		
		
		
	}

}
