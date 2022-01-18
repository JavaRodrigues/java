package Exception;

public class ErroArqNaoEncontrado extends Exception{

    /*
    * try|cath - tenta-testa o código
    * throw - utilizado em método = lança erros para a superclasse - classe pai
    * criar erros personalizados
    * */

    public ErroArqNaoEncontrado (String mensagem){
        super(mensagem);
    }
}
