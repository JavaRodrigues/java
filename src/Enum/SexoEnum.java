package Enum;

public enum SexoEnum {

    M("Masculino"), F("feminino");

    private String sexo;

    SexoEnum (final String sexo);

    void setSexo (String Sexo){
        this.sexo = sexo;
    }

    public String getSexo() {
        return this.sexo;
    }
}
