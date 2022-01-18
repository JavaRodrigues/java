package TO;

public class ContaPoupanca {

    private int agencia;
    private int conta;
    private int saldo;
    private int extrato;
    private String nomeCliente;
    private String tipoCliente;
    private boolean biometria;

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getExtrato() {
        return extrato;
    }

    public void setExtrato(int extrato) {
        this.extrato = extrato;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public boolean isBiometria() {
        return biometria;
    }

    public void setBiometria(boolean biometria) {
        this.biometria = biometria;
    }

    public boolean obterContaPoupanca(){
        return false;

    }

    public boolean obterContaPoupanca(boolean biometria) {
        return false;
    }

    public boolean obterContaPoupanca(boolean biometria, int agencia, int conta) {

        System.out.println();

        return false;
    }

}
