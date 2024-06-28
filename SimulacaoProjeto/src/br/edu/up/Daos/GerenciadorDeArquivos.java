// package br.edu.up.Daos;

// import java.io.File;
// import java.io.FileNotFoundException;
// import java.io.FileWriter;
// import java.io.IOException;
// import java.io.PrintWriter;
// import java.util.ArrayList;
// import java.util.List;
// import java.util.Scanner;

// public class GerenciadorDeArquivos {

//     private String nomeDoArquivoPessoas = "C:\\Users\\autologon\\Desktop\\Simulado\\Simulado\\Pessoas.csv";
//     private String nomeDoArquivoEnderecos = "C:\\Users\\autologon\\Desktop\\Simulado\\Simulado\\Enderecos.csv";
//     private String nomeDoArquivoComEndereco = "C:\\Users\\autologon\\Desktop\\Simulado\\Simulado\\PessoasComEndereco.csv";

//     public List<String[]> lerPessoas() {
//         List<String[]> listaDePessoas = new ArrayList<>();

//         try {
//             File arquivoLeitura = new File(nomeDoArquivoPessoas);
//             Scanner leitor = new Scanner(arquivoLeitura);

//             // Ignora a primeira linha que é o cabeçalho
//             if (leitor.hasNextLine()) {
//                 leitor.nextLine();
//             }

//             while (leitor.hasNextLine()) {
//                 String linha = leitor.nextLine();
//                 String[] dados = linha.split(";");

//                 listaDePessoas.add(dados);
//             }

//             leitor.close();
//         } catch (FileNotFoundException e) {
//             System.out.println("Arquivo de pessoas não encontrado: " + e.getMessage());
//         }

//         return listaDePessoas;
//     }

//     public List<String[]> lerEnderecos() {
//         List<String[]> listaDeEnderecos = new ArrayList<>();

//         try {
//             File arquivoLeitura = new File(nomeDoArquivoEnderecos);
//             Scanner leitor = new Scanner(arquivoLeitura);

//             // Ignora a primeira linha que é o cabeçalho
//             if (leitor.hasNextLine()) {
//                 leitor.nextLine();
//             }

//             while (leitor.hasNextLine()) {
//                 String linha = leitor.nextLine();
//                 String[] dados = linha.split(";");

//                 listaDeEnderecos.add(dados);
//             }

//             leitor.close();
//         } catch (FileNotFoundException e) {
//             System.out.println("Arquivo de endereços não encontrado: " + e.getMessage());
//         }

//         return listaDeEnderecos;
//     }

//     public void escreverPessoas(List<String[]> dadosPessoas) {
//         try {
//             FileWriter arquivoGravar = new FileWriter(nomeDoArquivoPessoas);
//             PrintWriter gravador = new PrintWriter(arquivoGravar);

//             // Escreve o cabeçalho
//             gravador.println("Codigo;Nome");

//             // Escreve cada pessoa no arquivo
//             for (String[] pessoa : dadosPessoas) {
//                 gravador.println(String.join(";", pessoa));
//             }

//             gravador.close();
//             arquivoGravar.close();
//         } catch (IOException e) {
//             System.out.println("Erro ao escrever arquivo de pessoas: " + e.getMessage());
//         }
//     }

//     public void escreverPessoasComEndereco(List<String[]> pessoasComEndereco) {
//         try {
//             FileWriter arquivoGravar = new FileWriter(nomeDoArquivoComEndereco);
//             PrintWriter gravador = new PrintWriter(arquivoGravar);

//             // Escreve o cabeçalho
//             gravador.println("Codigo;Nome;Rua;Cidade");

//             // Escreve cada pessoa com endereço no arquivo
//             for (String[] pessoa : pessoasComEndereco) {
//                 gravador.println(String.join(";", pessoa));
//             }

//             gravador.close();
//             arquivoGravar.close();
//         } catch (IOException e) {
//             System.out.println("Erro ao escrever arquivo de pessoas com endereço: " + e.getMessage());
//         }
//     }
// }
