/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Fitbyte {
    private double  age;
    private double  restingHeartRate;

    public Fitbyte(int age, int restingHeartRate){
        this.age = age;
        this.restingHeartRate =restingHeartRate;

    }
    public double targetHeartRate(double percentageOfMaximum){
        return (((206.3 - (0.711 * age))- this.restingHeartRate) * percentageOfMaximum + this.restingHeartRate );
    }
    
}
