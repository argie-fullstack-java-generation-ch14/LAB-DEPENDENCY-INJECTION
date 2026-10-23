package cafeteria;

import cafeteria.dispositivos.Cafetera;
import cafeteria.dispositivos.Licuadora;

public class PreparadorBebidas {
  private Cafetera cafetera;
  private Licuadora licuadora;

  public PreparadorBebidas() {
    this.cafetera = new Cafetera();
    this.licuadora = new Licuadora();
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