package Aula2909.listaExercicios.autoEstudo.e1;

public class ContagemCrescente {

    public static void contarCrescente(int atual, int ate){
        System.out.println(atual);
        if(atual < ate){
            contarCrescente(atual+1, ate);
        }
    }

    public static void main(String[] args){
        contarCrescente(1, 10);
    }

}
