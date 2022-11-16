/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema4;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author Ruben Condoy
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        int dias;
        double precio;
        double descuento;
        double subtotal;
        double total;
        
        System.out.println("Ingrese el numero de dias de hospedaje");
        dias = entrada.nextInt();

        System.out.println("Ingrese el precio diario de la habitacion");
        precio = entrada.nextDouble();

        subtotal = dias * precio;
        
       if ((dias > 5) && (dias <= 10)) {
           descuento = (subtotal * 10) /100;
           total = subtotal - descuento;
           System.out.printf("El descuento es: %f\nEL subtotal es:%.2f\n"
                   + "El valor a "
                   + "cancelar es: %f\n", descuento ,subtotal
                   , total);
          }else{
           System.out.printf("El valor a cancelar es: %.2f\n", subtotal);
       }
        if ((dias > 10) && (dias <= 15)) {
                descuento = (subtotal * 15) /100;
                total = subtotal - descuento;
                 System.out.printf("El descuento es: %f\nEL subtotal es:%.2f\n"
                   + "El valor a "
                   + "cancelar es: %f\n", descuento ,subtotal
                   , total);
             }
                 if ((dias > 10) && (dias <= 15)) {
                    descuento = (subtotal * 15) /100;
                    total = subtotal - descuento;
                   System.out.printf("El descuento es: %f\nEL subtotal es:%.2f\n"
                   + "El valor a "
                   + "cancelar es: %f\n", descuento ,subtotal
                   , total);
           }
              
           
            if (dias < 5){
            total = subtotal;
            }
    
    
    }
            
                    
                    
}
