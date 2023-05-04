package model;

public class ScoredNode extends Node implements Comparable<ScoredNode>{

    double gScore;
    double fScore;

    public ScoredNode(int x, int y){
        super(x, y);
        this.gScore = Double.POSITIVE_INFINITY;
        this.fScore = Double.POSITIVE_INFINITY;
    }

    public int getX(){
        return super.getX();
    }

    public int getY(){
        return super.getY();
    }

    public Node getParent(){
        return super.getParent();
    }

    public double getGScore(){
        return gScore;
    }

    public double getFScore(){
        return fScore;
    }

    public void setX(int x){
        super.setX(x);
    }

    public void setY(int y){
        super.setY(y);
    }

    public void setParent(Node parent){
        super.setParent(parent);
    }

    public void setGScore(double gScore){
        this.gScore = gScore;
    }

    public void setFScore(double fScore){
        this.fScore = fScore;
    }

    @Override
    public int compareTo(ScoredNode other) {
        return Double.compare(fScore, other.fScore);
    }
}
