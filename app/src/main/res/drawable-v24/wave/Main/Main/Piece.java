/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author luthf
 */
public class Piece {
    Piece[][] board = new Piece[8][8];
    public String color;
    private int positionx;
    private int positiony;
    
    public Piece(String color, int x, int y) {
        this.color = color;
        this.positionx = 0;
        this.positiony = 0;
        
        if (1 <= x && x <= 8) {
            this.positionx = x; 
        } 
        if (1 <= y && y <= 8) {
            this.positiony = y;
        }
    }
    
    public void setPosX(int x) {
        setPosition(x,this.positiony);
    }
    
    public void setPosY(int y) {
        setPosition(this.positionx ,y);
    }
    
    public boolean setPosition(int x, int y) {
        if (1 <= x && x <= 8 && 1 <= y && y <= 8) {
            if (1 <= x && x <= 8) {
                this.positionx = x; 
            } 
            if (1 <= y && y <= 8) {
                this.positiony = y;
            }
            return true;
            
        } else {
            return false;
            } 
    }
    
    public int getPositionX() {
        return this.positionx;
    }
    
    public int getPositionY() {
        return this.positiony;
    }
    
    public void cetak() {
        System.out.println("Ini Kelas Piece");
    }
    
    public String toString() {
        return "Piece";
    }
    
    
    
}
