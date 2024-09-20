/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Calculadora;

/**
 *
 * @author usr1
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculadora obj = new Calculadora();
        System.out.println(obj.multiplica(5, 4));
        System.out.println(obj.suma(12, 12));
    }
     /**
    *sumar dos numeros enteros.
    *
    @param a primer numero entero.
    @param b segundo numero entero.
    @return la suma de a y b.
    */
    public int suma(int a,int b){
    return a+b;
    }
    
    /**
    *multiplicacion dos numeros enteros
    *
    @param a primer numero entero.
    @param b segundo numero entero.
    @return el producto de a y b.
    */
    public int multiplica(int a,int b) {
    return a*b;   
    }
    
    /**
    *resta dos numeros enteros
    *
    @param a primer numero entero.
    @param b segundo numero entero.
    @return la resta de a y b.
    */
    public int resta(int a,int b) {
    return a-b;   
}
/**
    *dividir dos numeros enteros
    *
    @param a primer numero entero.
    @param b segundo numero entero.
    @return el producto de a y b.
    */
    public int dividir(int a,int b) {
    return a/b;   
}
}

