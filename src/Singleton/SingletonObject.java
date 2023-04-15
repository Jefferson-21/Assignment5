/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton;

/**
 * A class that allows you to create only one instance of it
 *
 * @author jefferson
 *  
 * @version 1.0(03/24/2023)
 * 
 * @since (03/24/2023)
 */
public class SingletonObject {
    //create an object of SingleObject
    private static SingletonObject instance= new SingletonObject();
    
    //make the constructor private so that this class cannot be instantialted
    private SingletonObject(){}
    //get the only object available
    public static SingletonObject getInstance(){
        return instance;
    }
    public void showMessage(){
        System.out.println("Hello World");
    }
}
