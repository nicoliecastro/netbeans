/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package entidades;

public class ContaEspecial extends Conta {
    private double limiteEmprestimo;

    public ContaEspecial(int numero, String titular, double saldoInicial, double limiteEmprestimo) {
        super(numero, titular, saldoInicial);
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public double getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public void setLimiteEmprestimo(double limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public void emprestimo(double quantia) {
        if (quantia <= limiteEmprestimo) {
            saldo += quantia - 10.0;  // Taxa de empréstimo de 10.0
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Limite de Empréstimo: R$ " + String.format("%.2f", limiteEmprestimo);
    }
}
