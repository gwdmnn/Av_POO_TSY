public class Produto extends Marca{
    public String nomeProduto;
    public String marcaProduto;

    public Produto() {
    }

    public Produto(String nomeProduto, String marcaProduto) {
        this.nomeProduto = nomeProduto;
        this.marcaProduto = marcaProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getMarcaProduto() {
        return marcaProduto;
    }

    public void setMarcaProduto(String marcaProduto) {
        this.marcaProduto = marcaProduto;
    }

    public void displayProduto(){
        System.out.println("Nome do Produto: " + this.nomeProduto);
        System.out.println("Marca do produto: " + this.marcaProduto);
    }

}
