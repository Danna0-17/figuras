

public class Main {
   public static void main(String[] args) {

       // se crean los objetos para cumplir con las historias de usuario

       //figuras 2d:
       System.out.println("----Figuras 2d-----");
       Circulo circuloUno=new Circulo("Circulo", 23);
       circuloUno.imprimirInfo2d();

       Cuadrado cuadradoUno=new Cuadrado("Cuadrado", 12);
       cuadradoUno.imprimirInfo2d();

       Triangulo trianguloUno=new Triangulo("Triangulo", 9, 15);
       trianguloUno.imprimirInfo2d();

       System.out.println("----Figuras 3d-----");
       Cubo cuboUno=new Cubo("CuboUno", 10);
       cuboUno.imprimirInfo3d();

       Piramide piramideUno=new Piramide("Piramide", 18, 25);
       piramideUno.imprimirInfo3d();

       Prisma prismaUno=new Prisma("Prisma", 16, 14, 20);
       prismaUno.imprimirInfo3d();
             
            
   }
}