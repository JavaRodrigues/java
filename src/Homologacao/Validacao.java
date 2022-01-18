package Homologacao;

import TO.ContaCorrente;

import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.List;

public class Validacao {

    public static void main(String[] args){
        //IF
        //....IF linha (condição) ? > se a condição é atendida> : <senão>
        ///if normal
        /*
        * if (condição) {
        * se a condição é verdade / se ela foi atendida
        * }else{
        * senão
        * }
        *
        */

        /*if (condição)
        *var1=varA+var8
        * var++
        * else{
        * }
        *  */

        String nome = "Javã";
        String testaNome = ((nome.equalsIgnoreCase("javã"))? "Nome correto": "Nome Incorreto");
        System.out.println(testaNome);


        /*if (nome.equals(("Javã"));{
            System.out.println("nome é Javã");
            }else {
            System.out.println("nome está errado");
            }*/
            /*comparação de números
            *
            * >
            * <
            * >=
            * <=
            * == igual
            * != diferente
            * */

        /*FOR CLASICCO
        * for inicializado : condição : incremento | decremento {
        *instrução
        * }
        *
        * FOREACH (1.5)
        * foreach(variavel do mesmo tipo) : variavel carregada ou objeto) {
        * instruções
        *
        * */

        /*for (int i = 0; i <=10; i++){
            System.out.println(i);
        }*/

        /*ContaCorrente cc1 = new ContaCorrente();
        cc1.setNomeCliente("Javã Rodrigues PF");
        cc1.setTipoCliente("PF");

        ContaCorrente cc2 = new ContaCorrente();
        cc2.setNomeCliente("Javã Rodrigues PJ");
        cc2.setTipoCliente("PJ");

        List<ContaCorrente> ListContasCorrentes = new ArrayList();
        ListContasCorrentes.add(cc1);
        ListContasCorrentes.add(cc2);

        for (ContaCorrente contaCorrente : ListContasCorrentes){
            if (contaCorrente.getTipoCliente().equalsIgnoreCase("PF")) {
                System.out.println(contaCorrente.getNomeCliente());
                System.out.println(contaCorrente.getTipoCliente());
            }
        }*/

        /*int i = 0;
        while (i <= 15){
            System.out.println(i++);
        }*/
    }
}
