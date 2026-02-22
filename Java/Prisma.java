public class Prisma extends Figuras3d{ // es un prisma rectangular 
    protected double largo;
    protected double ancho;
    protected double altura;

    public Prisma(String nombre,double largo, double ancho, double altura){
        super(nombre);
        this.largo=largo;
        this.ancho=ancho;
        this.altura=altura;

    }

    @Override
    public double calcularVolumen(){
        //l*ancho*altura
        return  (largo*ancho*altura); 
        
    }
    
}
