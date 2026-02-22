// clase abstracta para que no se puedan crear objetos de clase figura solamente, ya que siempre se crea una figura en especifico

abstract public class Figuras{ 

    protected String nombre;
    
    public Figuras(String nombre){
        this.nombre = nombre;
    }

    //obtener el nombre luego en el main
    public String getNombre(){
        return nombre;
    }
}
    