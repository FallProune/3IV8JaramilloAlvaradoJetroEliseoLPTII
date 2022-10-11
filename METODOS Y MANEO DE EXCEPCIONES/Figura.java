/*
Hola profe, encontre una manera de usar el try cacth con el do y con el pan XD.
Si me salio xdm y si corre en el visual
Nombre: Figura
Descripción: PROGRAMA QUE CALCULA EL AREA Y PERIMETRO DE UN CIRCULO, RECTÁNGULO, CUADRADO Y TRIÁNGULO, EL PROGRAMA DEBERÁ CONTENER UNA CLASE DONDE SE INDIQUEN LAS VARIABLES DE INSTANCIA, DEBERÁN EXISTIR LOS MÉTODOS DONDE SE CALCULEN EL ÁREA Y EL PERÍMETRO PARA CADA FIGURA.
Autor: Jaramillo Alvarado Jetro Eliseo 3IV8
NO SE COMO SE CORRE EN REPLI PROFE PERO EN VISUAL SI FURULA BIEN :D
*/
import java.util.Scanner;
import java.lang.Math;
public class Figura{

 double lado, altura, area,radio, perimetro, lado2, lado3;
 int opcion;
 char letra;
 boolean pan;
 
 Scanner entrada =new Scanner(System.in);
 public void menu(){
    do{
        do{
            System.out.println("Programa de calculo de areas y perimetros");
            System.out.println("1.Cuadrado");
            System.out.println("2.Triangulo");
            System.out.println("3.Circulo");
            System.out.println("4.Rectangulo");
            
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
            calcularCuadrado();
            break;
            case 2:
            calcularTriangulo();
            break;
            case 3:
            calcularCirculo();
            break;
            case 4:
            calcularRectangulo();
            break;
            default:
            System.out.println("Hola, esa opcion no se encuentra disponible");
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

            }catch(Exception e){
                System.out.println("Ingrese solo numeros");
                System.out.println("Error:" + e.getMessage());
                entrada.nextLine();
                pan = true;

            }
        }while(pan);
        
    }
    public void calcularTriangulo(){
        do{
            try{
            pan = false;
            System.out.println("ingrese el valor de la base del triangulo");
            lado = entrada.nextDouble();
            System.out.println("ingrese el valor del lado del triangulo");
            lado2 = entrada.nextDouble();
            System.out.println("ingrese el valor del otro lado del triangulo");
            lado2 = entrada.nextDouble();
            System.out.println("ingrese el valor de la altura del triangulo");
            altura = entrada.nextDouble();
            
            perimetro = lado + lado2 + lado3;
            area = (lado*altura)/2 ;
            
            System.out.println("El perimetro es de " + perimetro + ". El area es: " + area);
            }
                catch(Exception e){
                System.out.println("Ingrese solo numeros ");
                System.out.println("Error:" + e);
                entrada.nextLine();
                pan = true;
        
            }
        }while(pan);
    }
    public void calcularCirculo(){
        do{
            try{
            pan = false;
            System.out.println("ingrese el valor del radio del circulo");
            radio = entrada.nextDouble();
            
            perimetro = (radio*2)*3.1416;
            area = 3.1416* Math.pow(radio,2);
            
            System.out.println("El perimetro es de " + perimetro + ". El area es: " + area);
            }
                catch(Exception e){
                System.out.println("Ingrese solo numeros");
                System.out.println("Error:" + e);
                entrada.nextLine();
                pan = true;
        
            }
        }while(pan);
    }
    public void calcularRectangulo(){
        do{
            try{
            pan = false;
            System.out.println("ingrese el valor de la base del Rectangulo");
            lado = entrada.nextDouble();
            System.out.println("ingrese el valor de la altura del Rectangulo");
            altura = entrada.nextDouble();
            
            perimetro = lado + lado + altura + altura;
            area =lado*altura ;
            
            System.out.println("El perimetro es de " + perimetro + ". El area es: " + area);
            }
                catch(Exception e){
                System.out.println("Ingrese solo numeros");
                System.out.println("Error:" + e);
                entrada.nextLine();
                pan = true;
        
            }
        }while(pan);
    }
    

}
