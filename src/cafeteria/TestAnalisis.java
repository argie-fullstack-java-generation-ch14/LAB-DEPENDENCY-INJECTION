package cafeteria;

import cafeteria.dispositivos.*;

// Esto equivale o simula lo que hace por detrás Spring Boot
public class TestAnalisis {
  public static void main(String[] args) {

    EquipoCocina licuadora = new Licuadora();
    EquipoCocina cafetera = new Cafetera();
    EquipoCocina exprimidor = new Exprimidor();

    PreparadorBebidas preparador = new PreparadorBebidas(licuadora, cafetera);
    preparador.prepararDesayuno();
    preparador.apagarTodo();

    // SEGUNDO PREPARADOR
    PreparadorBebidas preparador2 = new PreparadorBebidas(cafetera, exprimidor);

    System.out.println("Problema: Codigo repetido.");
  }
}