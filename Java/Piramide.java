public class Piramide extends Figuras3d {
    protected double areaDeBase;
    protected double altura;

    public Piramide(String nombre,double areaDeBase, double altura ){
        super(nombre);
        this.areaDeBase=areaDeBase;
        this.altura=altura;

    }

    @Override
    public double calcularVolumen(){
        //(base*altura)/3
        return (areaDeBase*altura)/3;
        
    }
}
