package code;

import java.util.ArrayList;
import java.util.List;

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

    public void setParent(Node parent) {
        this.parent = parent;
    }

}
