import java.util.Scanner;
import java.lang.Math;
public class Figura{



    //Math sirve para  realizar calculos de pote
 double lado, altura, area, perimetro, lado2, lado3;
 int opcion;
 char letra;
 boolean pan;
 
 //obejeto
 Scanner entrada =new Scanner(System.in);
 public void menu(){
    do{
        System.out.println("Programa de calculo de areas y perimetros");
        System.out.println("1.Cuadrado");
        System.out.println("2.Triangulo");
        System.out.println("3.Circulo");
        System.out.println("4.Pentagono");
        System.out.println("5.Decagono");
        opcion = entrada.nextInt();
        switch(opcion){
            case 1:
            calcularCuadrado();
            break;
            case 2:
            //calcularTriangulo();
            break;
            case 3:
            //calcularCirculo();
            break;
            case 4:
            //calcularPentagono();
            break;
            case 5:
            //calcularDecagono();
            break;
            default:
            System.out.println("Hola");
            break;

        } 
        System.out.println("desea repetir el programa, S para repetir");
        letra= entrada.next().charAt(0);
    
    }while(letra == 's' || letra == 'S');
 }

public void calcularCuadrado(){
    do{
        try{
            pan = false;
            System.out.println("ingrese el valor del lado del cuadrado");
            lado = entrada.nextDouble();
            perimetro = lado*4;
            area = lado*lado;
            System.out.println("El perimetro es de " + perimetro + ". El area es: " + area);

        }catch(Exception ex){
            System.out.println("Ingrese solo numeros");
            System.out.println("Error:" + ex.getMessage());
            entrada.nextLine();
            pan = true;
            
        }
    }while(pan); 
}
}