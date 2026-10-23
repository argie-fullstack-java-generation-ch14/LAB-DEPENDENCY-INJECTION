package cafeteria.preparadorBebidasV2;

import cafeteria.PreparadorBebidas;
import cafeteria.dispositivos.Cafetera;
import cafeteria.dispositivos.EquipoCocina;
import cafeteria.dispositivos.Exprimidor;
import cafeteria.dispositivos.Licuadora;

import java.util.ArrayList;
import java.util.List;

public class TestPreparadorBebidasV2 {
  public static void main(String[] args) {

    EquipoCocina licuadora = new Licuadora();
    EquipoCocina cafetera = new Cafetera();
    EquipoCocina exprimidor = new Exprimidor();

    List<EquipoCocina> listaDeEquipoCocinas = new ArrayList<>();
    listaDeEquipoCocinas.add(cafetera);
    listaDeEquipoCocinas.add(exprimidor);
    listaDeEquipoCocinas.add(licuadora);

    PreparadorBebidasV2 preparador = new PreparadorBebidasV2(listaDeEquipoCocinas);
    preparador.prepararDesayuno();
    preparador.apagarTodo();
  }
}
