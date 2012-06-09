package spectrumobservatory;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * This class handles all of the nodes.
 * It adds nodes deletes nodes and returns subsets
 * 
 * @author Joshua
 */
public class NodeHandler {
    private List<Node> nodeList;
    private Map<Integer, Node> nodeMap;
    
    public NodeHandler() {
        nodeList = new ArrayList<Node>();
        nodeMap = new HashMap<Integer, Node>();
    }
    
    /**
     * add a node to set of nodes
     * 
     * @param node node to add
     * @return  true for success and false for failure 
     */
    public boolean addNode(Node node) {
        // find a new unused id
        int i = 0;
        boolean found = false;
        while(i < 400000000) {
            if (!nodeMap.containsKey(i)) {
                nodeMap.put(i, node);
                return true;
            }
            i++;
        }
       
        return false;
    }
    
    /**
     * remove a node by the exact node
     * 
     * @param node node to remove
     * @return true for success false otherwise. 
     */
    public boolean removeNode(Node node) {
        for (Node n : nodeMap.values()) {
            if (n.equals(node)) {
                nodeMap.remove(n.getID());
                return true;
            }
        }
     
        return false;
    }
    
    /**
     * remove a node by ID
     * @param ID ID of node to remove
     * @return true if success and false otherwise
     */
    public boolean removeNode(int ID) {
        return nodeMap.remove(ID) != null;
    }
    
    /**
     * Get a list of nodes whose range are contained in Freqrange
     */
    public List<Node> getNodesInFRange(FreqRange range ) {
        List<Node> newList = new ArrayList<Node>();
        for(Node n : nodeMap) {
            if (n.get)
        }
      
        return newList;
    }
    
}
