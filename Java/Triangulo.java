public class Triangulo extends Figuras2d{
    protected  double altura;
    protected double base;

    public Triangulo(String nombre, double altura, double base){
        super(nombre);
        this.altura=altura;
        this.base=base;
    }

    @Override
    public double calcularArea(){
        //formula areaTriangulo: (base*altura)/2;
        return (base*altura)/2;
        
    }
    
}
