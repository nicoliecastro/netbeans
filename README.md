/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author aluno.den
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        int codigo;
        float preco = 0.0f;
        int quantidade = 0;
        float valorAPagar = 0.0f;
        
       System.out.println("Escolha o código:");
       codigo = sc.nextInt();
       
       System.out.println("Digite a quantidade");
       quantidade = sc.nextInt();
       
       if (codigo == 1){
           valorAPagar = 4 * quantidade;
           
       } else if(codigo == 2){   
           valorAPagar = 4.5f * quantidade;
           
       } else if(codigo == 3){ 
           valorAPagar = 5 * quantidade;
           
       } else if(codigo == 4){
           valorAPagar = 2 * quantidade;
           
       } else if(codigo == 5){
           valorAPagar = 1.5f * quantidade;
           
       } else{       
           
           System.out.println("CÓDIGO INVÁLIDO");
       }
       
       System.out.printf("TOTAL: R$ %.2f", valorAPagar);
       
    }
}
