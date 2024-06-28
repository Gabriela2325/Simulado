package br.edu.up.Daos;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

import br.edu.up.Models.PessoasComEndereco;

public class GravarDados {

    // Este é o caminho onde nossas arquivos CSV estão
    public String ArquivosCaminho = "C:\\java_simulado\\SimuladoProjeto\\src\\br\\edu\\up\\Arquivos\\";

    // Responsavel por ler os arquivos CSV
    public Scanner scanner = new Scanner(System.in);

    // Metodo que iremos chamar para gravar as pessoas com endereco
    public void GravarPessoasComEndereco(PessoasComEndereco pessoaEndereco) {
        var arquivo = ArquivosCaminho + "PessoasComEndereco.csv";

        // Funcao em java para tratar caso nossa regra de erro
        try {
            FileWriter arquivoGravar = new FileWriter(arquivo, true);
            PrintWriter gravador = new PrintWriter(arquivoGravar);

            gravador.println(pessoaEndereco.toCsv());
            gravador.close();

        } catch (Exception ex) {

        }
    }

}
