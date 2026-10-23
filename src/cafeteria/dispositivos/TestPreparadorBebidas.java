package cafeteria.dispositivos;

public class TestPreparadorBebidas {
  public static void main(String[] args) {

    System.out.println("Configuración 1: Cafetera y Licuadora");

    PreparadorBebidas preparador1 = new PreparadorBebidas(
        new Cafetera(),
        new Licuadora()
    );

    preparador1.prepararDesayuno();
    preparador1.apagarTodo();

    System.out.println("Configuración 2: Maquina de te y Exprimidor");

    PreparadorBebidas preparador2 = new PreparadorBebidas(
        new MaquinaTe(),
        new Exprimidor()
    );

    preparador2.prepararDesayuno();
    preparador2.apagarTodo();

    System.out.println("Configuración 3: Cafetera y Maquina de te");

    PreparadorBebidas preparador3 = new PreparadorBebidas(
        new Cafetera(),
        new MaquinaTe()
    );

    preparador3.prepararDesayuno();
    preparador3.apagarTodo();
  }
}

