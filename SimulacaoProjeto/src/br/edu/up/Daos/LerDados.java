package br.edu.up.Daos;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.edu.up.Models.Endereco;
import br.edu.up.Models.Pessoa;
import br.edu.up.Models.PessoasComEndereco;

public class LerDados {

    // Este é o caminho onde nossas arquivos CSV estão
    public String ArquivosCaminho = "C:\\java_simulado\\SimuladoProjeto\\src\\br\\edu\\up\\Arquivos\\";

    // Responsavel por ler os arquivos CSV
    public Scanner scanner = new Scanner(System.in);

    public List<Pessoa> BuscarListaPessoas() throws Exception {

        try {

            // Primeiro de tudo a gente precisa criar uma lista da classe
            // PessoasComEndereco, para conseguir mostrar depois.

            List<Pessoa> ListaPessoas = new ArrayList<>();

            File arquivoLeitura = new File(ArquivosCaminho + "Pessoa.csv");
            Scanner leitor = new Scanner(arquivoLeitura);

            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                String[] dados = linha.split(";");

                // Nessa parte ele le oq está no arquivo csv e aloca em variaveis.
                int pessoaId = Integer.parseInt(dados[0]);
                String nome = dados[1];

                // Aqui ele monta o objeto pessoa, de acordo com os dados que ele leu
                Pessoa pessoa = new Pessoa();
                pessoa.setId(pessoaId);
                pessoa.setNome(nome);
                ListaPessoas.add(pessoa);
            }

            // Retorna a lista de pessoas
            return ListaPessoas;

        } catch (Exception ex) {

            throw new Exception("Algo deu errado buscar lista de pessoas");
        }
    }

    public List<Endereco> BuscarListaEnderecos() throws Exception {

        try {

            List<Endereco> ListaEndereco = new ArrayList<>();

            File arquivoLeitura = new File(ArquivosCaminho + "Endereco.csv");
            Scanner leitor = new Scanner(arquivoLeitura);

            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                String[] dados = linha.split(";");

                String rua = dados[0];
                String cidade = dados[1];
                int pessoaId = Integer.parseInt(dados[2]);

                Endereco endereco = new Endereco();
                endereco.setRua(rua);
                endereco.setCidade(cidade);

                var ListaPessoa = BuscarListaPessoas();

                for (Pessoa pessoa : ListaPessoa) {
                    if (pessoa.getId() == pessoaId) {
                        endereco.setPessoaProprietaria(pessoa);
                    }
                }

                ListaEndereco.add(endereco);
            }

            return ListaEndereco;

        } catch (Exception ex) {

            throw new Exception("Algo deu errado buscar lista de pessoas");
        }
    }

}
