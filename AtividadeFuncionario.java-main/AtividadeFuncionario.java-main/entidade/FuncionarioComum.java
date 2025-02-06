/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package entidade;

public class FuncionarioComum extends Funcionario
{
    public FuncionarioComum(String nome, int horaTrabalhada, float valorHora)
    {
        super(nome, horaTrabalhada, valorHora);
    }
    
    @Override
    public float pagamento()
    {
        return horaTrabalhada * valorHora;
    }
    
    @Override
    public String exibirDados()
    {
        float pagamentoFinal = pagamento();
        
        return "\nNome do funcionaário: " + nome
                + "\nHora trabalhadas: " + horaTrabalhada
                + "\nValor da hora trabalhada: R$ " + String.format("%.2f", valorHora)
                + "\nPagamento final: R$ " + String.format("%.2f", pagamentoFinal);
    }
}
