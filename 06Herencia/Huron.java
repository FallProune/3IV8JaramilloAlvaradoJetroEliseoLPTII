public class Huron extends Animal{
    private String dokeo;

    //no sabia que los hurones hacian sonidos xd, al paracer dokean

     public Huron(){

     }

     public Huron(String nombre, String raza, String tipo_alimento, int edad, String dokeo){

        super(nombre, raza, tipo_alimento, edad);
        this.dokeo = dokeo;
     }

     public String getDokeo(){
        return dokeo;
     }

     public void setDokeo(String dokeo){
        this.dokeo = dokeo;
     }
     public void mostrarHuron(){

        System.out.println("El nombre del huron es: " + getNombre() + "\n"

        + "Su raza es: " + getRaza() + "\n"

        +"Se alimenta de: " + getTipo_alimento() + "\n"

        +"Su edad es: " + getEdad() + "\n"

        +"Su dokeo es: " + getDokeo() + "\n");
    }
}
