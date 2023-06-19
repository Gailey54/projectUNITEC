/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectostratego;

import java.util.*;
public class LogisticaSesion {
    private users usuarios[]=new users[1];
    private int usuariosDisponibles=0;
    users actualUser; users secondaryUser;
    
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
        users usuario=new users(username,contra);
        
        if (usuariosDisponibles==0){
            usuarios[0]=usuario;
            usuariosDisponibles++;
            return true;
        }
        
        int incremento=usuarios.length+1;
        users newuser[]=new users[incremento];
        
        for (int i=0;i<usuarios.length;i++){
            newuser[i]=usuarios[i];
        }
        
        newuser[incremento-1]=usuario;
        usuarios=newuser;
        usuariosDisponibles++;
        return true;
    }
    
    public users Login(String username, String password){
        for (users user:usuarios){
            if (user==null) continue;
            if (user.getNombre().equals(username) && user.getContra().equals(password)){
                actualUser=user;
                return user;
            }
            
        }
        return null;
    }
    
    public String[] getUsuarioTotales(){
        String usernames[]=new String[usuarios.length];
        
        for (int i=0;i<usuarios.length;i++){
            usernames[i]=usuarios[i].getNombre();
        }
        
        return usernames;
    }
    
    public void logout(){
        actualUser=null;
    }
    
    
}
