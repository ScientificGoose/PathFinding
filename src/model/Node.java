package model;

public class Node{

    private int x;
    private int y;
    private Node parent;

    public Node(int x, int y){
        setX(x);
        setY(y);
        setParent(null);
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public Node getParent(){
        return parent;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public void setParent(Node parent){
        this.parent = parent;
    }
}
