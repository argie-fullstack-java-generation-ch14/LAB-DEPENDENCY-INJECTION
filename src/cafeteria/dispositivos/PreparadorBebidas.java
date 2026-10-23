package cafeteria.dispositivos;

import cafeteria.dispositivos.Cafetera;
import cafeteria.dispositivos.EquipoCocina;
import cafeteria.dispositivos.Licuadora;

// ESTE EQUIVALE AL SEREVICIO
public class PreparadorBebidas {
  private final EquipoCocina equipo1;
  private final EquipoCocina equipo2;

  public PreparadorBebidas(EquipoCocina equipo2, EquipoCocina equipo1) {
    this.equipo1 = equipo1;
    this.equipo2 = equipo2;
  }

  public void prepararDesayuno() {
    System.out.println("Iniciando preparacion del desayuno...");
    equipo1.encender();
    equipo1.preparar();

    equipo2.encender();
    equipo2.preparar();
    System.out.println("Desayuno listo.");
  }

  public void apagarTodo() {
    System.out.println("Apagando equipos...");
    equipo1.apagar();
    equipo2.apagar();
    System.out.println("Equipos apagados.");
  }
}