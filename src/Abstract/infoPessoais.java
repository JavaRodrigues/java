package Abstract;

import Cliente.Pessoa;
import DadosBancarios.Conta;
import Enum.TipoPessoa;


public abstract class infoPessoais {

    public static final String TIPO_PESSOA = "ISSO É UMA CONSTANTE";

    public abstract boolean cadastrarPessoa(Pessoa pessoa);

    public static boolean cadastrarPessoa(Pessoa pessoa, Conta conta){
        return true;
    }

    public abstract boolean apagarPessoa (Pessoa pessoa);

    /*public static void main(String[] args){
        try {
            System.out.println(TipoPessoa.PF.getTipoPessoa());
        }catch (EnumConstantNotPresentException e){
            System.err.println(e.getMessage());
        }catch (Exception e){
            System.err.println(e.getMessage());
        }

    }*/

    /*public static void main(String[] args) throws EnumConstantNotPresentException, Exception {
        System.out.println(TipoPessoa.M.getTipoPessoa());

    }*/

    public static void main(String[] args){
        System.out.println(TipoPessoa.M.getTipoPessoa());

        String nome = "Javã Rodrigues";

        if (nome == null)
            throw new  RuntimeException("Erro forçado");
        }cath (Exception e ){
        }
    }

