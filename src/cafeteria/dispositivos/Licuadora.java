package cafeteria.dispositivos;

import cafeteria.PreparadorBebidas;

public class Licuadora implements EquipoCocina {
  private boolean encendida = false;
  private int velocidad = 1;

  @Override
  public void encender() {
    encendida = true;
    System.out.println("Licuadora encendida.");
  }

  @Override
  public void apagar() {
    encendida = false;
    System.out.println("Licuadora apagada.");
  }

  @Override
  public void preparar() {
    if (encendida) {
      System.out.println("Licuando ingredientes a velocidad " + velocidad + ".");
    }
  }

  @Override
  public void ajustarIntensidad() {
    if (encendida && velocidad < 5) {
      velocidad++;
      System.out.println("Velocidad de la licuadora: " + velocidad);
    }
  }
}