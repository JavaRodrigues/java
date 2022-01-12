package Cliente;

import TO.ContaCorrente;

public class Pessoa {

        public void obterPessoa () {
            ContaCorrente marco = new ContaCorrente();
            marco.setAgencia(1234);
            marco.setConta(5678);
            marco.setSaldo(123456);
            System.out.println("Voce acessou \nAgencia" + marco.getAgencia() + "\nConta:" +marco.getConta() + "\nSaldo:"+marco.getSaldo());

            System.out.println("\n");

            ContaCorrente manuel = new ContaCorrente();
            manuel.setAgencia(2345);
            manuel.setConta(6789);
            manuel.setSaldo(0);
            System.out.println("Voce acessou \nAgencia" + manuel.getAgencia() + "\nConta:" +manuel.getConta() + "\nSaldo:"+manuel.getSaldo());

        }

    }