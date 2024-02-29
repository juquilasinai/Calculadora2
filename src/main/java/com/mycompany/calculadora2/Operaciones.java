
package com.mycompany.calculadora2;
import javax.swing.JOptionPane;

public class Operaciones {
    int numero1;
    int numero2;
    int resta;
    int multiplicacion;
    int division;
    int suma;
    
    public void leerNumeros() {
        numero1=Integer.parseInt(JOptionPane.showInputDialog("Coloca el num1: "));
        numero2=Integer.parseInt(JOptionPane.showInputDialog("Coloca el num2: "));
        }
    
        public void suma() {
        suma=numero1+numero2;
        }
        
        public void resta() {
        resta=numero1-numero2;
        }
        
        public void multiplicacion(int numero1, int numero2) {
        multiplicacion=numero1*numero2;
        }
        
        public void division() {
        division=numero1/numero2;
        }
        
    public void mostrarresultado() {
        System.out.println("La suma es"+suma);
        System.out.println("La resta es"+resta);
        System.out.println("La multiplicacion es"+multiplicacion);
        System.out.println("La division es"+division);
    }
}
