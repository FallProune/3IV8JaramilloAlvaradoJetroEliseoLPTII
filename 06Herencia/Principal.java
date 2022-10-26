import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int mascota;
        char opcion; 

        System.out.println("Elige que mascota de nuestra tienda te gustaria que te presentemos 7w7");
        System.out.println("1. Perro");
        System.out.println("2. Gato");
        System.out.println("3. Conejo");
        System.out.println("4. Hamster");
        System.out.println("5. Huron");

        mascota = entrada.nextInt();

        do{
            switch(mascota){
                case 1:
                Perro objperro = new Perro("Pulgas", "de calle", "croquetas", 2, "hace guau guau");
                objperro.mostrarPerro();
                break;

                case 2:
                Gato objgato = new Gato("Michitl", "de calle", "atun", 1, "hace miau", 7);
                objgato.mostrarGato();
                break;

                case 3:
                Conejo objconejo = new Conejo("Tambor", "Belier enano ", "Znahorias", 1, "hace brrrrrrrr");
                objconejo.mostrarConejo();
                break;

                case 4:
                Hamster objhamster = new Hamster("Papu", "Chino", "Platano", 1, "hace kikikiki");
                objhamster.mostrarHamster();
                break;

                case 5:
                Huron objhuron = new Huron("Luz", "Del rio", "moluscos, gusanos y tuberculos", 3, "hace hhhhhhhhh");
                objhuron.mostrarHuron();
                break;
            }
            System.out.println("Deseas ver otra de nuestras mascotas?? :D, SI ES ASÍ PON 'S', si no, 'N'." + "\n" + " Gracias por usar nuestro programa :D");
            opcion = entrada.next(). charAt(0);
    
        }while(opcion == 'S' || opcion == 's');
        
    }
}
