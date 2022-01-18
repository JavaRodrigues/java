package TO;

import Enum.SexoEnum;

public class Pessoa {

    private String nome;
    private String CPF;
    private String RG;
    private String Endereco;
    private Int Idade;
    private SexoEnum sexo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String endereco) {
        Endereco = endereco;
    }

    public Int getIdade() {
        return Idade;
    }

    public void setIdade(Int idade) {
        Idade = idade;
    }

    public Enum.SexoEnum getSexo() {
        return sexo;
    }

    public void setSexo(Enum.SexoEnum sexo) {
        this.sexo = sexo;
    }
}
