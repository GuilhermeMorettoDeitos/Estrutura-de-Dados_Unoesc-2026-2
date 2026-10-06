package Aula2909.listaExercicios.e06;

public class Palindrono {

    public static String inversor(String palavra){
        if(palavra == null || palavra.length() <= 1){
            return palavra;
        }

        return palavra.substring(palavra.length() - 1) + inversor(palavra.substring(0, palavra.length() - 1));
    }

    public static void main(String[] args){
        String original = "radar";
        String invertida = inversor(original);

        if(original.equals(invertida)){
            System.out.println("A palavra é um palíndrono: " + invertida);
        } else {
            System.out.println("A palavra não é um palindrono: " + invertida);
        }

    }

}
