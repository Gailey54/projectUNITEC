/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectostratego;

/**
 *
 * @author levir
 */
public class LogisticaSesion {
    private users usuarios[]=new users[1];
    private int usuariosDisponibles=0;
    users actualUser;
    
    //constructor
    public LogisticaSesion(){
    }
    
    
    public int getUsuariosDisponibles(){
        return usuariosDisponibles;
    }
    
    //Ver si no existe el usuario en el arreglo del objeto
    public users encontrarUser(String username){
        for (users user:usuarios){
            if (user==null) continue;
            if (user.getNombre().equals(username)) return user;
        }
        
        return null;
    }
    
    public boolean createPlayer(String username, String contra){
        
        if (encontrarUser(username) != null){
            return false;
        }
        return true;
        
        
            
        
    }
}
