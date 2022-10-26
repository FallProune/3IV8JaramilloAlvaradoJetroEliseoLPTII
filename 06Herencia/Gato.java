public class Gato extends Animal{
    /**la palabra reservada extends es para heredar 
     */

     private String maullido;
     private int numVidas;

     public Gato(){

     }

     public Gato(String nombre, String raza, String tipo_alimento, int edad, String maullido, int numVidas){

        super(nombre, raza, tipo_alimento, edad);
        this.maullido = maullido;
     }

     public String getMaullido(){
        return maullido;
     }

     public void setMaullido(String maullido){
        this.maullido = maullido;
     }

     public int getNumVidas(){
      return numVidas;
   }

   public void setNumVidas(int NumVidas){
      this.numVidas = NumVidas;
   }
     public void mostrarGato(){

        System.out.println("El nombre del gato es: " + getNombre() + "\n"

        + "Su raza es: " + getRaza() + "\n"

        +"Se alimenta de: " + getTipo_alimento() + "\n"

        +"Su edad es: " + getEdad() + "\n"

        +"Su maullido es: " + getMaullido() + "\n"

        +"Su numero de vidas es:  " + getNumVidas() + "\n");
     }
}
