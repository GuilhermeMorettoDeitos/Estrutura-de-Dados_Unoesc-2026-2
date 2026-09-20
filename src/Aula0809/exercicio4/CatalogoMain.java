package Aula0809.exercicio4;

public class CatalogoMain {
    public static void main(String[] args) {
        ArvoreProdutosService catalogo = new ArvoreProdutosService();

        catalogo.inserirProduto(new Produto(50, "Notebook", 3500.00));
        catalogo.inserirProduto(new Produto(30, "Teclado", 150.00));
        catalogo.inserirProduto(new Produto(70, "Monitor", 800.00));
        catalogo.inserirProduto(new Produto(20, "Mouse", 50.00));
        catalogo.inserirProduto(new Produto(40, "Webcam", 200.00));

        catalogo.listarOrdemCrescente();

        catalogo.mostrarAltura();
        catalogo.buscarProduto(70);

        System.out.println("\nRemovendo produto cód 30...");
        catalogo.removerProduto(30);
        catalogo.listarOrdemCrescente();
    }
}