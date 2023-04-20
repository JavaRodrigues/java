package DadosBancarios;

import TO.ContaCorrente;
import TO.ContaPoupanca;

public class Conta {

    ContaCorrente contaCorrente = null;
    ContaPoupanca contaPoupanca = null;

<<<<<<< Updated upstream
=======
    /*Sintaxe convencional
    * modificador> <retorno> <nome do metodo> (parametro)
    *
    * */
>>>>>>> Stashed changes
    public Conta(){
        this.contaCorrente = new ContaCorrente();
        this.contaPoupanca = new ContaPoupanca();
    }

<<<<<<< Updated upstream
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
=======
    public Conta(boolean flagTipoConta){
    if (flagTipoConta == true){
        this.contaCorrente = new ContaCorrente();
    } else {
        this.contaPoupanca = new ContaPoupanca();
    }
    }
    public static void main(String[]args){
        Conta c = new Conta();
    }
}
>>>>>>> Stashed changes
