/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import entidades.Produto;
import entidades.ProdutoImportado;
import entidades.ProdutoNormal;
import entidades.ProdutoUsado;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class EtiquetaPreco {
    
    public static void main(String[] args){
    
        Scanner scanner = new Scanner(System.in);
        List<Produto> produtos = new ArrayList<>();
        
        System.out.println("Digite o número de produtos:");
        int N = scanner.nextInt();
        scanner.nextLine();
        
        for(int i = 0; i < N; i++){
            System.out.print("Digite o tipo de produto: (normal/importado/usado)");
        
        String tipo = scanner.nextLine();
        System.out.print("Digite o nome do produto:");
        String nome = scanner.nextLine();
        System.out.print("Digite o preço do produto:");
        double preco = scanner.nextDouble();
        
        switch (tipo.toLowerCase()){
            
            case "normal":
                produtos.add(new ProdutoNormal(nome, preco));
                break;
                
            case "importado":
                System.out.print("Taxa da Alfandega");
                double taxa = scanner.nextDouble();
                scanner.nextLine();
                produtos.add(new ProdutoImportado(nome, preco,taxa));
                break;
            
            case "usado":
                System.out.print("Data de fabricação (dd/mm/aa)");
                String data = scanner.nextLine();
                 scanner.nextLine();
                produtos.add(new ProdutoUsado(nome, preco, data));
                break;
                
            default:
                 System.out.print("Tipo de Produto não cadastrado");
                 i--;
                 break;
                    
        }
        }
        
         System.out.print("\nEtiqueta do Produto");
         for (Produto produto : produtos){
         System.out.println(produto.EtiquetaPreco());
         }
   
    }
    
}
