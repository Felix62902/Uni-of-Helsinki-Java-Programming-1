/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class NewClass {

    public String name = "";
    public int games;
    public int wins;
    public int loss;

    public NewClass(String name) {
        this.name = name;
        this.games = 0;
        this.wins = 0;
        this.loss = 0;
    }

    public void addWin() {
        this.games++;
        this.wins++;
    }

    public void addLoss() {
        this.games++;
        this.loss++;
    }
}
