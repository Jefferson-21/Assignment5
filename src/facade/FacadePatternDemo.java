/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facade;

import facade.ShapeMaker;

/**
 *
 * @author jeyarajjeyakumar
 * 
 * @version 1.0(03/24/2023)
 * 
 * @since (03/24/2023)
 */
public class FacadePatternDemo {
    public static void main(String[] args){
        
        ShapeMaker shapemaker = new ShapeMaker();
        
        shapemaker.drawCircle();
        shapemaker.drawRectangular();
        shapemaker.drawSquare();
        
    }

}