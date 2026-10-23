package cafeteria.dispositivos;

import cafeteria.dispositivos.Cafetera;
import cafeteria.dispositivos.EquipoCocina;
import cafeteria.dispositivos.Licuadora;

// ESTE EQUIVALE AL SEREVICIO
public class PreparadorBebidas {
  private final EquipoCocina cafetera;
  private final EquipoCocina licuadora;
  private final EquipoCocina exprimidor;

  public PreparadorBebidas(EquipoCocina licuadora, EquipoCocina cafetera, EquipoCocina exprimidor) {
    this.cafetera = cafetera;
    this.licuadora = licuadora;
    this.exprimidor = exprimidor;
  }

  public void prepararDesayuno() {
    System.out.println("Iniciando preparacion del desayuno...");
    cafetera.encender();
    cafetera.preparar();
    licuadora.encender();
    licuadora.preparar();

    exprimidor.encender();
    exprimidor.preparar();
    System.out.println("Desayuno listo.");
  }

  public void apagarTodo() {
    System.out.println("Apagando equipos...");
    cafetera.apagar();
    licuadora.apagar();
    exprimidor.apagar();
    System.out.println("Equipos apagados.");
  }
}