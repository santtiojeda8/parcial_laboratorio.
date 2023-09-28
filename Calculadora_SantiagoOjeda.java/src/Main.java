import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("CALCULADORA");
        int decision;
        System.out.println("Que opercación desea realizar?");
        System.out.println("1: Sumar  2: Restar  3: Multiplicar  4: Divididr 5: Salir");
        decision = leer.nextInt();
        System.out.println("Ingrese el primer n°");
        double number1 = leer.nextInt();
        System.out.println("Ingrese el segundo n°");
        double number2 = leer.nextInt();
        do {
            switch (decision) {
                case 1:
                    double suma = number1 + number2;
                    System.out.println(suma);
                    break;
                case 2:
                    double resta = number1 - number2;
                    System.out.println(resta);
                    break;
                case 3:
                    double multiplicacion = number1 * number2;
                    System.out.println(multiplicacion);
                    break;
                case 4:
                    while (number2==0){
                        System.out.println("No se puede dividir por 0");
                        System.out.println("Ingrese otro número");
                        number2= leer.nextInt();
                    }
                    double division = number1/number2;
                    System.out.println(division);
            }
            System.out.println("Que opercación desea realizar?");
            System.out.println("1: Sumar  2: Restar  3: Multiplicar  4: Divididr 5: Salir");
            decision = leer.nextInt();

        } while (decision != 5);
    }
}