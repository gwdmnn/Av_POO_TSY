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
        System.out.println("Nome do produto: " + this.nomeProduto);
        System.out.println("Marca do produto: " + this.marcaProduto);
    }

    @Override
    public boolean equals(Object o){
        if (o == this){                             //compara se não é ele mesmo
            return true;
        }
        if(o == null){                              //verifica se o produto comparado não é nulo
            return false;
        }
        if (!(o instanceof Produto)){               //verifica se o produto de entrada é mesmo uma instância de produto
            return false;
        }
        Produto outroProduto = (Produto)o;
        boolean result = this.nomeProduto.equals(outroProduto.nomeProduto) && this.marcaProduto.equals(outroProduto.marcaProduto);
        return result;
    }

}
