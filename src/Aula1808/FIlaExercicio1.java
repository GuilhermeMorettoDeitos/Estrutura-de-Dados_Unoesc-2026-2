package Aula1808;

import java.util.LinkedList;
import java.util.Queue;

public class FIlaExercicio1 {

    public static void main(String[] args){

        Queue<String> filaImpressao = new LinkedList<>();
        filaImpressao.add("Relatorio.pdf");
        filaImpressao.add("Foto.png");
        filaImpressao.add("Contrato.docx");
        filaImpressao.add("Planilha.xlsx");

        if(!filaImpressao.isEmpty()){
            System.out.println("Pronto para imprimir: " + filaImpressao.peek());
            filaImpressao.remove();
            System.out.println("Impressão realizada!");
        }

        while (!filaImpressao.isEmpty()){
            String documentoASerImprimido = filaImpressao.remove();
            System.out.println("Documento Removido:" + documentoASerImprimido);
        }


    }

}
