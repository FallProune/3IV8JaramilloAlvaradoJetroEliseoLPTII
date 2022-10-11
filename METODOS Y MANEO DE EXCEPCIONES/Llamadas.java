/*
Nombre: Llamadas
Descripción: PROGRAMA QUE CALCULA EL COSTO DE LLAMADAS TELEFÓNICAS CELULARES, DEBERÁ CONTENER LAS SIGUIENTES VARIABLES, NUMERO DE CELULAR (INT), CREDITO(INT) Y MEDIANTE UN METODO SE PODRÁ CALCULAR EL COSTO TOTAL DE LLAMADAS LOCALES NACIONALES($0.5),LOCALESINTERNACIONALES($0.6) Y CELULARES ($0.2) Y SE DEBERÁ IR DESCONTANDO DEL CRÉDITO LAS LLAMADAS REALIZADAS, TAMBIÉN EXISTIRÁ UNA OPCIÓN Y MÉTODO PARA PODER INGRESAR Y CONSULTAR EL CREDITO.  
Autor: Jaramillo Alvarado Jetro Eliseo 3IV8
*/
import java.util.Scanner;
import java.lang.Math;
public class Llamadas{

 int credito;
 double costo;
 String numero = "";
 boolean pan;
 int opcion;
 int tipollamada;
 char letra;
 char respuesta;
 Scanner entrada =new Scanner(System.in);
 public void menu(){
    do{
        do{
            System.out.println("Programa de calcula el costo de llamadas telefonicas celulares");
            System.out.println("1.Costo total de las llamadas");
            System.out.println("2.Consultar o ingresar credito");
            
                pan= false;
                try {
                    opcion = entrada.nextInt();
                }catch(Exception e){
                    System.out.println("Opcion invalida");
                    entrada.nextLine();
                    pan = true;
                }
        }while(pan);
        switch(opcion){
            case 1:
            calcularCosto();
            break;
            case 2:
            calcularCredito();
            break;
            default:
            System.out.println("Hola, esa opcion no se encuentra disponible");
            break;

        } 

            System.out.println("desea repetir el programa, S para repetir");
            letra= entrada.next().charAt(0);
            
    
    }while(letra == 's' || letra == 'S');
 }

    public void calcularCosto(){
         do{
            try{
                numero = "";
                pan = false;
                System.out.println("Ingresa tu numero de telefono");
                numero = entrada.nextLine();
                System.out.println("Elige que tipo de llamada deseas hacer");
                System.out.println("1. Local nacional");
                System.out.println("2. Locales internacionales");
                System.out.println("3. Celulares");
                tipollamada = entrada.nextInt();
                switch(tipollamada){
                    case 1:
                        double numerodellamadas;
                        System.out.println("INGRESA EL NUMERO DE LLAMADAS RELALIZADAS");
                        numerodellamadas = entrada.nextDouble();
                        costo = (numerodellamadas * 0.5);
                        System.out.println("EL COSTO ES DE: " + costo);
                    break;
                    case 2:
                        double numerodellamadas2;
                        System.out.println("INGRESA EL NUMERO DE LLAMADAS RELALIZADAS");
                        numerodellamadas2 = entrada.nextDouble();
                        costo = (numerodellamadas2 * 0.6);
                        System.out.println("EL COSTO ES DE: " + costo);
                    break;
                    case 3:
                        double numerodellamadas3;
                        System.out.println("INGRESA EL NUMERO DE LLAMADAS RELALIZADAS");
                        numerodellamadas3 = entrada.nextDouble();
                        costo = (numerodellamadas3 * 0.2);
                        System.out.println("EL COSTO ES DE: " + costo);
                    break;

                    default: 
                    System.out.println("Hola, esa opcion no se encuentra disponible");
                    break;
                }


            }catch(Exception e){
                System.out.println("Ingrese solo numeros");
                System.out.println("Error:" + e.getMessage());
                entrada.nextLine();
                pan = true;

            }
        }while(pan);
        
    }
    public void calcularCredito(){
        do{
            try{
            
            pan = false;
            System.out.println("Tu credito es de:" + credito + "Indique cuanto credito desea ingresar");
            do{
            credito = entrada.nextInt();
            System.out.println("Tu credito ahora es de : " + credito);
            System.out.println("Desea ingresar otra cantidad? pulse S si es asi, de lo contrario pulse N");
            respuesta = entrada.next().charAt(0);
        }while(respuesta == 's' || respuesta == 'S');
            }
                catch(Exception e){
                System.out.println("Ingrese solo numeros ");
                entrada.nextLine();
            }
        }while(pan);
    }
}   