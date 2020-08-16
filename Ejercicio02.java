import java.util.Scanner; //importar para teclado

public class Ejercicio02
{
   public static void main(String[] args)
   {
       //declarar variables
       int n, i, lista[],printNum; 
       int menor, mayor;
       float suma, promedio;
       Scanner teclado = new Scanner(System.in);
       
       System.out.println("Ingrese cantidad de numeros enteros:");
       n = teclado.nextInt();
       lista = new int[n];
       
       //Instrucciones ciclicas para asignacion de valores
       do {
           for (i=0; i<n; i++) {
               printNum = i+1;
               System.out.println("Ingrese valor del " + printNum +" numero:");
               lista[i] = teclado.nextInt();
           } //Fin de for para asignacion de valores
       } while (n<=0);
       //Instruccion condicional y ciclica, calculo e impresion de resultados
       suma = 0;
       menor = lista[0];
       mayor = lista[0]; 
       for (i=0; i<n; i++) {         
           if (lista[i] < menor) {
               menor = lista[i];               
           } //Fin de if menor
           else if (lista[i] > mayor) {
               mayor = lista[i];               
           } //Fin de else if mayor
           suma = suma + lista[i]; 
       } //Fin de for para determinacion de menor, mayor y suma
       promedio = suma/n;
       System.out.println("El numero menor de la lista es: " + menor);
       System.out.println("El numero mayor de la lista es: " + mayor);
       System.out.println("El promedio de los numeros es: " + promedio);
   } //Fin de main
} //fin de ejercicio02
