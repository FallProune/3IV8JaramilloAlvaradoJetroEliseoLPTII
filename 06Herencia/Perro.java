public class Perro extends Animal {
    /**
     * la palabra reservada extends es para heredar
     */

    private String ladrido;

    public Perro() {

    }

    public Perro(String nombre, String raza, String tipo_alimento, int edad, String ladrido) {

        super(nombre, raza, tipo_alimento, edad);
        this.ladrido = ladrido;
    }

    public String getLadrido() {
        return ladrido;
    }

    public void setLadrido(String ladrido) {
        this.ladrido = ladrido;
    }

    public void mostrarPerro() {

        System.out.println("El nombre del gato es: " + getNombre() + "\n"

                + "Su raza es: " + getRaza() + "\n"

                + "Se alimenta de: " + getTipo_alimento() + "\n"

                + "Su edad es: " + getEdad() + "\n"

                + "Su maullido es: " + getLadrido() + "\n");
    }
}
