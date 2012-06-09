/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spectrumobservatory;

/**
 * This class defines a user node.  User nodes have locations and types 
 * and ranges.
 * 
 * @author Joshua
 */
public class User implements Node {
    
    private NodeType type;
    private Coord location;
    private FreqRange freqR;
    private Integer ID;

    /** 
     * constructor
     * 
     * @param type type of node
     * @param location where on earth is the node
     * @param fr frequency range the node is using
     */
    public User(NodeType type, Coord location, FreqRange fr) {
        this.location = location;
        this.type = type;
        freqR = fr;
    }
    
    @Override
    /** 
     * set the nodes type
     * 
     */
    public void setType(NodeType type) {
        this.type = type;
    }

    
    @Override
    /** 
     * set the nodes location
     * 
     */
    public void setLocation(Coord location) {
        this.location = location;
    }
    
    /** 
     * return the node type
     * 
     * @return the type of node 
     */
    public NodeType getType() {
        return type;
    }
    
    // get the node location
    public Coord getLocation() {
        return location;
    }
    
    /**
     * set the frequency range
     * @param freqR range
     */
    public void setFreqRange(FreqRange freqR) {
        this.freqR = freqR;
    }
    
    /**
     * return the frequency range
     * @return the range
     */
    public FreqRange getFreqRange() {
        return freqR;
    }

    @Override
    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public int getID() {
        return ID;
    }
    
}

