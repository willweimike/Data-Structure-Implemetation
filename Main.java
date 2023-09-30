
public class Main {
    public static void main(String[] args) {
       // Graph graph = new Graph(5);
        // Graph graph = new Graph();

        // graph.addNode(new Node('A'));
        // graph.addNode(new Node('B'));
        // graph.addNode(new Node('C'));
        // graph.addNode(new Node('D'));
        // graph.addNode(new Node('E'));

        // graph.addEdge(0, 1);
        //graph.addEdge(1, 2);
        // graph.addEdge(1, 4);
        // graph.addEdge(2, 3);
        // graph.addEdge(2, 4);

        // graph.print();
        //graph.depthFirstSearch(0);

        //graph.breathFirstSearch(0);

        //System.out.println(graph.checkedge(0, 4));
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(new Node(5));
        tree.insert(new Node(1));
        tree.insert(new Node(9));
        tree.insert(new Node(2));
        tree.insert(new Node(7));
        tree.insert(new Node(3));
        tree.insert(new Node(6));
        tree.insert(new Node(4));
        tree.insert(new Node(8));

        tree.display();


    }

}