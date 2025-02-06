/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidade;


public class FuncionarioTerceirizado extends Funcionario
{
    private float bonus = 1.10f; // Valor equivale a 110
    private float despesaAdicional;
    
    public FuncionarioTerceirizado(String nome, int horaTrabalhada, float valorHora, float despesaAdicional)
    {
        super(nome, horaTrabalhada, valorHora);        
        this.despesaAdicional = despesaAdicional;
    }
    
    @Override
    public float pagamento()
    {
        float salario = horaTrabalhada * valorHora,
              acrescimo = despesaAdicional * bonus;
        return salario + acrescimo;
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
