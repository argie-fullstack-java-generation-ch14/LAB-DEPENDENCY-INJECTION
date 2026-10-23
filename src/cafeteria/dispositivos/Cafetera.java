package cafeteria.dispositivos;

public class Cafetera {
  private boolean encendida = false;
  private int intensidad = 1;

  public void encender() {
    encendida = true;
    System.out.println("Cafetera encendida.");
  }

  public void apagar() {
    encendida = false;
    System.out.println("Cafetera apagada.");
  }

  public void preparar() {
    if (encendida) {
      System.out.println("Preparando cafe con intensidad " + intensidad + ".");
    }
  }

  public void ajustarIntensidad() {
    if (encendida && intensidad < 5) {
      intensidad++;
      System.out.println("Intensidad del cafe: " + intensidad);
    }
  }
}
