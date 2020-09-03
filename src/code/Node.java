package code;

public class Node {
    private State state;
    private Node parent;

    public Node(State state, Node parent) {
        this.state = state;
        this.parent = parent;
    }

    public State getState() {
        return state;
    }

    public Node getParent() {
        return parent;
    }
    
}
