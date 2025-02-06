/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidade;


public abstract class Funcionario 
{
    protected String nome;
    protected int horaTrabalhada;
    protected float valorHora;
    
    public Funcionario(String nome, int horaTrabalhada, float valorHora)
    {
        this.nome = nome;
        this.horaTrabalhada = horaTrabalhada;
        this.valorHora = valorHora;
    }
    
    public abstract float pagamento();    
    public abstract String exibirDados();
}