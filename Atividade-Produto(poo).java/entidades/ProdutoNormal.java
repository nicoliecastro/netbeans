/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author aluno.den
 */
public class ProdutoNormal extends Produto {
    
    public ProdutoNormal(String nome, double preco){
        super(nome, preco);
    }
    
    @Override
    public String EtiquetaPreco(){
    return "Produto:" + nome + "\nPreço: R$" + String.format("%.2f",preco);
    }
    
}
