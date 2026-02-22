
public abstract class Figuras2d extends Figuras{

    public Figuras2d(String nombre) {
        super(nombre);
    }

    public abstract double calcularArea();

    public void imprimirInfo2d(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("Área: " + calcularArea());
        System.err.println("----------------------");
    }

    @Override
    public String toString() {
        return "Figuras2d []";
    }

}
