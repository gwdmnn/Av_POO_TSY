package Interfaces;

import java.util.List;

public interface ICrudMarcas {
    public boolean salvar(String nomeMarca);
    public String consultarMarca(String nomeMarca);
    public List<String> consultarListaMarcas();
    public boolean excluirMarca(String nomeMarca);



}
