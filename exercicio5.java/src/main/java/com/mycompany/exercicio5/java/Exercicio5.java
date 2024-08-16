/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio5.java;

import java.util.Scanner;

/**
 *
 * @author aluno.den
 */
public class Exercicio5Java {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double renda;
        double valorAPagar = 0;
        
        System.out.print("Digite o valor da renda:");
        renda = sc.nextDouble();
        
        if (renda < 0){
            System.out.println("Valor inserido inválido para calcular");
        } else if (renda <= 2000 && renda >=0){
            System.out.println("Isento de imposto de renda");
        } else if (renda <= 3000 && renda > 2000){
            valorAPagar = ((renda - 3000) * 0.18);
        } else if (renda <= 4500 && renda > 3000){
             valorAPagar = ((renda - 3000) * 0.28) + 80;
        } else {
            valorAPagar = ((renda - 4500) * 0.28) + 350;
        }
            
                
        System.out.printf("Valor a pagar: R$%.2f", valorAPagar);
        
        sc.close();
    }
}
