package Zoo.animais;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */




import java.util.Scanner;

import java.util.Scanner;

public class ZooApplication {
    public static void main(String[] args) {
        ZooManager zooManager = new ZooManager();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nSistema de Gerenciamento de Zoológico");
            System.out.println("1. Registrar novo animal");
            System.out.println("2. Listar todos os animais");
            System.out.println("3. Ouvir som de todos os animais");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do animal: ");
                    String nome = scanner.nextLine();
                    System.out.println("Escolha o tipo de animal: 1. Leão 2. Elefante 3. Papagaio");
                    int tipo = scanner.nextInt();
                    scanner.nextLine(); // Consumir a nova linha

                    Animal animal;
                    switch (tipo) {
                        case 1:
                            animal = new Leao(nome);
                            break;
                        case 2:
                            animal = new Elefante(nome);
                            break;
                        case 3:
                            animal = new Papagaio(nome);
                            break;
                        default:
                            System.out.println("Tipo de animal inválido.");
                            continue;
                    }
                    zooManager.adicionarAnimal(animal);
                    break;

                case 2:
                    zooManager.listarAnimais();
                    break;

                case 3:
                    zooManager.emitirSomDeTodosAnimais();
                    break;

                case 4:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);

        scanner.close();
    }
}
