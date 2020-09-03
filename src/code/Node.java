package code;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private State state;
    private Node parent;
    private int level;

    public Node(State state, Node parent, int level) {
        this.state = state;
        this.parent = parent;
        this.level = level;
    }

    public static List<Node> prevNode(List<Node> origList) {
        try {
            List<Node> clone = new ArrayList<>();

            for (Node node : origList) {
                clone.add((Node) node.clone());
            }

            return clone;
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e);
        }
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
