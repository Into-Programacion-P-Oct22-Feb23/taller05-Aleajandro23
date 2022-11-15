/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema2;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author Ruben Condoy
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); 
        
        String articulo;
        double precio_unitario;
        int unidades;
        double descuento; // 15% 0.15
        double valor_total;
        
        System.out.println("Ingrese el articulo que desea comprar");
        articulo = entrada.nextLine();
        
        System.out.println("ingrese el precio");
        precio_unitario = entrada.nextDouble();
        
        System.out.println("Ingrese la cantidad de unidades que desea "
                + "adquirir");
        unidades = entrada.nextInt();
        entrada.nextLine();
        
        valor_total = precio_unitario * unidades;
        
         if ( unidades > 50 ){
            valor_total = valor_total * 0.15;
        }
         
        System.out.printf("El valor del pedido es: \n%2.f , valor?total" ,
                valor_total);        
    }
    
}
