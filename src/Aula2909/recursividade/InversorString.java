package Aula2909.recursividade;

public class InversorString {

    public static String inversor(String palavra){
        if(palavra == null || palavra.length() <= 1){
            return palavra;
        }

        return palavra.substring(palavra.length() - 1) + inversor(palavra.substring(0, palavra.length() - 1));
    }

    public static void main(String[] args){
        String original = "Java";
        String invertida = inversor(original);

        System.out.println("Original: " + original);
        System.out.println("Invertida: " + invertida);
    }
}
