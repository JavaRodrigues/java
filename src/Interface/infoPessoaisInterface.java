package Interface;

import Cliente.Pessoa;

public interface infoPessoaisInterface {

    public final String PESSOA_FISICA = "PF";

    public final String PESSOA_JURIDICA = "PJ";

    public abstract boolean cadastrarPessoa(Pessoa pessoa);

    abstract boolean apagarPessoa(Pessoa pessoa);

    public boolean listarPessoa(Pessoa pessoa);

    boolean alterarPessoa (Pessoa pessoa);


}
