package cafeteria.preparadorBebidasV2;

import cafeteria.dispositivos.*;

import java.util.ArrayList;
import java.util.List;

public class TestPreparadorBebidasV2 {
  public static void main(String[] args) {

    EquipoCocina licuadora = new Licuadora();
    EquipoCocina cafetera = new Cafetera();
    EquipoCocina exprimidor = new Exprimidor();
    EquipoCocina maquinaTe = new MaquinaTe();

    List<EquipoCocina> listaDeEquipoCocinas = new ArrayList<>();
    listaDeEquipoCocinas.add(cafetera);
    listaDeEquipoCocinas.add(exprimidor);
    listaDeEquipoCocinas.add(licuadora);
    listaDeEquipoCocinas.add(maquinaTe);

    PreparadorBebidasV2 preparador = new PreparadorBebidasV2(listaDeEquipoCocinas);
    preparador.prepararDesayuno();
    preparador.apagarTodo();
  }
}
