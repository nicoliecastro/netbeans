/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula5.java;

/**
 *
 * @author nicol
 */
public class ContaBanco {
    
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco(float saldo, boolean status) {
        this.saldo = 0;
        this.status = false;
    }

    public int getNumConta() {
        return numConta;
    }
    
    public void setNumConta(int n) {
        this.numConta = n;
    }

    public String getTipo(){
        return tipo;
    }
    
      public void setTipo(String t) {
        this.tipo = t;
    }

    public String getDono() {
        return dono;
    }
    
     public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }
    
    
    public void setSaldo(float v) {
        this.saldo = v;
    }
    

    private boolean getStatus(){
        return status;
    }


    private void setStatus(boolean status) {
        this.status = status;
    } 
    
  
    public void abrirConta(String t){
      tipo = t;
      status = true;
      
      if(t.equals("CC")){
        saldo = 50;
      }else if(t.equals("CP")){
        saldo = 150;
      }
    }
    
    
    public void fecharConta(){
      
      if (saldo > 0){
       System.out.println("Conta com dinheiro.");
      }else if(saldo < 0){
       System.out.println("Conta em débito.");
      } else{
        setStatus(false);
      }

    }   
    
    public void depositar(float v){
      if(status = true){
      saldo = saldo + v;
      }else {
       System.out.println("Impossivel depositar");
      }
    }
    
    public void sacar(float v){
       if(status = true){
         if(saldo > v){
         saldo = saldo - v;
         }else{
         System.out.println("Saldo insuficiente.");
         }
       }else{
        System.out.println("Impossiível sacar");
       }
    }
    
    public void pagarMensal(String t){
        
        float v = 0;
        
        if (t.equals ("CC")){
          v = 12;
        }else if (t.equals("CP")){
          v = 20; 
        }
        
        if(status = true){
          if( saldo > v ){
          saldo = saldo - v;
          }else{
          System.out.println("Saldo insuficiente");
          }
        } else {
             System.out.println("Impossível pagar");
        }
    }
         
    
}
