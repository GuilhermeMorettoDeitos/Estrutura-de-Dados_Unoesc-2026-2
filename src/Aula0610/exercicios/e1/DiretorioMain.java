package Aula0610.exercicios.e1;

public class DiretorioMain {

    public static void main(String[] args){

        Diretorio raiz = new Diretorio("C:");

        Diretorio meusDocumentos = new Diretorio("Meus  Documentos");
        Diretorio minhasFotos = new Diretorio("Minhas fotos");

        raiz.arquivos.add(new Arquivo("config.sys", 2));

        meusDocumentos.arquivos.add(new Arquivo("curricudo.docx", 150));
        meusDocumentos.arquivos.add(new Arquivo("planilha_gastos.xlss", 350));

        minhasFotos.arquivos.add(new Arquivo("Ferias.png", 2048));
        minhasFotos.arquivos.add(new Arquivo("trabalho.jpg", 1000));

        raiz.subdiretorios.add(minhasFotos);
        raiz.subdiretorios.add(meusDocumentos);

        int tamanhoTotalDosArquivos = raiz.calcularTamanhoTotal();

        System.out.println("Tamanho total do diretório: " + raiz.nome + " - " + tamanhoTotalDosArquivos);


    }

}
