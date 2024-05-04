public class graph {

    class Node {
        int vertex;

        Node next;

        Node(int vertex) {

            this.next = null;
            this.vertex = vertex;
        }

        @Override
        public String toString() {

            return "" + this.vertex + " is the node here";
        }
    }

    int[][] adjMatrix;
    int V = 0;
    // V is the number of vertices
    int E = 0;
    // E is the number of Edges

    Node[] adjList;

    graph(int nodes) {
        V = nodes;
        this.adjMatrix = new int[nodes][nodes];

    }

    public void addEdge(int u, int v) {
        this.adjMatrix[u][v] = this.adjMatrix[v][u] = 1;
        E++;
    }

    public void removeEdge(int u, int v) {
        this.adjMatrix[u][v] = this.adjMatrix[v][u] = 0;
        E--;

    }

    public String toString() {

        String str = "";

        for (int i = 0; i < adjMatrix.length; i++) {
            str = str + i + "->";
            for (int j = 0; j < adjMatrix.length; j++) {

                if (adjMatrix[i][j] == 1) {
                    str += " " + j;
                }

            }
            str = str + "\n";
        }

        return str;
    }

    public void printGraph() {
        for (int i = 0; i < this.adjMatrix.length; i++) {
            for (int j = 0; j < this.adjMatrix.length; j++) {
                System.out.print(this.adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
        Object load = this;
        System.out.println(this);
    }

    public static void main(String[] args) {
        graph gf = new graph(4);
        gf.addEdge(0, 0);
        gf.addEdge(1, 0);
        gf.addEdge(0, 2);
        gf.addEdge(0, 3);
        gf.addEdge(2, 3);
        gf.addEdge(1, 2);
        gf.printGraph();
        System.out.println(gf);
    }
}
