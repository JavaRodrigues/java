package Homologacao;

import TO.Pessoa;

import java.lang.reflect.Field;

public class TesteReflection {

    public static void main(String [] args){
        System.out.println(Pessoa.class.getName());

        Field[] elementos = Pessoa.class.getDeclaredFields();
        System.out.println(elementos.length);


    }
}
