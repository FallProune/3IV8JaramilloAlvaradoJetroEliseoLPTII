/*
Nombre: Abono
Descripción: PROGRAMA QUE DEBE SOLICITAR LA EDAD DEL USUARIO. SI ÉSTA ES MAYOR DE 65, AL PRECIO DEL ABONO SE LE APLICA UN DESCUENTO DEL 40%. SI LA EDAD ES MENOR QUE 21, SE PREGUNTA AL USUARIO SI SUS PADRES SON SOCIOS. SI LA RESPUESTA ES AFIRMATIVA, SE LES APLICA UN DESCUENTO DEL 45%; EN CASO CONTRARIO, SE LES APLICA UN 25%.
Autor: Jaramillo Alvarado Jetro Eliseo 3IV8
*/
import java.util.Scanner;
class Abono{
  public static void main(String []args){
    Scanner teclado = new Scanner(System.in);
    int edad = 0;
    double abono = 0;
    double descuento = 0;
    int socio = 0;

    System.out.println("Programa hecho por: Jetro Eliseo Jaramillo Alvarado :33 hola profe");
    System.out.println("Ingresa tu edad");
    edad = teclado.nextInt();
    System.out.println("Ingresa el precio de tu abono");
    abono = teclado.nextDouble();
    if(edad >= 65 && edad <= 130){
      descuento = abono - abono*0.4;
      System.out.println("Precio con el 40% de descuento es de: " + descuento );
    }
    else if(edad <21 && edad>0){
      System.out.println("Tus padres son socios? escribe 1 si lo son, de lo contrario escribe 2");
      socio = teclado.nextInt();
      switch(socio){
        case 1:
          descuento = abono - abono*0.45;
          System.out.println("El precio de tu abono por ser socio y ser menor de 21 anos es ahora de: " + descuento);
          break;
        case 2:
          descuento = abono - abono*0.25;
          System.out.println("El precio de tu abono por solo ser menor de 21 anos es de: " + descuento);
          break;
      }
      } else if(edad >=21  && edad<= 65){
      System.out.println("No resiviras descuento unu");
    }
    else{
      System.out.println("Edad no valida :v");
    }
  }
      
 }