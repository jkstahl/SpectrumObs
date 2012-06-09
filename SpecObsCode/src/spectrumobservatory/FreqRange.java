/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spectrumobservatory;

/**
 * This class stores frequency range data for nodes in the network
 * 
 * @author Joshua
 */
public class FreqRange {
    private double lowFreq;
    private double highFreq;
    
    /**
     * contructor using lowFreq and highFreq
     */
    public FreqRange(double lowFreq, double highFreq) {
        this.lowFreq = lowFreq;
        this.highFreq = highFreq;
    }
    
    /**
     * 
     * constructor using center frequency and bandwidth
     */
    public FreqRange(double center, float bandWidth) {
        lowFreq = center - bandWidth / 2.0;
        highFreq = center + bandWidth / 2.0;
    }
    
    /**
     * 
     * return the center frequency of the range
     */
    public double getCenterFreq() {
        return (highFreq - lowFreq) / 2.0;
    }
    
    /** 
     * return the bandwidth of the range
     * 
     * @return bandwidth of the range 
     */
    public double getBandWidth() {
        return highFreq - lowFreq;
    }
    
    /** 
     * return the low frequency of the range
     * 
     * @return the low frequency
     */
    public double getLowFreq() {
        return lowFreq;
    }
    
    /** 
     * return the high frequency of the range.
     * 
     * @return the high frequency 
     */
    public double getHighFreq() {
        return highFreq;
    }
    
    /** 
     * set the bandwidth of the range.  center at the current center frequency.
     * 
     * @param BW - the band width to set 
     */
    public void setBandWidth(double BW) {
        double center = getCenterFreq();
        lowFreq = center - BW / 2.0;
        highFreq = center + BW / 2.0;
    }
    
    /** 
     * set the center frequency of the range. Give it the current bandwidth.
     * 
     * @param center the center frequency  
     */
    public void setCenter(double center) {
        double BW = getBandWidth();
        lowFreq = center - BW / 2.0;
        highFreq = center + BW / 2.0;
    }
    
    /** 
     * set the low frequency of the range
     * 
     * @param low the low frequency 
     */
    public void setLowFreq(double low) {
        lowFreq = low;
    }
    
    /** 
     * set the high frequency of the range.
     * 
     * @param high the high frequency 
     */
    public void setHighFreq(double high) {
        highFreq = high;
    }
    
    /**
     * return true if this frequency contains r
     * @param r to compare
     * @return true if it is and false otherwise
     */
    public boolean contains(FreqRange r) {
        return r.getLowFreq() >= getLowFreq() && r.getHighFreq() <= getHighFreq();
    }
}