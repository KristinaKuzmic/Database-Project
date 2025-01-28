/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dbbroker.DBBroker;

/**
 *
 * @author Kristina
 */
public class Controller {
    
    DBBroker dbBroker;
    private static Controller instance;
    
    private Controller(){
        dbBroker=new DBBroker();
    }
    
    
    

    public static Controller getInstance() {
        if(instance==null)
            instance = new Controller();
        return instance;
    }
    
    
}
