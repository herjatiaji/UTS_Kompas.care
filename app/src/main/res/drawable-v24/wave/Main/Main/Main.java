/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

/**
 *
 * @author luthf
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Nama : Muhammad Luthfi Azzahra Rammadhani
        // NIM  : 21/478530/SV/19332
        
        Game papan = new Game();
        
        Piece pion = new Pawn("White", 3,5);
        Piece benteng = new Fort("Black",7,2);
        Piece kuda = new Knight("White",3,3);
        
        papan.addPiece(pion);
        papan.addPiece(benteng);
        papan.addPiece(kuda);
        
        papan.printBoard();
        
        
        
        
    }
    
}
