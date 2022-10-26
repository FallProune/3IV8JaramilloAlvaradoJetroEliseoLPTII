public class Conejo extends Animal {
    private String ronroneo;

    public Conejo(){

    }

    public Conejo(String nombre, String raza, String tipo_alimento, int edad, String ronroneo){

        super(nombre, raza, tipo_alimento, edad);
        this.ronroneo = ronroneo;
    }

    public String getRonroneo(){
        return ronroneo;
    }

    public void setRonroneo(String ronroneo){
        this.ronroneo = ronroneo;
    }
    public void mostrarConejo(){

        System.out.println("El nombre del gato es: " + getNombre() + "\n"

        + "Su raza es: " + getRaza() + "\n"

        +"Se alimenta de: " + getTipo_alimento() + "\n"

        +"Su edad es: " + getEdad() + "\n"

        +"Su maullido es: " + getRonroneo() + "\n");
    }
}
