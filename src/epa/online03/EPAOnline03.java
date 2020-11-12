package epa.online03;

import java.util.Scanner;

/**
 *https://github.com/luzaxnara/Online3.git
 * @author Aran
 */
public class EPAOnline03 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int opcion;

        do {
            System.out.println(" Elige un método de entre los siguientes: ");
            System.out.println("1: Nos dirá si el número introducido es positivo o negativo");
            System.out.println("2: Nos dirá si el número introducido es positivo o negativo excepto el cero");
            System.out.println("3: Compara dos números");
            System.out.println("4: Realiza distintas operaciones según los números introducidos");
            System.out.println("5: Muestra los 30 primeros números enteros");
            System.out.println("6: Muestra los números pares de los números comprendidos entre el 50 y el 97");
            System.out.println("7: Realiza una tabla de multiplicar del número que introduzcamos");
            System.out.println("8: Realiza una tabla de multiplicar del número que introduzcamos y además podemos repetir varias veces la operación");
            System.out.println("9: Calcula los divisores de un número");
            System.out.println("10: Calculadora");
            System.out.println("0: Salir del programa");

            opcion = teclado.nextInt();

            switch (opcion) {

                case 1:
                    numeroPositivo();
                    break;
                case 2:
                    numeroPositivoCero();
                    break;
                case 3:
                    numeroMayor();
                    break;
                case 4:
                    operacionesConNumeros();
                    break;
                case 5:
                    numerosEnterosHasta30();
                    break;
                case 6:
                    numerosPares();
                    break;
                case 7:
                    tablaMultiplicar();
                    break;
                case 8:
                    tablaMultiplicarRepetitiva();
                    break;
                case 9:
                    numerosPostivosDivisibles();
                    break;
                case 10:
                    calculadora();
                    break;
                case 0:
                    System.out.println("Gracias, vuelva pronto");
                    break;

                default:
                    System.out.println("La opción elegida no es válida");
            }

        } while (opcion != 0);

    }

    /**
     * Este método nos dice si el número introduco es positivo o negativo donde
     * cero será positivo
     *
     */
    public static void numeroPositivo() {

        ES entradaSalida = new ES();

        int numero = entradaSalida.leerEntero("Vamos a averiguar si el número introduce es positivo o negativo, lo primero que tienes que hacer es introducir un número entero:");

        if (numero < 0) {
            System.out.println("El número " + numero + " es negativo");
        } else {
            System.out.println("El número " + numero + " es positivo");
        }
    }

    /**
     * Este método nos indica si el número introducido es positivo o negativo,
     * cero será cero.
     */
    public static void numeroPositivoCero() {
        ES entradaSalida = new ES();

        int numero = entradaSalida.leerEntero("Vamos a averiguar si el número introduce es positivo o negativo, lo primero que tienes que hacer es introducir un número entero:");

        if (numero < 0) {
            System.out.println("El número " + numero + " es negativo");
        } else if (numero > 0) {
            System.out.println("El número " + numero + " es positivo");
        } else {
            System.out.println("El número es cero");
        }
    }

    /**
     * Comparamos dos números introducidos por teclado y decimos cual es el
     * mayor.
     */
    public static void numeroMayor() {
        ES entradaSalida = new ES();

        System.out.println("Vamos a comparar dos números");
        System.out.println("Introduce el primer número");

        int a = entradaSalida.leerEntero();

        System.out.println("Introduce el segundo número");
        int b = entradaSalida.leerEntero();

        if (a > b) {
            System.out.println("El número " + a + " es mayor que el número " + b);
        } else if (a < b) {
            System.out.println("El número " + b + " es mayor que el número " + a);
        } else {
            System.out.println("El número " + b + " es igual que el número " + a);
        }
    }

    /**
     * Realiza una resta cuando a sea menor que b, una suma cuando a sea mayor
     * que b y una multiplicación cuando a sea igual a b
     */
    public static void operacionesConNumeros() {
        ES entradaSalida = new ES();

        System.out.println("Vamos a realizar distintas operaciones según los números introducidos");

        int a = entradaSalida.leerEntero("Introduce el primer número");

        int b = entradaSalida.leerEntero("Introduce el segundo número");

        if (a > b) {
            System.out.println("El resultado de la resta es: " + (a - b));
        } else if (a < b) {
            System.out.println("El resultado de la suma es: " + (a + b));

        } else {
            System.out.println("El resultado de la multiplicación es: " + (a * b));
        }
    }

    /**
     * Imprime por pantalla los 30 primeros números enteros
     */
    public static void numerosEnterosHasta30() {

        System.out.println("Vamos a mostrar los 30 primeros números enteros");
        int numero = 0;

        while (numero < 30) {
            numero++;

            System.out.println(numero);
        }
    }

    /**
     * Muestra los número pares comprendidos, en este caso, el 50 y el 97
     */
    public static void numerosPares() {

        int a = 50;
        int b = 97;

        System.out.println("Vamos a mostrar los números pares de los números comprendidos entre " + a + " y " + b);

        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    /**
     * realiza las tablas de multiplicar de los números comprendidos entre el 0
     * y el 10
     */
    public static void tablaMultiplicar() {
        ES entradaSalida = new ES();

        int numero = entradaSalida.leerEntero("Introduce un número del 0 al 10", 0, 10);

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + numero * i);
        }

    }

    /**
     * realiza las tablas de multiplicar de los números comprendidos entre el 0
     * y el 10 y al final pregunta si deseamos repetir la operación
     */
    public static void tablaMultiplicarRepetitiva() {
        ES entradaSalida = new ES();

        int numero;
        String respuesta = "";

        do {

            numero = entradaSalida.leerEntero("Introduce un número del 0 al 10", 0, 10);
            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + numero * i);
            }

            System.out.println("¿Desea realizar otra tabla de multiplicar? ");
            System.out.println(" S/N ");

            respuesta = entradaSalida.leerString();
        } while (respuesta.equalsIgnoreCase("s"));
    }

    /**
     * Calcula los numeros divisibles de un número introducido por teclado
     */
    public static void numerosPostivosDivisibles() {
        ES entradaSalida = new ES();

        System.out.println("Vamos a calcular los divisores de un número");

        int num = entradaSalida.leerEntero("Introduce un número");

        if (num > 0) {
            for (int i = num; i > 0; i--) {
                if (num % i == 0) {
                    System.out.println(i);
                }
            }
        }
    }

    /**
     * Una calculadora
     */
    public static void calculadora() {
        ES entradaSalida = new ES();

        int numero;

        do {

            System.out.println("CALCULADORA");
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Resto");
            System.out.println("0.Salir del programa");
            System.out.print("Introduzca una opción válida:");

            numero = entradaSalida.leerEntero();

            if (numero < 0 || numero > 5) {
                System.out.println("Por favor, seleccione una opción válida");
            } else if (numero != 0) {

                System.out.println("\n");

                float operando1, operando2;

                operando1 = entradaSalida.leerDecimal("Introduzca el primer operando");

                operando2 = entradaSalida.leerDecimal("Introduzca el segundo operando");

                System.out.println("\n");

                switch (numero) {

                    case 1: //Sumar

                        System.out.println("El resultado de la suma es " + (operando1 + operando2));
                        break;

                    case 2: //Resta
                        System.out.println("El resultaodo de la resta es " + (operando1 - operando2));
                        break;
                    case 3: //Multiplicar

                        System.out.println("El resultado de la multiplicación es " + (operando1 * operando2));
                        break;
                    case 4:// Dividir
                        System.out.println("El resultado de la división es " + (operando1 / operando2));
                    case 5://Resto
                        System.out.println("El resto de dividir " + operando1 + " entre " + operando2 + " es " + (operando1 % operando2));
                }
            }

        } while (numero != 0);

        System.out.println("Finalizando la ejecución de la calculadora");
    }

}
