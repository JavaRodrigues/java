package Homologacao;

import Interface.PessoaInterface;
import Pessoa.PessoaFisica;
import Pessoa.PessoaJuridica;

public class TestePolimorfismo {

    public static void main(String[] args){
        PessoaInterface pessoaPF = new PessoaFisica();
        PessoaInterface pessoaPJ = new PessoaJuridica();

    }

}
