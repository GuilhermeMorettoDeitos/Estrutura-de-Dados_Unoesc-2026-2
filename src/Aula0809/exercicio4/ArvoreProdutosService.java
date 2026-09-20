package Aula0809.exercicio4;

public class ArvoreProdutosService {

    private Produto raiz;

    public void inserirProduto(Produto novoProduto) {
        raiz = inserirRecursivo(raiz, novoProduto);
        System.out.println("Produto '" + novoProduto.getNome() + "' inserido.");
    }

    private Produto inserirRecursivo(Produto atual, Produto novo) {
        if (atual == null) return novo;

        if (novo.getCodigo() < atual.getCodigo()) {
            atual.setEsquerda(inserirRecursivo(atual.getEsquerda(), novo));
        } else if (novo.getCodigo() > atual.getCodigo()) {
            atual.setDireita(inserirRecursivo(atual.getDireita(), novo));
        }
        return atual;
    }

    public void buscarProduto(int codigo) {
        Produto p = buscarRecursivo(raiz, codigo);
        if (p != null) {
            System.out.println("Produto Encontrado: [" + p.getCodigo() + "] " + p.getNome() + " - R$ " + p.getPreco());
        } else {
            System.out.println("Produto com código " + codigo + " não encontrado.");
        }
    }

    private Produto buscarRecursivo(Produto atual, int codigo) {
        if (atual == null || atual.getCodigo() == codigo) return atual;
        if (codigo < atual.getCodigo()) return buscarRecursivo(atual.getEsquerda(), codigo);
        return buscarRecursivo(atual.getDireita(), codigo);
    }

    public void listarOrdemCrescente() {
        System.out.println("\n Catálogo de Produtos ");
        listarInOrdem(raiz);
        System.out.println("============================\n");
    }

    private void listarInOrdem(Produto atual) {
        if (atual != null) {
            listarInOrdem(atual.getEsquerda());
            System.out.println("Cod: " + atual.getCodigo() + " | " + atual.getNome() + " - R$ " + atual.getPreco());
            listarInOrdem(atual.getDireita());
        }
    }

    public void mostrarAltura() {
        int altura = calcularAltura(raiz);
        System.out.println("Altura da Árvore: " + altura);
    }

    private int calcularAltura(Produto atual) {
        if (atual == null) return -1;
        int altEsq = calcularAltura(atual.getEsquerda());
        int altDir = calcularAltura(atual.getDireita());
        return Math.max(altEsq, altDir) + 1;
    }

    public void removerProduto(int codigo) {
        raiz = removerRecursivo(raiz, codigo);
    }

    private Produto removerRecursivo(Produto atual, int codigo) {
        if (atual == null) return null;

        if (codigo < atual.getCodigo()) {
            atual.setEsquerda(removerRecursivo(atual.getEsquerda(), codigo));
        } else if (codigo > atual.getCodigo()) {
            atual.setDireita(removerRecursivo(atual.getDireita(), codigo));
        } else {
            if (atual.getEsquerda() == null) return atual.getDireita();
            else if (atual.getDireita() == null) return atual.getEsquerda();

            atual = encontrarMenorValor(atual.getDireita());
            atual.setDireita(removerRecursivo(atual.getDireita(), atual.getCodigo()));
        }
        return atual;
    }

    private Produto encontrarMenorValor(Produto raiz) {
        return raiz.getEsquerda() == null ? raiz : encontrarMenorValor(raiz.getEsquerda());
    }
}