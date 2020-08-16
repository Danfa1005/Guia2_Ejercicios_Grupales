import java.util.Scanner; //Importar para teclado

public class Ejercicio01
{
    public static void main (String [] args) {
        
        //Declarar variables
        int num, negativo, positivo;
        Scanner teclado = new Scanner(System.in);
        
        //Empleo de ciclo
        do {
        System.out.println("Ingrese numero entero (puede ser un numero negativo) o introduzca un 0 para terminar el ciclo:");
        num = teclado.nextInt();
            //Instruccion condicional
            if (num < 0) {
                negativo = num*num;
                System.out.println("El resultado del cuadrado para el numero negativo es: " + negativo);
            } //Fin de if negativo
            else if (num > 0) {
                positivo = num*num*num;
                System.out.println("El resultado del cubo para el numero positivo es: " + positivo);
            }
       } while (num != 0); //Fin de ciclo
    } //Fin de main
} //Fin de ejercicio01
