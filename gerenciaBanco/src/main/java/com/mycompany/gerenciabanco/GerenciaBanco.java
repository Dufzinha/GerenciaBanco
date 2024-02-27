package com.mycompany.gerenciabanco;
import java.util.Scanner;

public class GerenciaBanco {

    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bem-vindo ao gerenciamento bancario!");
        
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("Digite seu sobrenome: ");
        String sobrenome = scanner.nextLine();
        
        System.out.print("Informe seu CPF: ");
        String cpf = scanner.nextLine();
        
        ContaBancaria conta = new ContaBancaria(nome, sobrenome, cpf);
        
        int opcao = 0;
        do {
            System.out.println("\nEscolha uma opcao:");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Realizar saque");
            System.out.println("4. Encerrar");
            System.out.print("Opcao escolhida: ");
            
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.println("Saldo atual: R$" + conta.consultarSaldo());
                    break;
                case 2:
                    System.out.print("Digite o valor a ser depositado: R$");
                    double valorDeposito = scanner.nextDouble();
                    conta.depositar(valorDeposito);
                    break;
                case 3:
                    System.out.print("Digite o valor a ser sacado: R$");
                    double valorSaque = scanner.nextDouble();
                    conta.sacar(valorSaque);
                    break;
                case 4:
                    System.out.println("Encerrando a aplicacao.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opcao invalida. Tente novamente.");
                    break;
            }
            
            scanner.nextLine(); // limpar o buffer do scanner
        } while (opcao != 4);
    }
}
