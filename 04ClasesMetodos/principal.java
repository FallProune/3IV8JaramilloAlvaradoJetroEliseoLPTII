class principal {

    // creamos el metodo principal
    public static void main(String[] args) {
        /**
         * vamos a realisar una instancia de la clase ejercicio para llamar o invocar al
         * menu
         */
        int valor=0;
        //valor = 10/0;  // Siempre truena
        
         
        try{
            valor = 10/0;  // Siempre truena
        }
        catch(ArithmeticException exception){
            System.out.println("La operacion no es valida");
        }
        

        Ejercicio men = new Ejercicio();
        men.menu();

    }
}
