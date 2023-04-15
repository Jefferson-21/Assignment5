/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facade;

import facade.Circle;
import facade.Rectangular;
import facade.Shape;
import facade.Square;

/**
 *
 * @author jeyarajjeyakumar
 * 
 * @version 1.0(03/24/2023)
 * 
 * @since (03/24/2023)
 */
public class ShapeMaker {
    private final Shape Circle;
    private final Shape Rectangular;
    private final Shape Square;
    
    public ShapeMaker(){
        Circle= new Circle();
        Rectangular = new Rectangular();
        Square = new Square();
        
    }

   public void drawCircle(){
       Circle.draw();
   }
   public void drawRectangular(){
       Rectangular.draw();
   }
   public void drawSquare(){
       Square.draw();
   }
   
   
    
    
    
}
