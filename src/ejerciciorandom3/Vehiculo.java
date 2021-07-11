package ejerciciorandom3;
/*
Construir un programa que dada un aserie de vehículos caracterizados por su marca, modelo y precio, imprima las propiedades del vehículo más barato. Para ello, se deberá leer por teclado las características de cada vehículo y crear una clase que represente a cada uno de ellos.
*/
public class Vehiculo {

    private String marca;
    private int modelo;
    private double precio;

    //constructor
    public Vehiculo(String marca, int modelo, double precio){
        this.marca=marca;
        this.modelo=modelo;
        this.precio=precio;
    }
    
    public double getprecio(){
        return precio;
    }
    
    public String mostrardatos(){
        return "Marca: "+marca+"\nModelo: "+modelo+"\nprecio: "+Math.round(precio);
    }
        
}