/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author aluno.den
 */
public class moto extends veiculo
{
    private int cilindradas;
    
    public moto (int cilindradas, String marca, String modelo)
    {
        super(marca, modelo);        
        this.cilindradas = cilindradas;
    }
    
     @Override
    public String dirigir()
    {
       return "uma moto";
    }
  
    
    @Override
    public String exibirdetalhes()
    {
         String dirigindo = dirigir();
        
        return "\nNome da marca: " + marca
                + "\nModelo do veículo: " + modelo
                + "\nNúmero de portas: " + cilindradas
                + "\nDirigindo" + String.format(dirigindo);
    }
}
