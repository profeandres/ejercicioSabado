package poo;

public class Coche {

     private int ruedas;
     private int largo;
     private int ancho;
     private int motor;
     private int peso_plataforma;
     private String color;
     private int peso_total;
     private boolean asientos_cuero,Climatizador;

     public Coche(){

        ruedas=4;
        largo=2000;
        ancho=300;
        motor=1600;
        peso_plataforma=500;

     }

     public String dimelargo(){        //getter
        return "El largo del coche es "+largo+" cm.";
     }

     public void establececolor(String color){     // Setter
        this.color=color;
     }

     public String dimecolor(){
        return "El color del coche es "+color;
     }
}
