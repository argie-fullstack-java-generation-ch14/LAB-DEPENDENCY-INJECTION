package cafeteria;

import cafeteria.dispositivos.Cafetera;
import cafeteria.dispositivos.EquipoCocina;
import cafeteria.dispositivos.Exprimidor;
import cafeteria.dispositivos.Licuadora;

// Esto equivale o simula lo que hace por detrás Spring Boot
public class TestAnalisis {
  public static void main(String[] args) {

    EquipoCocina licuadora = new Licuadora();
    EquipoCocina cafetera = new Cafetera();
    EquipoCocina exprimidor = new Exprimidor();

    PreparadorBebidas preparador = new PreparadorBebidas(licuadora, cafetera, exprimidor);
    preparador.prepararDesayuno();
    preparador.apagarTodo();

    // SEGUNDO PREPARADOR
    PreparadorBebidas preparador2 = new PreparadorBebidas(licuadora, cafetera, exprimidor);

    System.out.println("Problema: Codigo repetido.");
  }
}