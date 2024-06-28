package br.edu.up.Controller;

import br.edu.up.Daos.GravarDados;
import br.edu.up.Daos.LerDados;
import br.edu.up.Models.Endereco;
import br.edu.up.Models.PessoasComEndereco;

public class PessoaEnderencoController {

    public void GravarPessoasComEndereco() {
        LerDados ler = new LerDados();
        GravarDados gravar = new GravarDados();

        try {
            var listaEnderecos = ler.BuscarListaEnderecos();

            for (Endereco endereco : listaEnderecos) {
                PessoasComEndereco pessoasComEndereco = new PessoasComEndereco();
                pessoasComEndereco.setEndereco(endereco);
                pessoasComEndereco.setPessoa(endereco.getPessoaProprietaria());
                gravar.GravarPessoasComEndereco(pessoasComEndereco);

            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

}
