package ejerciciorandom3;

import java.util.Scanner;

/*
Construir un programa que dada un aserie de vehículos caracterizados por su marca, modelo y precio, imprima las propiedades del vehículo más barato. Para ello, se deberá leer por teclado las características de cada vehículo y crear una clase que represente a cada uno de ellos.
*/
public class Principal {
    public static int indCocheMBarato(Vehiculo coche[]) {
        double precio;
        int indice=0;
        precio=coche[0].getprecio();
        for(int i=1;i<coche.length;i++){
            if (precio>coche[i].getprecio()){
                precio=coche[i].getprecio();
                indice=i;
            }
        }
        return indice;
    }
    private static Scanner entrada;
    public static void main(String[] args) {
        entrada = new Scanner(System.in);
        String marca;
        int modelo;
        double precio;
        int numVehiculos,indiceBarato;
        
        //se pide al usuario cuántos vehiculos va a comparar
        System.out.println("Digite la cantidad de vehículos: ");
        numVehiculos=entrada.nextInt();

        //Creamos los objetos para los coches
        Vehiculo coches[]=new Vehiculo[numVehiculos];

        for (int i=0;i<coches.length;i++){
            System.out.println("\nDigite las caracteristicas del coche "+(i+1)+": ");
            System.out.println("Introduzca Marca: ");
            marca=entrada.next();
            System.out.print("Introduzca Modelo: ");
            modelo=entrada.nextInt();
            System.out.print("Introduzca Precio: ");
            precio=entrada.nextDouble();
            coches[i]=new Vehiculo(marca,modelo,precio);
        }

        indiceBarato=indCocheMBarato(coches);
        System.out.println("\nEl coche más barato es: ");
        System.out.println(coches[indiceBarato].mostrardatos());

    }
}
