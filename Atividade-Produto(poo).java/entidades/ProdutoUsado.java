/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author aluno.den
 */
public class ProdutoUsado extends Produto {
    
    private String dataFabricacao;
    
    public ProdutoUsado (String nome, double preco, String dataFabricacao){
    super (nome, preco);
    }
    
    @Override
    public String EtiquetaPreco(){
        
        return "Produto Usado: " + nome + "\nPreço: R$" + String.format(".2f", preco)
                +"\nData de Fabricação: " + dataFabricacao;
    
}
    
}
