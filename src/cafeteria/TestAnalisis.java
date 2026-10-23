package cafeteria;

import cafeteria.dispositivos.EquipoCocina;
import cafeteria.dispositivos.Licuadora;

// Esto equivale o simula lo que hace por detrás Spring Boot
public class TestAnalisis {
  public static void main(String[] args) {

    EquipoCocina licuadora = new Licuadora();

    PreparadorBebidas preparador = new PreparadorBebidas(licuadora);
    preparador.prepararDesayuno();
    preparador.apagarTodo();

    // SEGUNDO PREPARADOR
    PreparadorBebidas preparador2 = new PreparadorBebidas(licuadora);

    System.out.println("Problema: Codigo repetido.");
  }
}