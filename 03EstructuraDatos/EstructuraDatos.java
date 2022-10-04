/**
 *Vamos a crear un programa que se encargue de realizar las siguientes operaciones

 1.-Bono o descuento por la edad
 2.-Convertir numeros decimales a binarios 
 3.-Convertir temperatura celcius kerlvine y rankie
 4.- Numeros positivos y negativos segun una lista de numeros 
 5.-Tienda peke
 6.-Area y perimetro de figuras 
 7.- Tabla
 8.-factorial
 9.-Dibujito
 10.-Figuras huecas de codigo
 11.-Patrones
 12.-Diamante
 13.-Calculadora
 14.-Salir
 */
import java.util.Scanner;

class EstructuraDatos {
    // Programa 1
    public static void main(String[] args) {
        // declaro mi objeto
        Scanner entrada = new Scanner(System.in);

        //
        int edad, opcion, socio, numbinario, total, numerototal, n;
        int positivos = 0;
        double precio, bono;
        char letras, operacion;
        float precios = 0;
        float resultado = 0;
        int cantidad = 0;
        String binario = "";

        // Vamos a crear un bucle para que se repita el programa con un do while

        do {
            System.out.println("Bienvenido a la taerita que tenian que hacer");
            System.out.println("1.- Descuento por edad");
            System.out.println("2.-Convertir numero decimal a binario");
            System.out.println("3.- Conversiones de temperatura");
            System.out.println("4.-Numero positivos y negativos");
            System.out.println("5.- Tiendita");
            System.out.println("6.- Area y Perimetro");
            System.out.println("7.-Tabla");
            System.out.println("8.-Factorial");
            System.out.println("9.- Dibujitos");
            System.out.println("10.- Figura hueca");
            System.out.println("11.-Patrones");
            System.out.println("12.- Diamante");
            System.out.println("13.-Calculadora");
            System.out.println("14.- Salir");

            opcion = entrada.nextInt();

            // vamo a ponel nuestro swich
            switch (opcion) {
                case 1:
                    break;
                case 2:
                    System.out.println("Ingrese el numero positivo entero que desee convertir a binario");
                    numbinario = entrada.nextInt();
                    binario = "";
                    /* Tengo que comprobar que sea positivo */
                    if (numbinario > 0) {
                        // Debo de aplicar el algoritmo
                        while (numbinario > 0) {
                            if (numbinario % 2 == 0) {
                                binario = "0" + binario;
                            } else {
                                binario = "1" +
                                        binario;
                            }
                            numbinario = (int) numbinario / 2;
                            // when (int) es porque esta haciendo un casteo, o sea fuerza al programa a que
                            // al final si es un numero decimal se detenga
                        }
                    } else if (numbinario == 0) {
                        binario = "0";
                    } else {
                        binario = "No se pudo convertir el numero, ingrese solo positivos";
                    }
                    System.out.println("\n El numero binario es: " + binario);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    // vamos a ver un for
                    for (n = 1; n >= 10; n++) {
                        System.out.print(n + " " + (n * 10) + (n * 100) + (n * 1000));
                    }
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    System.out.println();
                    System.out.println();
                    n = entrada.nextInt();
                    if (n >= 1 && n <= 20) {
                        for (int i = 0; i < n; i++) {
                            for (int j = 0; j < n; j++) {
                                System.out.print("?");
                            }
                            System.out.print("*");
                        }
                    }

                    break;
                case 11:
                    break;
                case 12:
                    break;
                case 13:
                    // Calculadora
                    System.out.println("Ingresa el primer numero");
                    int a = entrada.nextInt();
                    System.out.println("Ingresa el segundo numero");
                    int b = entrada.nextInt();
                    System.out.println("Ingresa el tipo de operacion");
                    char ope = entrada.next().charAt(0);
                    switch (ope) {
                        case '+':
                            resultado = a + b;
                            System.out.println("La suma es de " + resultado);
                            break;
                        case '-':
                            resultado = a - b;
                            System.out.println("La resta es de " + resultado);
                            break;
                        case '*':
                            resultado = a * b;
                            System.out.println("El producto es de " + resultado);
                            break;
                        case '/':
                            if (b != 0) {
                                resultado = a / b;
                                System.out.println("La suma es de " + resultado);
                            }
                            break;
                        default:
                            System.out.println("Operacion no valida :v");
                    }
                    break;
                case 14:
                    break;

            }
            // desea repetir
            System.out.println("¿Desea repetir el programa? Si lo desea escriba s");

            letras = entrada.next().charAt(0);
        } while (letras == 's' || letras == 'S');
    }
}
