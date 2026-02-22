public class Cubo extends Figuras3d {
    protected double longitudDeLado;

    public Cubo(String nombre,double longitudDeLado){
        super(nombre);
        this.longitudDeLado=longitudDeLado;

    }

    @Override
    public double calcularVolumen(){
        //lado**3
        return (Math.pow(longitudDeLado,3)); 
        
    }
    
}
