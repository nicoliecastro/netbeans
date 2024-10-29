/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author aluno.den
 */
public class carro extends veiculo
{
    private String numeroportas;
    
    public carro (String numeroportas, String marca, String modelo)
    {
        super(marca, modelo);        
        this.numeroportas = numeroportas;
    }
   
   @Override
    public String dirigir()
    {
       return "um carro";
    }
  
    
    @Override
    public String exibirdetalhes()
    {
         String dirigindo = dirigir();
        
        return "\nNome da marca: " + marca
                + "\nModelo do veículo: " + modelo
                + "\nNúmero de portas: " + numeroportas
                + "\nDirigindo" + String.format(dirigindo);
    }

}
