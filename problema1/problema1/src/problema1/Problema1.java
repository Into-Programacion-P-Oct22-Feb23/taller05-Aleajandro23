/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Ruben Condoy
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double costoKilovatio;
        double kilovatio_numero;
        double costo_planilla;
        int edad;
        double descuento; //0.10

        System.out.println("Ingrese su edad por favor");
        edad = entrada.nextInt();
        System.out.println("Ingrese el costo kv/hora");
        costoKilovatio = entrada.nextDouble();
        System.out.println("Ingrese el número de Kilovatios consumidos "
                + "en el mes");
        kilovatio_numero = entrada.nextDouble();
        
        costo_planilla = costoKilovatio * kilovatio_numero;
                
         if (edad > 65) {
            costo_planilla = costo_planilla * 0.10;
        };
        System.out.printf("El valor a cancelar es: \n%s, "
                + "cosoto?planilla" , costo_planilla);
    }

}
