package epa.online03;

/**
 *
 * @author Aran
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class ES {

    /**
     * Este método devuelve un número introducido por teclado
     *
     * @return un número entero
     */
    public int leerEntero() {

        Scanner teclado = new Scanner(System.in);
        int numero = 0;

        boolean repetir = true;
        do {

            try {
                numero = teclado.nextInt();

                repetir = false;

            } catch (InputMismatchException e) {
                System.err.println("El carácter introducido no es válido, por favor introduce un número entero");
                teclado.next();
            } catch (Exception e) {
                System.err.println("El carácter introducido no es válido, por favor introduce un número entero");
            }
        } while (repetir);
        return numero;

    }

    /**
     * Método que muestra por pantalla un mensaje esperado por parámetro y
     * devuelve un número entero
     *
     * @param mensaje de tipo String que se muestra al principio de la ejecución
     * del método
     * @return un numero entero
     */
    public int leerEntero(String mensaje) {

        System.out.println(mensaje);

        return leerEntero();

    }

    /**
     * Este método devuelve un número entre un mínimo y un máximo facilitado por
     * parámetro.
     *
     * @param minimo el número mínimo que se debe introducir
     * @param maximo el número máximo que se debe introducir
     * @return devuelve un número entero comprendido entre los parámetros
     */
    public int leerEntero(int minimo, int maximo) {

        int numero = minimo - 1;

        do {
            
            numero = leerEntero();
            
            System.out.println("Introduce un número comprendido entre el " + minimo + " y el " + maximo);
        } while (numero < minimo || numero > maximo);

        return numero;
    }

    /**
     * meétodo que devuelve un número entero entre un mínimo y un máximo y
     * muestra por pantalla un mensaje indicado por los parámetros
     *
     * @param mensaje de tipo String que se muestra al principio de la ejecución
     * del método
     * @param minimo el número mínimo que se debe introducir
     * @param maximo el número máximo que se debe introducir
     * @return vuelve un número entero comprendido entre los parámetros
     */
    public int leerEntero(String mensaje, int minimo, int maximo) {
        System.out.println(mensaje);

        return leerEntero(minimo, maximo);

    }

    /**
     * Devuelve un número decimal introducido por teclado
     *
     * @return un numero decimal
     */
    public float leerDecimal() {
        Scanner teclado = new Scanner(System.in);

        float decimal = 0;
        boolean repetir = true;
        do {

            try {

                decimal = teclado.nextFloat();

                repetir = false;

            } catch (InputMismatchException e) {
                System.err.println("El carácter introducido no es válido, por favor introduce un número decimal");
                teclado.next();
            } catch (Exception e) {
                System.err.println("El carácter introducido no es válido, por favor introduce un número decimal");
            }

        } while (repetir);

        return decimal;
    }

    /**
     * Devuelve un número decimal introducido por teclado y muestra un mensaje
     * por pantalla antes de la ejecución
     *
     * @param mensaje de tipo String que se muestra al principio de la ejecución
     * del método
     * @return un número decimal
     */
    public float leerDecimal(String mensaje) {
        System.out.println(mensaje);

        return leerDecimal();
    }

    /**
     * Devuelve un decimal largo introducido por teclado
     *
     * @return un número decimal largo
     */
    public double leerDecimalLargo() {
        Scanner teclado = new Scanner(System.in);
        double decimalLargo = 0;
        boolean repetir = true;
        do {

            try {
                decimalLargo = teclado.nextDouble();

                repetir = false;

            } catch (InputMismatchException e) {
                System.err.println("El carácter introducido no es válido, por favor introduce un número decimal");
                teclado.next();
            } catch (Exception e) {
                System.err.println("El carácter introducido no es válido, por favor introduce un número decimal");
            }

        } while (repetir);

        return decimalLargo;
    }

    /**
     * Devuelve un número decimal introducido por teclado y un ensaje por
     * pantalla
     *
     * @param mensaje de tipo String que se muetra al principio de la ejecución
     * @return
     */
    public double leerDecimalLargo(String mensaje) {
        System.out.println(mensaje);
        return leerDecimalLargo();

    }

    public void escribir(String mensaje) {

        System.out.print(mensaje);
    }

    public void escribirLn(String mensaje) {
        System.out.println(mensaje);
    }

    public String leerString() {
        Scanner teclado = new Scanner(System.in);

        return teclado.next();
    }

    public String leerString(String mensaje) {
        System.out.println(mensaje);
        return leerString();
    }

}
