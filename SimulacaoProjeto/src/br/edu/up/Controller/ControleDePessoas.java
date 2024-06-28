// package br.edu.up.Controller;

// import br.edu.up.Daos.GerenciadorDeArquivos;
// import java.util.ArrayList;
// import java.util.List;

// public class ControleDePessoas {

//     private List<String[]> pessoas;
//     private GerenciadorDeArquivos gerenciadorDeArquivos;

//     public ControleDePessoas() {
//         this.pessoas = new ArrayList<>();
//         this.gerenciadorDeArquivos = new GerenciadorDeArquivos();
//         inicializarPessoas();
//     }

//     private void inicializarPessoas() {
//         this.pessoas = gerenciadorDeArquivos.lerPessoas();
//     }

//     public void incluirPessoa(String[] pessoa) {
//         this.pessoas.add(pessoa);
//         salvarPessoas();
//     }

//     public List<String[]> getPessoas() {
//         return pessoas;
//     }

//     public String[] buscarPessoaPorId(int id) {
//         for (String[] pessoa : pessoas) {
//             if (Integer.parseInt(pessoa[0]) == id) {
//                 return pessoa;
//             }
//         }
//         return null;
//     }

//     public void salvarPessoas() {
//         gerenciadorDeArquivos.escreverPessoas(pessoas);
//     }

//     public List<String[]> obterPessoasComEndereco() {
//         List<String[]> pessoasComEndereco = new ArrayList<>();
//         List<String[]> enderecos = gerenciadorDeArquivos.lerEnderecos();

//         for (String[] pessoa : pessoas) {
//             for (String[] endereco : enderecos) {
//                 if (pessoa[0].equals(endereco[2])) {
//                     String[] pessoaComEndereco = {
//                             pessoa[0], // Código
//                             pessoa[1], // Nome
//                             endereco[0], // Rua
//                             endereco[1] // Cidade
//                     };
//                     pessoasComEndereco.add(pessoaComEndereco);
//                 }
//             }
//         }

//         gerenciadorDeArquivos.escreverPessoasComEndereco(pessoasComEndereco);

//         return pessoasComEndereco;
//     }

//     public void gerarPessoasComEndereco() {
//         List<String[]> pessoasComEndereco = obterPessoasComEndereco();
//         gerenciadorDeArquivos.escreverPessoasComEndereco(pessoasComEndereco);
//     }
// }
