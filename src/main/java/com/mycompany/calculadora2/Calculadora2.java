
package com.mycompany.calculadora2;

public class Calculadora2 {

    public static void main(String[] args) {
        Operaciones op=new Operaciones();
        op.leerNumeros();
        op.suma();
        op.resta();
        op.multiplicacion(20,19);
        op.division();
        op.mostrarresultado();
    }
}
