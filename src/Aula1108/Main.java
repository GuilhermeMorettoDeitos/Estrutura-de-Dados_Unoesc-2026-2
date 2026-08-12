package Aula1108;

import java.util.*;

public class Main {
    public static void main(String[] args){

        // exemplo de lista usando o arraylist
        ArrayList<String> carros = new ArrayList<>();
        carros.add("bmw");
        carros.add("ford");
        System.out.println(carros);

        // exemplo de lista usando o linkedlist
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Pedro");
        linkedList.add("Gabriel");
        System.out.println(linkedList);

        //exemplo de lista com o hashmap
        HashMap<String, Integer> hashmaplist = new HashMap();
        hashmaplist.put("abacate", 52);
        List<HashMap<String, Integer>> listfinal = new ArrayList<>();
        listfinal.add(hashmaplist);
        for(HashMap<String, Integer> map : listfinal){
            System.out.println(map);
        }

        // exemplo de lista com o hashset
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("ana");
        hashSet.add("Alex");
        System.out.println(hashSet);
    }
}
