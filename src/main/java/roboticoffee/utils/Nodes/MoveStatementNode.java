package roboticoffee.utils.Nodes;

public class MoveStatementNode extends Node {
    private final Node distance;

    public MoveStatementNode(Node distance, int lineNumber) {
        super(lineNumber);
        this.distance = distance;
    }

    public Node getDistance() {
        return distance;
    }

}
