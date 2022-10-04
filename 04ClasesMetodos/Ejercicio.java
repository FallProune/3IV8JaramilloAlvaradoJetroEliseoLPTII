import java.util.Scanner;

class Ejercicio {

    /*
     * vamos a hacer un programa mediante el cual vamos a tener 4 opciones que so
     * 1 otra calcukladora
     * 2 conversion de unidades
     * 3 creacion deun cuadrito magico
     * 4 movimiento de un cuadro
     */
    // objetos
    Scanner entrada = new Scanner(System.in);

    // metodos o comportamientos de la clase
    // vamos a crear un metodo para el menu
    /*
     * public es el acceso a el tipo de dato clase o metodo cualquier programa puede
     * acceder a el
     * private es de acceso restringido solo mediante reglas se puede acceder a el
     * protected se puede tenr acceso solo desde la misma clase y aplicado la
     * herencia de POO entre los hijos y padres
     * 
     * un metodo tambien es un tipo de dato aplicado
     */
    char op;

    public void menu() {
        System.out.println("Bienvenido a los metodos");

        System.out.println("Elige una de las isguientes opciones");

        System.out.println("a.- Calculadora");

        System.out.println("b.- Conversion de Unidades");

        System.out.println("c.- Creacion de un cuadrito magico");

        System.out.println("d.- Movimiento de un cuadro");

        op = entrada.next().charAt(0);

        switch (op) {
            case 'a':
                // vamos a hacer un metodo
                ejercicio1();
                break;
            case 'b':
                // vamos a hacer un metodo
                ejercicio2();
                break;
            case 'c':
                // vamos a hacer un metodo
                ejercicio3();
                break;
            case 'd':
                // vamos a hacer un metodo
                ejercicio4();
                break;
            default:
                System.out.println("gracias por estar aqui, pero hay que mimir n_n/Opcion no valida");
        }
    }

    public void ejercicio1() {
        // calculadora
        // +-*/
        double num1 = 0.00, suma = 0.00, multi = 0.00;
        char operacion;

        System.out.println("Seleccionar la operación que deseas realizar: ");
        System.out.println("a. Suma y Resta");
        System.out.println("b. Multiplicacion");
        System.out.println("c. Division");
        operacion = entrada.next().charAt(0);

        switch (operacion) {
            case 'a':
                do {
                    System.out.println("Para detener la operacion presione 0");
                    System.out.println("Escriba tantos numeros como quiera sumar o restar");
                    num1 = entrada.nextDouble();
                    suma += num1;
                    System.out.println("El resultado es: " + suma);
                } while (num1 != 0);
                break;
            case 'b':
                System.out.println("Para detener la operacion presione 0");
                System.out.println("Escriba tantos numeros como quiera multiplicatr");
                num1 = entrada.nextDouble();
                multi *= num1;
                System.out.println("El resultado es: " + multi);
                break;
            case 'c':
                System.out.println("ingrese el numerador");
                num1 = entrada.nextDouble();
                System.out.println("ingrese el denominador");
                suma = entrada.nextDouble();

                if (suma == 0) {
                    System.out.println("No se puede realizar una division entre cero");
                } else {
                    multi = num1 / suma;
                }

                System.out.println("El resultado de la division es: " + multi);
                break;
        }
    }

    public void ejercicio2() {

    }

    public void ejercicio3() {

    }

    public void ejercicio4() {

    }

}
