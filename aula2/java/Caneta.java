/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula2.java;

/**
 *
 * @author nicol
 */
public class Caneta {
    
    public String modelo;
    public String cor;
    public float ponta;
    protected int carga;
    private boolean tampada;
    
    void status(){
    
    System.out.println("Modelo:" + this.modelo);
    System.out.println("Uma caneta" + this.cor);
    System.out.println("Ponta" + this.ponta);
    System.out.println("Carga" + this.carga);
    System.out.println("Está tampada?" + this.tampada); 
    }
    public void rabiscar(){
      if (this.tampada = true){
            System.out.println("ERRO! não posso rabiscar"); 
      } else {
        System.out.println("Estou rabiscando");
      }      
      }
    
    
     public void tampar(){
      this.tampada = true;   
    }
     
      public void destampar(){
      this.tampada = true;   
    }
    
}
