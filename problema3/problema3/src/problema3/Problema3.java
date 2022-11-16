/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Ruben Condoy
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String marca;
        String origen;
        double costo;
        double precio_venta;
        double impuesto;
        double valor_total;

        System.out.println("Ingrese la marca de su automovil");
        marca = entrada.nextLine();

        System.out.println("Ingrese el origen del automovil");
        origen = entrada.nextLine();

        System.out.println("Ingrese el costo del vehiculo");

        costo = entrada.nextDouble();
        
        if(origen.equals  ("Alemania")){
            impuesto = costo * 0.20;
            valor_total = costo + impuesto;
            System.out.printf("El impuesto es de: \n%f\nEl valor del"
                    + "vehiculo es de: \n%2f\n", impuesto, valor_total);        
            }else{ 
           if(origen.equals("Japon")){
            impuesto = costo * 0.30; 
            valor_total = costo + impuesto;
             System.out.printf("El impuesto es de: \n%f\nEl valor del"
                    + "vehiculo es de: \n%2f\n", impuesto, valor_total);       
            }
            if(origen.equals("Italia")){
            impuesto = costo * 0.15; 
            valor_total = costo + impuesto;
             System.out.printf("El impuesto es de: \n%f\nEl valor del"
                    + "vehiculo es de: \n%2f\n", impuesto, valor_total);       
            }else{
            if(origen.equals("USA")){
            impuesto = costo * 0.08;
            valor_total = costo + impuesto;
             System.out.printf("El impuesto es de: \n%f\nEl valor del"
                    + "vehiculo es de: \n%2f\n", impuesto, valor_total);       
            }
           }
            
        }
          
        }}
        
        
        
       


