public class Hamster extends Animal {
    private String chillido;

     public Hamster(){

     }

    public Hamster(String nombre, String raza, String tipo_alimento, int edad, String chillido){

        super(nombre, raza, tipo_alimento, edad);
        this.chillido = chillido;
    }

    public String getChillido(){
        return chillido;
    }

    public void setChillido(String chillido){
        this.chillido = chillido;
    }
    public void mostrarHamster(){

        System.out.println("El nombre del hamster es: " + getNombre() + "\n"

        + "Su raza es: " + getRaza() + "\n"

        +"Se alimenta de: " + getTipo_alimento() + "\n"

        +"Su edad es: " + getEdad() + "\n"

        +"Su chillido es: " + getChillido() + "\n");
    }
}
