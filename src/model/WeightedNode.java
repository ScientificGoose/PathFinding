package model;

/**
 * Weighted node is an extension to Node and contains the gScore and fScore of the node.
 * gScore is the cost of moving from the start node to the current node.
 * fScore is the estimated cost of moving from the start Node to the end Node. g + abs(a.x - b.x) + abs(a.y - b.y)
 */
public class WeightedNode extends Node implements Comparable<WeightedNode>{

    double gScore;
    double fScore;
    WeightedNode parent;

    /**
     * Default Constructor.
     * @param x (int) The x coordinate.
     * @param y (int) The y coordinate.
     */
    public WeightedNode(int x, int y){
        super(x, y);
        this.gScore = Double.POSITIVE_INFINITY;
        this.fScore = Double.POSITIVE_INFINITY;
        this.parent = null;
    }

    /**
     * @return (int) The x coordinate.
     */
    public int getX(){
        return super.getX();
    }

    /**
     * @return (int) The y coordinate.
     */
    public int getY(){
        return super.getY();
    }

    /**
     * @return (WeightedNode) The parent of the current node.
     */
    @Override
    public WeightedNode getParent(){
        return parent;
    }

    /**
     * @return (double) The gScore.
     */
    public double getGScore(){
        return gScore;
    }

    /**
     * @return (double) the fScore.
     */
    public double getFScore(){
        return fScore;
    }

    /**
     * @param x (int) the new x coordinate for the node.
     */
    public void setX(int x){
        super.setX(x);
    }

    /**
     * @param y (int) the new Y coordinate for the node.
     */
    public void setY(int y){
        super.setY(y);
    }

    /**
     * @param parent (WeightedNode) The new parent for the Node.
     */
    public void setParent(WeightedNode parent){
        this.parent = parent;
    }

    /**
     * @param gScore (double) The calculated gScore of the Node.
     */
    public void setGScore(double gScore){
        this.gScore = gScore;
    }

    /**
     * @param fScore (double) The calculated fScore of the Node.
     */
    public void setFScore(double fScore){
        this.fScore = fScore;
    }

    /**
     * Compares the fScore of the current node and the input node.
     * @param other the object to be compared.
     * @return (int) The result of the comparison of the fScore.
     */
    @Override
    public int compareTo(WeightedNode other) {
        return Double.compare(fScore, other.fScore);
    }
}
