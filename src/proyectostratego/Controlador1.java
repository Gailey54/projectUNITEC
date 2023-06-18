package proyectostratego;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
public class Controlador1 implements ActionListener{
private String[][] tablero=new String[10][10];
private char turnoJugador='A';
public Controlador1(){
iniciarTablero(); 
TableroOriginal vista=new TableroOriginal();
vista.setVisible(true);
}
private void iniciarTablero() {
for (int i = 0; i < 10; i++) {
for (int j = 0; j < 10; j++) {
tablero[i][j] = "";
}
}
for (int i = 0; i < 10; i++) {   
tablero[1][i]="heroe";
tablero[8][i]="villano";
}
tablero[0][0]="";
tablero[0][1]="";
tablero[0][2]="";
tablero[0][3]="";
tablero[0][4]="";
tablero[0][5]="";
tablero[0][6]="";
tablero[0][7]="";
tablero[0][8]="";
tablero[0][9]="";

tablero[9][0]="";
tablero[9][1]="";
tablero[9][2]="";
tablero[9][3]="";
tablero[9][4]="";
tablero[9][5]="";
tablero[9][6]="";
tablero[9][7]="";
tablero[9][8]="";
tablero[9][9]="";
}
private String getBotonString(Object boton){
if (boton==TableroOriginal.jButton1){
return"00";        
}else if (boton==TableroOriginal.jButton3){
return"01";
}else if (boton==TableroOriginal.jButton11){
return"02";       
}else if (boton==TableroOriginal.jButton10){
return"03";       
}else if (boton==TableroOriginal.jButton21){
return"04";       
}else if (boton==TableroOriginal.jButton27){
return"05";       
}else if (boton==TableroOriginal.jButton31){
return"06";       
}else if (boton==TableroOriginal.jButton33){
return"07";       
}else if (boton==TableroOriginal.jButton49){
return"08";       
}else if (boton==TableroOriginal.jButton41){
return"09";       
}else if (boton==TableroOriginal.jButton61){
return"10";       
}else if (boton==TableroOriginal.jButton60){
return"11";       
}else if (boton==TableroOriginal.jButton66){
return"12";       
}else if (boton==TableroOriginal.jButton65){
return"13";       
}else if (boton==TableroOriginal.jButton76){
return"14";       
}else if (boton==TableroOriginal.jButton75){
return"15";       
}else if (boton==TableroOriginal.jButton92){
return"16";       
}else if (boton==TableroOriginal.jButton91){
return"17";       
}else if (boton==TableroOriginal.jButton95){
return"18";       
}else if (boton==TableroOriginal.jButton94){
return"19";       
}else if (boton==TableroOriginal.jButton93){
return"20";       
}else if (boton==TableroOriginal.jButton87){
return"21";       
}else if (boton==TableroOriginal.jButton86){
return"22";       
}else if (boton==TableroOriginal.jButton83){
return"23";       
}else if (boton==TableroOriginal.jButton58){
return"24";       
}else if (boton==TableroOriginal.jButton54){
return"25";       
}else if (boton==TableroOriginal.jButton53){
return"26";       
}else if (boton==TableroOriginal.jButton52){
return"27";       
}else if (boton==TableroOriginal.jButton47){
return"28";       
}else if (boton==TableroOriginal.jButton69){
return"29";       
}else if (boton==TableroOriginal.jButton88){
return"30";       
}else if (boton==TableroOriginal.jButton81){
return"31";       
}else if (boton==TableroOriginal.jButton84){
return"32";       
}else if (boton==TableroOriginal.jButton85){
return"33";       
}else if (boton==TableroOriginal.jButton80){
return"34";       
}else if (boton==TableroOriginal.jButton82){
return"35";       
}else if (boton==TableroOriginal.jButton79){
return"36";       
}else if (boton==TableroOriginal.jButton78){
return"37";       
}else if (boton==TableroOriginal.jButton77){
return"38";       
}else if (boton==TableroOriginal.jButton89){
return"39";       
}else if (boton==TableroOriginal.jButton68){
return"40";       
}else if (boton==TableroOriginal.jButton67){
return"41";       
}else if (boton==TableroOriginal.jButton74){
return"42";       
}else if (boton==TableroOriginal.jButton73){
return"43";       
}else if (boton==TableroOriginal.jButton72){
return"44";       
}else if (boton==TableroOriginal.jButton40){
return"45";       
}else if (boton==TableroOriginal.jButton59){
return"46";       
}else if (boton==TableroOriginal.jButton64){
return"47";       
}else if (boton==TableroOriginal.jButton63){
return"48";       
}else if (boton==TableroOriginal.jButton71){
return"49";       
}else if (boton==TableroOriginal.jButton70){
return"50";       
}else if (boton==TableroOriginal.jButton62){
return"51";       
}else if (boton==TableroOriginal.jButton45){
return"52";       
}else if (boton==TableroOriginal.jButton57){
return"53";       
}else if (boton==TableroOriginal.jButton56){
return"54";       
}else if (boton==TableroOriginal.jButton55){
return"55";       
}else if (boton==TableroOriginal.jButton51){
return"56";       
}else if (boton==TableroOriginal.jButton50){
return"57";       
}else if (boton==TableroOriginal.jButton44){
return"58";       
}else if (boton==TableroOriginal.jButton48){
return"59";       
}else if (boton==TableroOriginal.jButton43){
return"60";       
}else if (boton==TableroOriginal.jButton42){
return"61";       
}else if (boton==TableroOriginal.jButton46){
return"62";       
}else if (boton==TableroOriginal.jButton39){
return"63";       
}else if (boton==TableroOriginal.jButton38){
return"64";       
}else if (boton==TableroOriginal.jButton37){
return"65";       
}else if (boton==TableroOriginal.jButton36){
return"66";       
}else if (boton==TableroOriginal.jButton35){
return"67";       
}else if (boton==TableroOriginal.jButton34){
return"68";       
}else if (boton==TableroOriginal.jButton30){
return"69";       
}else if (boton==TableroOriginal.jButton32){
return"70";       
}else if (boton==TableroOriginal.jButton29){
return"71";       
}else if (boton==TableroOriginal.jButton28){
return"72";       
}else if (boton==TableroOriginal.jButton20){
return"73";       
}else if (boton==TableroOriginal.jButton26){
return"74";       
}else if (boton==TableroOriginal.jButton25){
return"75";       
}else if (boton==TableroOriginal.jButton23){
return"76";       
}else if (boton==TableroOriginal.jButton24){
return"77";       
}else if (boton==TableroOriginal.jButton22){
return"78";       
}else if (boton==TableroOriginal.jButton19){
return"79";       
}else if (boton==TableroOriginal.jButton18){
return"80";       
}else if (boton==TableroOriginal.jButton17){
return"81";       
}else if (boton==TableroOriginal.jButton16){
return"82";       
}else if (boton==TableroOriginal.jButton15){
return"83";       
}else if (boton==TableroOriginal.jButton14){
return"84";       
}else if (boton==TableroOriginal.trece){
return"85";       
}else if (boton==TableroOriginal.c00){
return"86";       
}else if (boton==TableroOriginal.jButton125){
return"87";       
}else if (boton==TableroOriginal.jButton124){
return"88";       
}else if (boton==TableroOriginal.jButton9){
return"89";       
}else if (boton==TableroOriginal.jButton8){
return"90";       
}else if (boton==TableroOriginal.jButton4){
return"91";       
}else if (boton==TableroOriginal.jButton5){
return"92";       
}else if (boton==TableroOriginal.jButton6){
return"93";       
}else if (boton==TableroOriginal.jButton7){
return"94";       
}else if (boton==TableroOriginal.jButton2){
return"95";       
}else if (boton==TableroOriginal.jButton90){
return"96";       
}else if (boton==TableroOriginal.jButton126){
return"97";       
}else if (boton==TableroOriginal.jButton127){
return"98";       
}else if (boton==TableroOriginal.jButton128){
return"99";  
}
return null;
}
 @Override
    public void actionPerformed(ActionEvent ae) {
    if(turnoJugador=='A'){
        String posicionActual = getBotonPosicionString(ae.getSource());
        Object posicionAntigua = null;
     if( comprobarFicha(posicionActual)){
      posicionAntigua = posicionActual;
     }else if(posicionAntigua!=null){
            String posicionNueva = posicionActual;
     //if(esPosibleEsteMovimiento(posicionAntigua,posicionNueva)){
         cambiarFichas((String) posicionAntigua,posicionNueva);
         posicionNueva=null;
         posicionAntigua=null;
     //}
     }
    }    
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private void cambiarFichas(String posAntigua,String posNueva){
    cambiarEnString(posAntigua,posNueva);
    cambiarEnPantalla(posAntigua,posNueva);
    comprobarUltimaFila();
    }
private void cambiarEnString(String posAntigua,String posNueva){
//posAntigua="";
//posNueva=posAntigua;
int xA=Character.getNumericValue(posAntigua.charAt(1));
int yA=Character.getNumericValue(posAntigua.charAt(0));

int xN=Character.getNumericValue(posNueva.charAt(1));
int yN=Character.getNumericValue(posNueva.charAt(0));
tablero[yN][xN]=tablero[yA][xA];
tablero[yA][xA]="";
}
private void cambiarEnPantalla(String posAntigua, String posNueva){
boton(posNueva).setIcon(boton(posAntigua).getIcon());   
boton(posAntigua).setIcon(null);
}
private JButton boton(String posicion) {
    if (posicion.equals("00")) {
        return TableroOriginal.jButton1;
    } else if (posicion.equals("01")) {
        return TableroOriginal.jButton3;
    } else if (posicion.equals("02")) {
        return TableroOriginal.jButton11;
    } else if (posicion.equals("03")) {
        return TableroOriginal.jButton10;
    } else if (posicion.equals("04")) {
        return TableroOriginal.jButton21;
    } else if (posicion.equals("05")) {
        return TableroOriginal.jButton27;
    } else if (posicion.equals("06")) {
        return TableroOriginal.jButton31;
    } else if (posicion.equals("07")) {
        return TableroOriginal.jButton33;
    } else if (posicion.equals("08")) {
        return TableroOriginal.jButton49;
    } else if (posicion.equals("09")) {
        return TableroOriginal.jButton41;
    } else if (posicion.equals("10")) {
        return TableroOriginal.jButton61;
    } else if (posicion.equals("11")) {
        return TableroOriginal.jButton60;
    } else if (posicion.equals("12")) {
        return TableroOriginal.jButton66;
    } else if (posicion.equals("13")) {
        return TableroOriginal.jButton65;
    } else if (posicion.equals("14")) {
        return TableroOriginal.jButton76;
    } else if (posicion.equals("15")) {
        return TableroOriginal.jButton75;
    } else if (posicion.equals("16")) {
        return TableroOriginal.jButton92;
    } else if (posicion.equals("17")) {
        return TableroOriginal.jButton91;
    } else if (posicion.equals("18")) {
        return TableroOriginal.jButton95;
    } else if (posicion.equals("19")) {
        return TableroOriginal.jButton94;
    } else if (posicion.equals("20")) {
        return TableroOriginal.jButton93;
    } else if (posicion.equals("21")) {
        return TableroOriginal.jButton87;
    } else if (posicion.equals("22")) {
        return TableroOriginal.jButton86;
    } else if (posicion.equals("23")) {
        return TableroOriginal.jButton83;
    } else if (posicion.equals("24")) {
        return TableroOriginal.jButton58;
    } else if (posicion.equals("25")) {
        return TableroOriginal.jButton54;
    } else if (posicion.equals("26")) {
        return TableroOriginal.jButton53;
    } else if (posicion.equals("27")) {
        return TableroOriginal.jButton52;
    } else if (posicion.equals("28")) {
        return TableroOriginal.jButton47;
    } else if (posicion.equals("29")) {
        return TableroOriginal.jButton69;
    } else if (posicion.equals("30")) {
        return TableroOriginal.jButton88;
    } else if (posicion.equals("31")) {
        return TableroOriginal.jButton81;
    } else if (posicion.equals("32")) {
        return TableroOriginal.jButton84;
    } else if (posicion.equals("33")) {
        return TableroOriginal.jButton85;
    } else if (posicion.equals("34")) {
        return TableroOriginal.jButton80;
    } else if (posicion.equals("35")) {
        return TableroOriginal.jButton82;
    } else if (posicion.equals("36")) {
        return TableroOriginal.jButton79;
    } else if (posicion.equals("37")) {
        return TableroOriginal.jButton78;
    } else if (posicion.equals("38")) {
        return TableroOriginal.jButton77;
    } else if (posicion.equals("39")) {
        return TableroOriginal.jButton89;
    } else if (posicion.equals("40")) {
        return TableroOriginal.jButton68;
    } else if (posicion.equals("41")) {
        return TableroOriginal.jButton67;
    } else if (posicion.equals("42")) {
        return TableroOriginal.jButton74;
    } else if (posicion.equals("43")) {
        return TableroOriginal.jButton73;
    } else if (posicion.equals("44")) {
        return TableroOriginal.jButton72;
    } else if (posicion.equals("45")) {
        return TableroOriginal.jButton40;
    } else if (posicion.equals("46")) {
        return TableroOriginal.jButton59;
    } else if (posicion.equals("47")) {
        return TableroOriginal.jButton64;
    } else if (posicion.equals("48")) {
        return TableroOriginal.jButton63;
    } else if (posicion.equals("49")) {
        return TableroOriginal.jButton71;
    } else if (posicion.equals("50")) {
        return TableroOriginal.jButton70;
    } else if (posicion.equals("51")) {
        return TableroOriginal.jButton62;
    } else if (posicion.equals("52")) {
        return TableroOriginal.jButton45;
    } else if (posicion.equals("53")) {
        return TableroOriginal.jButton57;
    } else if (posicion.equals("54")) {
        return TableroOriginal.jButton56;
    } else if (posicion.equals("55")) {
        return TableroOriginal.jButton55;
    } else if (posicion.equals("56")) {
        return TableroOriginal.jButton51;
    } else if (posicion.equals("57")) {
        return TableroOriginal.jButton50;
    } else if (posicion.equals("58")) {
        return TableroOriginal.jButton44;
    } else if (posicion.equals("59")) {
        return TableroOriginal.jButton48;
    } else if (posicion.equals("60")) {
        return TableroOriginal.jButton43;
    } else if (posicion.equals("61")) {
        return TableroOriginal.jButton42;
    } else if (posicion.equals("62")) {
        return TableroOriginal.jButton46;
    } else if (posicion.equals("63")) {
        return TableroOriginal.jButton39;
    } else if (posicion.equals("64")) {
        return TableroOriginal.jButton38;
    } else if (posicion.equals("65")) {
        return TableroOriginal.jButton37;
    } else if (posicion.equals("66")) {
        return TableroOriginal.jButton36;
    } else if (posicion.equals("67")) {
        return TableroOriginal.jButton35;
    } else if (posicion.equals("68")) {
        return TableroOriginal.jButton34;
    } else if (posicion.equals("69")) {
        return TableroOriginal.jButton30;
    } else if (posicion.equals("70")) {
        return TableroOriginal.jButton32;
    } else if (posicion.equals("71")) {
        return TableroOriginal.jButton29;
    } else if (posicion.equals("72")) {
        return TableroOriginal.jButton28;
    } else if (posicion.equals("73")) {
        return TableroOriginal.jButton20;
    } else if (posicion.equals("74")) {
        return TableroOriginal.jButton26;
    } else if (posicion.equals("75")) {
        return TableroOriginal.jButton25;
    } else if (posicion.equals("76")) {
        return TableroOriginal.jButton23;
    } else if (posicion.equals("77")) {
        return TableroOriginal.jButton24;
    } else if (posicion.equals("78")) {
        return TableroOriginal.jButton22;
    } else if (posicion.equals("79")) {
        return TableroOriginal.jButton19;
    } else if (posicion.equals("80")) {
        return TableroOriginal.jButton18;
    } else if (posicion.equals("81")) {
        return TableroOriginal.jButton17;
    } else if (posicion.equals("82")) {
        return TableroOriginal.jButton16;
    } else if (posicion.equals("83")) {
        return TableroOriginal.jButton15;
    } else if (posicion.equals("84")) {
        return TableroOriginal.jButton14;
    } else if (posicion.equals("85")) {
        return TableroOriginal.trece;
    } else if (posicion.equals("86")) {
        return TableroOriginal.c00;
    } else if (posicion.equals("87")) {
        return TableroOriginal.jButton125;
    } else if (posicion.equals("88")) {
        return TableroOriginal.jButton124;
    } else if (posicion.equals("89")) {
        return TableroOriginal.jButton9;
    } else if (posicion.equals("90")) {
        return TableroOriginal.jButton8;
    } else if (posicion.equals("91")) {
        return TableroOriginal.jButton4;
    } else if (posicion.equals("92")) {
        return TableroOriginal.jButton5;
    } else if (posicion.equals("93")) {
        return TableroOriginal.jButton6;
    } else if (posicion.equals("94")) {
        return TableroOriginal.jButton7;
    } else if (posicion.equals("95")) {
        return TableroOriginal.jButton2;
    } else if (posicion.equals("96")) {
        return TableroOriginal.jButton90;
    } else if (posicion.equals("97")) {
        return TableroOriginal.jButton126;
    } else if (posicion.equals("98")) {
    return TableroOriginal.jButton127;
    } else if (posicion.equals("99")) {
    return TableroOriginal.jButton128;
    } else {
    return null;
    }
}
private boolean comprobarFicha (String posicion){
int x = Character.getNumericValue(posicion.charAt(1));
int y = Character.getNumericValue(posicion.charAt(0));
if(!tablero[y][x].equals("")){
return (tablero[y][x].charAt(0)=='A')? true:false;    
}
return false;
}
private void comprobarUltimaFila(){
for(int i=0;i<10;i++){
if(tablero[0][i].equals("")){   
}
if(tablero[9][i].equals("")){
tablero[9][i]="";
String posicion="9"+i;
boton(posicion).setIcon(new ImageIcon(getClass().getResource("/proyectostratego/vip(1).png")));
}
}
}
private String getBotonPosicionString(Object source) {
throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
}
}
