/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidade;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PagamentoFuncionario 
{
    public static void main(String[] args) 
    {
        String nome;        
        float valorHora;
        int loop = 0,
            horaTrabalhada,
            quantFuncionario;
        
        Scanner scan = new Scanner(System.in);
        List<Funcionario> funcionarios = new ArrayList<>();                
        
        System.out.print("Insira a quantidade de funcionários para realizar os cálculos: ");
        quantFuncionario = scan.nextInt();
        scan.nextLine();
        
        while (loop < quantFuncionario)
        {
            System.out.printf("\nInforme o nome do %dº funcionário: ", loop+1);
            nome = scan.nextLine();
            System.out.print("Informe a quantidade de horas trabalhadas: ");
            horaTrabalhada = scan.nextInt();
            System.out.print("Informe o valor recebido por hora trabalhada: ");
            valorHora = scan.nextFloat();
            System.out.print("Informe se o funcionário é terceirizado digitando SIM ou NAO: ");
            String tipoFuncionario = scan.next().toLowerCase();

            // Validando o tipo de funcionário e passando as informações do ArrayList
            
            switch (tipoFuncionario) 
            {
                case "SIM" :
                case "sim" :
                    System.out.print("\nInforme o valor da despesa adicional: ");
                    float despesaAdicional = scan.nextFloat();
                    funcionarios.add(new FuncionarioTerceirizado(nome, horaTrabalhada, valorHora, despesaAdicional));
                    scan.nextLine();
                    break;
                    
                case "NAO":
                case "nao":
                    funcionarios.add(new FuncionarioComum(nome, horaTrabalhada, valorHora));
                    scan.nextLine();
                    break;
            }
            
            // Iteração do laço para alcançar a quantidade de funcionários cadastrados
            
            loop++;
        }
        
        // Laço ForEach para exibir o ArrayList
        
        System.out.println("\nTabela de Pagementos de Funcionários");
        for (Funcionario func : funcionarios)
        {
            System.out.println(func.exibirDados());
        }
    }
}