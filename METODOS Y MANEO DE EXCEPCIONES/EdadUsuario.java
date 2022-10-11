/*
Nombre: EdadUsuario
Descripción: PROGRAMA QUE CALCULA LA EDAD DE UNA PERSONA, EL PROGRAMA DEBERÁ CONTENER UNA CLASE DONDE SE INDIQUEN LAS VARIABLES DE INSTANCIA, DEBERÁ EXISTIR UN METODO DONDE SE PIDAN LOS DATOS DE LA PERSONA  Y OTRO METODO PARA CALCULAR LA EDAD DE LA PERSONA. 
Autor: Jaramillo Alvarado Jetro Eliseo 3IV8
*/
import java.util.Scanner;
import java.lang.Math;
public class EdadUsuario{

 int fecha;
 String nombre;
 boolean pan;
 char letra;
 int opcion;
 int opcion2;
 Scanner entrada =new Scanner(System.in);
 public void menu(){
    do{
        do{
            System.out.println("Programa de calcula tu edad con tu fecha de nacimiento");
            System.out.println("Presiona 1 para iniciar el programa");
            
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
            entradaDatos();
            break;
            case 2:
            calcularEdad();
            break;
            default:
            System.out.println("Hola, esa opcion no se encuentra disponible");
            break;

        } 

            System.out.println("desea repetir el programa, S para repetir");
            letra= entrada.next().charAt(0);
            
    
    }while(letra == 's' || letra == 'S');
 }

    public void entradaDatos(){
         do{
            try{
              pan = false;
              System.out.println("ingresa el tu ano de nacimiento");
              fecha = entrada.nextInt();
              calcularEdad();

            }catch(Exception e){
              System.out.println("Ingrese solo numeros");
              System.out.println("Error:" + e.getMessage());
              entrada.nextLine();
              pan = true;

            }
        }while(pan);
        
    }
    public void calcularEdad(){
        do{
            try{
            pan = false;
            System.out.println("Tu edad es de: " + (2022 - fecha));
            
            }
                catch(Exception e){
                System.out.println("Ingrese solo numeros ");
                entrada.nextLine();
            }
        }while(pan);
    }
}