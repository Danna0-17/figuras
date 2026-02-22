public class Cuadrado extends Figuras2d{
    protected double lado;

    public Cuadrado(String nombre, double lado){
        super(nombre);
        this.lado=lado;
    }

    @Override
    public double calcularArea(){
        return (lado*lado);
    
    }
}