public class Produtos implements Comparable<Produtos>{

    public String nomeProduto;
    public float valorProduto;

    public Produtos(String nomeProduto, float valorProduto) {
        this.nomeProduto = nomeProduto;
        this.valorProduto = valorProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public float getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(float valorProduto) {
        this.valorProduto = valorProduto;
    }

    @Override
    public String toString() {
        return "Produto: " + nomeProduto + " ; Valor: R$ " + valorProduto + "\n";
    }

    @Override
    public int compareTo(Produtos outroValor) {
        return Float.compare(this.valorProduto, outroValor.valorProduto);
    }
}
