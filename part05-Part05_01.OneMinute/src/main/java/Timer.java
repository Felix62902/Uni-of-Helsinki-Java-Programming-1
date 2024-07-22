/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Timer {
    private ClockHand hundreths;
    private ClockHand second;
    
    public Timer(){
        this.hundreths = new ClockHand(100);
        this.second = new ClockHand(60);   
    }
    
    public void advance(){
        this.hundreths.advance();
        if (this.hundreths.value() == 0) {
            this.second.advance();
        }
    }
    
    public String toString(){
        return (second.toString() + ':' + hundreths.toString());
    }
}

