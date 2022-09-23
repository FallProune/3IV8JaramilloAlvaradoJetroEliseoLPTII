/*
Nombre: NumBinarios
Descripción: PROGRAMA PARA CONVERTIR UN NÚMERO DECIMAL N DADO POR TECLADO A BINARIO. 
Autor: Jaramillo Alvarado Jetro Eliseo 3IV8
*/
import java.util.Scanner;
class NumBinario{
  public static void main(String []args){
    Scanner entrada = new Scanner(System.in);
    int numbinario = 0;
    String binario = "";
    System.out.println("Programa hecho por: Jetro Eliseo Jaramillo Alvarado :33 hola profe");
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
                            }
                        }
                
