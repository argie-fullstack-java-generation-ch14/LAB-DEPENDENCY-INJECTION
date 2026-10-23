package cafeteria.dispositivos;

public class Licuadora {
  private boolean encendida = false;
  private int velocidad = 1;

  public void encender() {
    encendida = true;
    System.out.println("Licuadora encendida.");
  }

  public void apagar() {
    encendida = false;
    System.out.println("Licuadora apagada.");
  }

  public void preparar() {
    if (encendida) {
      System.out.println("Licuando ingredientes a velocidad " + velocidad + ".");
    }
  }

  public void ajustarIntensidad() {
    if (encendida && velocidad < 5) {
      velocidad++;
      System.out.println("Velocidad de la licuadora: " + velocidad);
    }
  }
}