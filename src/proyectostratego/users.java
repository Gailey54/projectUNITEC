
package proyectostratego;


public class users {
   private String username, contrasena;
   private int puntos, gamesVillanos, gamesHeroes;
   
   public users(String username, String contrasena){
       this.username=username;
       this.contrasena=contrasena;
       puntos=0;
       gamesVillanos=0;
       gamesHeroes=0;
   }
   
   public String getNombre(){
       return username;
   }
   
   public String getContra(){
       return contrasena;
   }
   
   public int getPuntos(){
       return puntos;
   }
   
   public int getGamesVillanos(){
       return gamesVillanos;
   }
   
   public int getGamesHeroes(){
       return gamesHeroes;
   }
   
   
   public void setNombre(String username){
       this.username=username;
   }
   
   public void setContra(String contrasena){
       this.contrasena=contrasena;
   }
       
   public boolean verificarUsuarioReal(String username, String contrasena){
        return (this.getNombre().equals(username) && this.getContra().equals(contrasena));
    }
   
}
