package cafeteria.preparadorBebidasV2;

import cafeteria.dispositivos.EquipoCocina;

import java.util.ArrayList;
import java.util.List;

public class PreparadorBebidasV2 {
  private final List<EquipoCocina> listaDeEquipoCocinas;

  PreparadorBebidasV2(List<EquipoCocina> listaDeEquipoCocinas) {
    this.listaDeEquipoCocinas = listaDeEquipoCocinas;
  }

  public void prepararDesayuno() {
    System.out.println("Iniciando preparacion del desayuno ------ V2...");
    for (int i = 0; i < this.listaDeEquipoCocinas.toArray().length; i++) {
      EquipoCocina equipo = this.listaDeEquipoCocinas.get(i);
      equipo.encender();
      equipo.preparar();
    }
    System.out.println("Desayuno listo ------ V2.");
  }

  public void apagarTodo() {
    System.out.println("Apagando equipos ------ V2...");
    for (int i = 0; i < this.listaDeEquipoCocinas.toArray().length; i++) {
      EquipoCocina equipo = this.listaDeEquipoCocinas.get(i);
      equipo.apagar();
    }
    System.out.println("Equipos apagados ------ V2.");
  }
}
