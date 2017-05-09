/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dayanara
 */
public class Cuenta {
    
    private int id = 0;
    private double saldo =0 ;
    double retiro=0;
    double deposito=0;
    private double interesAnual = 0;

    
    public void  cuenta () {}
    public void cuenta (int id, double saldo,double retiro,double deposito) {
    this.id = id ;
    this.saldo = saldo ;   
    }
    public int getId() {
        return id;   
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getInteresAnual() {
        return interesAnual;
    }
    public void setInteresAnual(double interesAnual) {
        this.interesAnual = interesAnual;
    }
    
    public void setRetiro(double retiro){
        this.retiro=retiro;
    }

  
    
    public double getInteresMensual () {
       double re = this.saldo * 0.045 ;
       return re ; 
    }
    public double Retiro() {
       double re1 = this.saldo - retiro + deposito;
       return re1;
    }
    public double Deposito () {
      
    double re2 = this.saldo + deposito ; 
    return re2;
    }
    public void mostrar (){
        System.out.println("#########################");
        System.out.println("===== CUENTA BANCARIA ===");
        System.out.println("=========================");
        System.out.println("ID: " +this.getId () );
        System.out.println("=========================");
        System.out.println("SALDO: " +this.getSaldo());
        System.out.println("=========================");
        System.out.println("RETIRO: " +this.retiro);
        System.out.println("=========================");
        System.out.println("DEPOSITO: "+deposito);
        System.out.println("=========================");
        System.out.println("SALDO DISPONIBLE :" +Retiro());
        System.out.println("=========================");
        System.out.println("INTERES MENSUAL:" +this.getInteresMensual ());
        System.out.println("#########################");
        
    }
    
    public static void main(String[] args) {
        Cuenta p1 = new Cuenta ();
        p1.id = 1123;
        p1.saldo = 20000;
        p1.retiro= 250;
        p1.deposito=250;
        p1.mostrar () ;
        
          
   }

   

    
}
