/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author aluno.den
 */
public class ProdutoImportado extends Produto {
    
    private double taxaAlfandega;
    public ProdutoImportado(String nome, double preco, double taxaAlfandega){
        
        super(nome,preco);
        this.taxaAlfandega=taxaAlfandega;
    }
    
    @Override
    public String EtiquetaPreco(){
        double precoFinal = preco + taxaAlfandega;
        return "Produto Importados" + nome +"\nPreço: R$ " + String.format("%.2f", precoFinal)+
                "\nTaxa de Alfandega é: R$" + String.format("%.2f", taxaAlfandega);
        
    }
    
}
