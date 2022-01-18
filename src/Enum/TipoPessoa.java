package Enum;

public enum TipoPessoa {

    PF ("PESSOA_FISICA"), PJ ("PESSOA_JURIDICA"), M();

    private String tipoPessoa;

    TipoPessoa(final String tipoPessoa){
        setTipoPessoa(tipoPessoa);
    }

    void setTipoPessoa(String tipoPessoa2) {
        this.tipoPessoa = tipoPessoa;
    }

    public String getTipoPessoa(){
        return this.tipoPessoa;
    }

}
