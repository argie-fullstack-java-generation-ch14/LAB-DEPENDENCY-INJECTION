package cafeteria;

import cafeteria.dispositivos.Cafetera;
import cafeteria.dispositivos.EquipoCocina;
import cafeteria.dispositivos.Licuadora;

// ESTE EQUIVALE AL SEREVICIO
public class PreparadorBebidas {
  private Cafetera cafetera;
  private EquipoCocina licuadora;

  public PreparadorBebidas(EquipoCocina licuadora) {
    this.cafetera = new Cafetera();
    this.licuadora = licuadora;
  }

  public void prepararDesayuno() {
    System.out.println("Iniciando preparacion del desayuno...");
    cafetera.encender();
    cafetera.preparar();
    licuadora.encender();
    licuadora.preparar();
    System.out.println("Desayuno listo.");
  }

  public void apagarTodo() {
    System.out.println("Apagando equipos...");
    cafetera.apagar();
    licuadora.apagar();
    System.out.println("Equipos apagados.");
  }
}