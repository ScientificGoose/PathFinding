package model;

import java.util.List;

public interface PathfindingAlgorithm {
    List<Node> findPath(int[][] map, Node start, Node end);
}
