package DadosBancarios;

import TO.ContaCorrente;
import TO.ContaPoupanca;

public class Conta {

    ContaCorrente contaCorrente = null;
    ContaPoupanca contaPoupanca = null;

    public Conta(){
        this.contaCorrente = new ContaCorrente();
        this.contaPoupanca = new ContaPoupanca();
    }

    public Conta(boolean flagTipoConta) {
        if (flagTipoConta) {
            //conta corrente
            this.contaCorrente = new ContaCorrente();
        } else {
            //conta poupança
            this.contaPoupanca = new ContaPoupanca();
        }
    }
    public static void mais(String[] args) {
        Conta c = new Conta();
    }
}