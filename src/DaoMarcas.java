import Interfaces.ICrudMarcas;

import java.util.ArrayList;
import java.util.List;

public class DaoMarcas implements ICrudMarcas {

    public  List<String> listaMarcas = new ArrayList<>();


    @Override
    public boolean salvar(String nomeMarca) {
        if(listaMarcas.contains(nomeMarca)){
            System.out.println("O nome da marca já consta na lista!");
        }
        else {
            listaMarcas.add(nomeMarca);
        }
        return false;
    }

    @Override
    public String consultarMarca(String nomeMarca) {
        return null;
    }

    @Override
    public List<String> consultarListaMarcas() {
        for (String m : listaMarcas){
            System.out.println(m);
        }
        return null;
    }


    @Override
    public boolean excluirMarca(String nomeMarca) {
        if (listaMarcas.contains(nomeMarca)){
            listaMarcas.remove(listaMarcas.indexOf(nomeMarca));
        }
        else{
            System.out.println("A marca informada não consta na lista!");
        }
        return false;
    }
}
