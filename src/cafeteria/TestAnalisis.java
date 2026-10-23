package cafeteria;

public class TestAnalisis {
  public static void main(String[] args) {

    PreparadorBebidas preparador = new PreparadorBebidas();
    preparador.prepararDesayuno();
    preparador.apagarTodo();

    System.out.println("Problema: Codigo repetido.");
  }
}