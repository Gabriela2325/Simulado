// package br.edu.up.View;

// import br.edu.up.Controller.ControleDePessoas;

// import java.util.List;
// import java.util.Scanner;

// public class TelaPrincipal {

//     private ControleDePessoas controleDePessoas;

//     public TelaPrincipal() {
//         this.controleDePessoas = new ControleDePessoas();
//     }

//     public void mostrarMenuPrincipal() {
//         Scanner scanner = new Scanner(System.in);
//         int opcao;

//         do {
//             System.out.println("\n=== Menu Principal ===");
//             System.out.println("1. Mostrar Pessoas com Endereço");
//             System.out.println("2. Gerar Pessoas com Endereço");
//             System.out.println("3. Sair");
//             System.out.print("Escolha uma opção: ");
//             opcao = scanner.nextInt();

//             switch (opcao) {
//                 case 1:
//                     mostrarPessoasComEndereco();
//                     break;
//                 case 2:
//                     gerarPessoasComEndereco();
//                     break;
//                 case 3:
//                     System.out.println("Saindo...");
//                     break;
//                 default:
//                     System.out.println("Opção inválida. Tente novamente.");
//             }
//         } while (opcao != 3);

//         scanner.close();
//     }

//     private void mostrarPessoasComEndereco() {
//         List<String[]> pessoasComEndereco = controleDePessoas.obterPessoasComEndereco();

//         if (pessoasComEndereco.isEmpty()) {
//             System.out.println("Não há pessoas com endereço cadastrado.");
//         } else {
//             System.out.println("\n=== Pessoas com Endereço ===");
//             for (String[] pessoa : pessoasComEndereco) {
//                 System.out.println("Código: " + pessoa[0]);
//                 System.out.println("Nome: " + pessoa[1]);
//                 System.out.println("Rua: " + pessoa[2]);
//                 System.out.println("Cidade: " + pessoa[3]);
//                 System.out.println();
//             }
//         }
//     }

//     private void gerarPessoasComEndereco() {
//         controleDePessoas.gerarPessoasComEndereco();
//         System.out.println("Arquivo PessoasComEndereco.csv gerado com sucesso.");
//     }

//     public static void main(String[] args) {
//         TelaPrincipal tela = new TelaPrincipal();
//         tela.mostrarMenuPrincipal();
//     }
// }
