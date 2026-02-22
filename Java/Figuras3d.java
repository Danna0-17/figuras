public abstract class Figuras3d extends Figuras {

    public Figuras3d(String nombre){
        super(nombre); //llamar al nombre del constructor de figuras 
    }

    public abstract double calcularVolumen();

        public void imprimirInfo3d(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("Área: " + calcularVolumen());
        System.err.println("----------------------");
    }
}
