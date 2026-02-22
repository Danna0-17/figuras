

public class Circulo extends Figuras2d {
    protected double radio;

    public Circulo(String nombre, double radio){
        super(nombre);
        this.radio=radio;
    }


    @Override
    public double calcularArea(){
        // pi*(radio**2)
        return Math.PI * Math.pow(radio, 2);
        
    }
    
}
