/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author luthf
 */
public class Pawn extends Piece{
    public Pawn(String color, int x, int y) {
        super(color,x ,y );
    }
    
    public void move() {
        setPosY(this.getPositionY() + 1);
    }
    
    public String toString() {
        return "Pawn";
    }
}
