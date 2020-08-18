import java.util.Scanner;

public class Ejercicio04

{
    public static void main(String[] args) {
        
        int cant, num, pares=0, impares=0, sumaPar=0, sumaImpar = 0;         
        System.out.print("Cuantos numeros desea ingresar: ");
        Scanner scanner = new Scanner(System.in);
        cant = scanner.nextInt();
        
        for(int i=1; i<=cant; i++){
            System.out.print("Ingresar numero " + i + " de " + cant + ":  ");
            num =  (new Scanner(System.in)).nextInt();            
            if(num%2 == 0) {
                 pares++;
                 sumaPar = sumaPar+num;
            }
            else {
                 impares++;
                 sumaImpar = sumaImpar+num;
            }            
        }
        System.out.println("\nCantidad de numeros pares: " + pares);
        System.out.println("La suma de los numeros pares es: " + sumaPar);
        System.out.println("Cantidad de numeros impares: " + impares);
        System.out.println("La suma de los numeros impares es: " + sumaImpar);        
    }
}
