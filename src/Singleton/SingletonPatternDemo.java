/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton;

/**
 *
 * @author jeyarajjeyakumar
 * 
 *  
 * @version 1.0(03/24/2023)
 * 
 * 
 * @since today
 */
public class SingletonPatternDemo {
    public static void main(String[] args){
        
        //illegal construct
        //compile Time Error: The constructor SingleObject() is not visible
        //SingletonObject = new SingletonObject();
        
        //Get the only object available
        
        SingletonObject object = SingletonObject.getInstance();
        
        //show the message
        object.showMessage();
    }
    
}
