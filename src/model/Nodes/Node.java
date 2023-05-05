package model.Nodes;

/**
 * The Node class helps x, y coordinates in a two-dimensional grid and a pointer to the parent node.
 */
public class Node{

    private int x;
    private int y;
    private Node parent;

    /**
     * Default constructor.
     * @param x (int) The x coordinate.
     * @param y (int) The y coordinate.
     */
    public Node(int x, int y){
        setX(x);
        setY(y);
        setParent(null);
    }

    /**
     * @return (int) The x coordinate.
     */
    public int getX(){
        return x;
    }

    /**
     * @return (int) The y coordinate.
     */
    public int getY(){
        return y;
    }

    /**
     * @return (Node) The parent of the Node.
     */
    public Node getParent(){
        return parent;
    }

    /**
     * @param x (int) the new x coordinate for the node.
     */
    public void setX(int x){
        this.x = x;
    }

    /**
     * @param y (int) the new Y coordinate for the node.
     */
    public void setY(int y){
        this.y = y;
    }

    /**
     * @param parent (Node) The new parent for the node.
     */
    public void setParent(Node parent){
        this.parent = parent;
    }
}
