// TEMA #1
//*1. Crear una clase Rectángulo para representar un rectángulo. La clase contiene:

//a. Dos campos de tipo double llamados ancho y altura que especifica el ancho y la altura del rectángulo. Los valores por defecto son 1 para ambos valores

//b. Un constructor sin argumentos que crea un rectangulo con valores por defecto

//c. Un constructor que crea un rectangulo con dos variables de entrada ancho y altura

//d. Un método llamado getArea() que retorna el área de un rectangulo

//e. Un método llamado getPerimetro() que retorna el perímetro


public class Rectangulo {
   private double ancho= 1;
   private double altura = 1; 
   
   public Rectangulo(){}
   public Rectangulo(double ancho, double altura){
   this.ancho=ancho;
   this.altura=altura;
   }
   
   public double getAncho(){
       return ancho;
   }
   
   public double getAltura(){
       return altura;
   }
   
   public void Mostrar(){
       System.out.println("ANCHO : "+this.getAncho());
       System.out.println("ALTURA :"+this.getAltura());
   }
   
   public static void main(String [] args){
       System.out.println("##################");
       System.out.println("RECTANGULO # 1");
       Rectangulo rect1= new Rectangulo(4,40);
       rect1.Mostrar();
       System.out.println("##################");
       System.out.println("RECTANGULO # 2");
       Rectangulo rect2= new Rectangulo(3.5,35.9);
       rect2.Mostrar();
       System.out.println("##################");
   }
}
