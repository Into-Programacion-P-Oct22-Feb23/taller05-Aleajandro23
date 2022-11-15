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

        if (origen.equals("Alemania")) {
            double descuento = 1.20;
            valor_total = costo * descuento;
            System.out.printf("El descuento es de: \n20\n El valor del"
                    + "vehiculo es de: \n%2f\n", valor_total);
        } else {
            if (origen.equals("Japon"));
                double descuento = 1.30;
                valor_total = costo * descuento;
                System.out.printf("El descuento es de: \n30%\n El valor del"
                    + "vehiculo es de: \n%2f\n", valor_total);
            }
                if (origen.equals("Italia")){
                    double descuento = 1.15;
                    valor_total = costo * descuento;
                    System.out.printf("El descuento es de: \n15%\n El valor del"
                    + "vehiculo es de: \n%2f\n", valor_total);    
                    }else{
                     double descuento = 1.08;
                    valor_total = costo * descuento;
                    System.out.printf("El descuento es de: \n8%\n El valor del"
                    + "vehiculo es de: \n%2f\n", valor_total); 
                    }
                
         

    }

}
