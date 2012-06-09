/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spectrumobservatory;

/**
 *
 * @author Joshua
 */
public interface Node {
    public void setLocation(Coord location);
    public void setType(NodeType type);
    public void setID(int ID);
    
    
    public NodeType getType();
    public Coord getLocation();
    public int getID();
}
