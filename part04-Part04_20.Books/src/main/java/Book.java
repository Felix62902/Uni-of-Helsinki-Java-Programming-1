/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Book {
    private String title;
    private int pages;
    private int pub;
    
    public Book(String t, int p, int pub){
        this.title = t;
        this.pages = p;
        this.pub =pub;
    }
    
    public String getTitle(){
        return this.title;
    }
    
    @Override
    public String toString() {
        return this.title + ", " + this.pages + " pages, " + this.pub;
    }
    
}
