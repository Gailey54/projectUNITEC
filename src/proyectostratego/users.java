
package proyectostratego;


public class users {
   private String username, contrasena;
   
   public users(String username, String contrasena){
       this.username=username;
       this.contrasena=contrasena;
   }
   
   public String getNombre(){
       return username;
   }
   
   public String getContra(){
       return contrasena;
   }
   
   public void setNombre(String username){
       this.username=username;
   }
   
   public void setContra(String contrasena){
       this.contrasena=contrasena;
       
       
   }
}
