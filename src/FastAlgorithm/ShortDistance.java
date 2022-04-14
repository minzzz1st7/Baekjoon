package FastAlgorithm;

import java.util.*;
import java.util.PriorityQueue;

public class ShortDistance {

    public static class Edge implements Comparable<Edge> {
        public int distance;
        public String vertex;

        public Edge(int distance, String vertex) {
            this.distance = distance;
            this.vertex = vertex;
        }

        // System.out.println() 으로 객체 자체 출력시,
        public String toString() {
            return "vertex: " + this.vertex + ", distance: " + this.distance;
        }

        @Override
        public int compareTo(Edge edge) {
            return this.distance - edge.distance;
        }
    }


    public static class DijkstraPath {
        public HashMap<String, Integer> dijkstraFunc(HashMap<String, ArrayList<Edge>> graph, String start) {
            Edge edgeNode, adjacentNode;
            ArrayList<Edge> nodeList;
            int currentDistance, weight, distance;
            String currentNode, adjacent;
            HashMap<String, Integer> distances = new HashMap<String, Integer>();
            for (String key : graph.keySet()) {
                distances.put(key, Integer.MAX_VALUE);
            }


            distances.put(start, 0);

            PriorityQueue<Edge> priorityQueue = new PriorityQueue<Edge>();
            priorityQueue.add(new Edge(distances.get(start), start));

            // 알고리즘 작성
            while (priorityQueue.size() > 0) {
                edgeNode = priorityQueue.poll();
                currentDistance = edgeNode.distance;
                currentNode = edgeNode.vertex;
                System.out.println( "currentNode :    " + currentNode);

                if (distances.get(currentNode) < currentDistance) {
                    continue;
                }

                nodeList = graph.get(currentNode);
                System.out.println("nodeList: " + nodeList);
                for (int index = 0; index < nodeList.size(); index++) {
                    adjacentNode = nodeList.get(index);
                    System.out.println("adjacentNode:   "+ adjacentNode);
                    adjacent = adjacentNode.vertex;
                    weight = adjacentNode.distance;
                    distance = currentDistance + weight;

                    if (distance < distances.get(adjacent)) {
                        distances.put(adjacent, distance);
                        priorityQueue.add(new Edge(distance, adjacent));
                    }
                }
            }
            return distances;
        }
    }


    public static void  main(String[] args) {
        HashMap<String, ArrayList<Edge>> graph = new HashMap<String, ArrayList<Edge>>();
        graph.put("A", new ArrayList<Edge>(Arrays.asList(new Edge(8, "B"), new Edge(1, "C"), new Edge(2, "D"))));
        graph.put("B", new ArrayList<Edge>());
        graph.put("C", new ArrayList<Edge>(Arrays.asList(new Edge(5, "B"), new Edge(2, "D"))));
        graph.put("D", new ArrayList<Edge>(Arrays.asList(new Edge(3, "E"), new Edge(5, "F"))));
        graph.put("E", new ArrayList<Edge>(Arrays.asList(new Edge(1, "F"))));
        graph.put("F", new ArrayList<Edge>(Arrays.asList(new Edge(5, "A"))));


        DijkstraPath dObject = new DijkstraPath();
        dObject.dijkstraFunc(graph, "A");

    }


}


