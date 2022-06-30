
import java.util.Scanner;


public class main {

   static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
       int num1,num2,suma;
        System.out.println("Ingrese un numero :");
        num1=entrada.nextInt();
        System.out.println("Ingrese un numero :");
        num2=entrada.nextInt();
        suma=num1+num2;
        System.out.println("La suma es: "+suma);
    }
    
}
