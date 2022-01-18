package Homologacao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;



public class TesteArrayECollections {




    public static void main(String[] args){

        String nome = new String(5);
                nome[0] = "Javã";
                nome[1] = "Rodrigues";
                nome[2] = "Aguiar;

        /*for (int pos = nome.length(), i = 0; i < pos -1; i++){
            if (nome[i] != null)
                System.out.println(nome)[i] + "-" + i}*/

        List<String> l_arraylist - new ArrayList<>();
        l_arraylist.add("Javã");
        l_arraylist.add("Rodrigues");
        l_arraylist.add("Aguiar");

        for(String s : Arrays.asList("Javã", "Rodrigues", "Aguiar")) {
            System.out.println(s);
        }

        for (String listaDeNomes : l_arraylist){
            System.out.println("Lista de Nomes:" + listaDeNomes);
        }

        List<String> l_linkedList = new LinkedList<>();
        Set<String> s_hashset = new HashSet<>();
        Set<String> s_Set = new TreeSet<>();
        Set<String> s_LinkedHashSet = new linkedHashSet<>();

        Map<String, String> s_HashMap = new LinkedHashMap<>();

        Map<String, String> s_linkedHashMap = new LinkedHashMap<>();
        s_linkedHashMap.put("ID1", "Javã Rodrigues");
        s_linkedHashMap.put("ID2", "Javã Aguiar");

        //System.out.println(s_linkedHashMap.values());
        for (String valores : s_linkedHashMap.values()) {
            System.out.println("Conteúdo:" + valores);
        }

    }
}
