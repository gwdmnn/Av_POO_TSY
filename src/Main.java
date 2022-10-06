import javax.swing.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Produto> listaProdutos = new ArrayList();
    static DaoMarcas dao = new DaoMarcas();
    public static void main(String[] args) {



        boolean continuar = true;
        while (continuar == true){
            String opcao = JOptionPane.showInputDialog("Informe a opção desejada: \n m - Marcas \n p - Produtos");
            if (opcao == null || opcao == "")
                break;

            switch (opcao){
                case "m": String opcaoMarca = JOptionPane.showInputDialog("O que deseja fazer? \n a- Adicionar marca \n e- Excluir marca \n l- Ver lista de marcas");
                if(opcaoMarca == null || opcaoMarca == ""){
                    System.out.println("Opção inválida");
                    continue;
                }
                else{
                    switch (opcaoMarca){
                        case "a": dao.salvar(JOptionPane.showInputDialog("Informe o nome da marca"));
                        break;
                        case "e": dao.excluirMarca(JOptionPane.showInputDialog("Informe o nome da marca a ser excluída"));
                        break;
                        case "l": dao.consultarListaMarcas();
                        break;
                    }
                    break;
                }
                case "p": String opcaoProduto = JOptionPane.showInputDialog("O que deseja fazer? \n a- Adicionar produto \n e- Excluir produto \n l- Ver lista de produtos");
                if (opcaoProduto == null || opcaoProduto == "") {
                    System.out.println("Opção inválida");
                    continue;
                }
                else{
                    switch (opcaoProduto){
                        case "a": Produto padd = new Produto();
                            padd.setNomeProduto(JOptionPane.showInputDialog("Informe o nome do produto"));
                            padd.setMarcaProduto(JOptionPane.showInputDialog("Insira a marca do produto"));
                            addProduto(padd);
                        break;
                        case "e": Produto pex = new Produto();
                            pex.setNomeProduto(JOptionPane.showInputDialog("Informe o nome do produto"));
                            excluirProduto(pex);
                        break;
                        case "l": displayListaProdutos();
                        break;
                        }
                    break;
                    }
                }

            }

        }


    public static void addProduto(Produto p){
        if(listaProdutos.contains(p)){
            System.out.println("O produto já existe na lista!");
        }
        else{
            if (dao.listaMarcas.contains(p.marcaProduto)){
                listaProdutos.add(p);
            }
            else{
                System.out.println("Favor cadastrar a marca antes do produto");
            }
        }
    }

    public static void excluirProduto(Produto p){
        if(listaProdutos.contains(p)){
            listaProdutos.remove(listaProdutos.indexOf(p));
            System.out.println("Produto removido!");
        }
        else{
            System.out.println("O produto não consta na lista!");
        }
    }

    public static void displayListaProdutos(){
        for (Produto p : listaProdutos){
            p.displayProduto();


        }
    }


}

