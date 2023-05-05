package model.Nodes;

public class BFSNode extends Node{


    /**
     * Default constructor.
     *
     * @param x (int) The x coordinate.
     * @param y (int) The y coordinate.
     */
    public BFSNode(int x, int y) {
        super(x, y);
    }

    /**
     * Calculates the Euclidean distance between the current node and the input node.
     * @param node (BFSNode) The node to be compared.
     * @return (double) The Euclidean distance between the two nodes.
     */
    public double calculateDistance(BFSNode node){
        int dx = Math.abs(getX() - node.getX());
        int dy = Math.abs(getY() - node.getY());
        return Math.sqrt(dx * dx + dy * dy);
    }

    /**
     * compares the X and Y values of the current node and the input node to see if they are equal.
     * @param obj The object to be compared.
     * @return (boolean) If the input object is equal to the current node.
     */
    @Override
    public boolean equals(Object obj){
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        if (this == obj) return true;

        Node other = (BFSNode) obj;
        return getX() == other.getX() && getY() == other.getY();
    }

    /**
     * @return (int) The hashcode calculated from the X and Y coordinates.
     */
    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * getX() + result;
        result = 31 * getY() + result;
        return result;
    }
}
