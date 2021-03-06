
package ObjetoGeometrico;

/**
 *
 * @author Dayanara
 */
public class Triangulo extends ObjetoGeometrico  {
      public Triangulo(){
        
    }
    public Triangulo(double lado1, double lado2,double lado3){
        this.Lado1=lado1;
        this.Lado1=lado2;
        this.Lado3=lado3;
        
    }
     public void setLado1(double Lado1) {
        this.Lado1 = Lado1;
    }

    public void setLado2(double Lado2) {
        this.Lado2 = Lado2;
    }

    public void setLado3(double Lado3) {
        this.Lado3 = Lado3;
    }

    public double getLado1() {
        return Lado1;
    }

    public double getLado2() {
        return Lado2;
    }

    public double getLado3() {
        return Lado3;
    }

    public double getArea() {
        double res=(Lado1+Lado2)/2;
        return res;
    }

    public double getPerimetro() {
        double res1=(Lado1+Lado2+Lado3);
        return res1;
    }
public void Mostrar(){
    System.out.println("LADO1 : " + getLado1());
    System.out.println("LADO2 : " + getLado2());
    System.out.println("LADO3 : " + getLado3());
    System.out.println("AREA : "  + getArea());
    System.out.println("PERIMETRO : " + getPerimetro());
}
 public static void main(String[] args) {
        System.out.println("##############################################");
        System.out.println("VALORES POR DEFECTO DEL TRIANGULO");
        System.out.println("##############################################");
        Triangulo trian=new Triangulo();
        trian.Mostrar();
        System.out.println("##############################################");
        System.out.println("VALORES INGRESADO POR EL USUARIO DEL TRIANGULO");
        System.out.println("##############################################");
        Triangulo trian1=new Triangulo();
        trian1.setLado1(1);
        trian1.setLado2(1.5);
        trian1.setLado3(1);
        trian1.Mostrar();
        System.out.println("##############################################");
    }
}
