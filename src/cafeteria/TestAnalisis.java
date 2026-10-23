package cafeteria;

import cafeteria.dispositivos.Cafetera;
import cafeteria.dispositivos.EquipoCocina;
import cafeteria.dispositivos.Licuadora;

// Esto equivale o simula lo que hace por detrás Spring Boot
public class TestAnalisis {
  public static void main(String[] args) {

    EquipoCocina licuadora = new Licuadora();
    EquipoCocina cafetera = new Cafetera();

    PreparadorBebidas preparador = new PreparadorBebidas(licuadora, cafetera);
    preparador.prepararDesayuno();
    preparador.apagarTodo();

    // SEGUNDO PREPARADOR
    PreparadorBebidas preparador2 = new PreparadorBebidas(licuadora, cafetera);

    System.out.println("Problema: Codigo repetido.");
  }
}