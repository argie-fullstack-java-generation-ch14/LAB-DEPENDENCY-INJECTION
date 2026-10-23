# TIFC2DEV-JAVA-MJ6 — Laboratorio: Interfaces e Inyección de Dependencias

## 👥 Integrantes

* **Aura Rodriguez**
* **Argie Rincon**

---

## ☕ Cafetería en Problemas

Una cafetería está construyendo un sistema para preparar bebidas de forma automatizada. El sistema actual funciona, pero
tiene un problema: **está fuertemente acoplado (amarrado) a una sola máquina**. Si la cafetería quiere cambiar de marca
de cafetera, agregar una máquina de té, o reemplazar la licuadora por una más moderna, hay que modificar el código del
preparador central. Eso es caro, lento y propenso a errores.

**Objetivo del Laboratorio:** Refactorizar el sistema para que sea flexible usando **interfaces** e **inyección de
dependencias**. Al final, el preparador central debe poder trabajar con cualquier equipo que cumpla el contrato, sin
necesidad de modificar su código.

---

## 🎯 Objetivos de Aprendizaje

Al terminar el laboratorio, el estudiante será capaz de:

- Identificar código fuertemente acoplado y explicar por qué es un problema.
- Diseñar una interfaz que actúe como contrato entre el preparador y los equipos.
- Refactorizar clases concretas para que implementen la interfaz.
- Crear nuevas implementaciones de la interfaz con comportamientos distintos.
- Aplicar inyección de dependencias por constructor para desacoplar el preparador.
- Verificar que el mismo preparador funciona con distintas combinaciones de equipos.

---

## 📋 Guía del Laboratorio Paso a Paso

### Parte 1: Analizar el Código Actual

#### Paso 1: Leer el código problemático

Se entrega el siguiente código inicial:

* **`PreparadorBebidas.java`**
  ```java
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
  ```

* **`Cafetera.java`**
  ```java
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
  ```

* **`Licuadora.java`**
  ```java
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
  ```

#### Paso 2: Identificar el problema (en código)

Crea una clase `TestAnalisis.java` con un método `main` que:

1. Cree un `PreparadorBebidas`.
2. Llame a `prepararDesayuno()`.
3. Llame a `apagarTodo()`.
4. Imprima un comentario en consola resumiendo el problema detectado (ejemplo:
   `// El preparador esta amarrado a Cafetera y Licuadora`).

---

### Parte 2: Diseñar y Crear la Interfaz

#### Paso 1: Identificar el contrato

Ambos equipos tienen métodos con los mismos nombres:

- `encender()`
- `apagar()`
- `preparar()`
- `ajustarIntensidad()`

#### Paso 2: Crear la interfaz

Crea el archivo `EquipoCocina.java` declarando dichos métodos:

```java
public interface EquipoCocina {
  void encender();

  void apagar();

  void preparar();

  void ajustarIntensidad();
}
```

---

### Parte 3: Refactorizar las Implementaciones Existentes

#### Paso 1: Refactorizar `Cafetera`

Modifica `Cafetera.java` para que implemente `EquipoCocina` usando `implements EquipoCocina` y añadiendo `@Override` a
los cuatro métodos.

#### Paso 2: Refactorizar `Licuadora`

Modifica `Licuadora.java` para que implemente `EquipoCocina` y agregue `@Override` a los cuatro métodos.

---

### Parte 4: Refactorizar el Preparador con Inyección de Dependencias

1. Cambiar los atributos de `PreparadorBebidas.java` para que sean del tipo interfaz `EquipoCocina` (ej. `equipo1`,
   `equipo2`).
2. Modificar el constructor de `PreparadorBebidas` para recibir los equipos por parámetro (Inyección por constructor):
   ```java
   public PreparadorBebidas(EquipoCocina equipo1, EquipoCocina equipo2) {
       this.equipo1 = equipo1;
       this.equipo2 = equipo2;
   }
   ```
3. Ajustar los métodos `prepararDesayuno()` y `apagarTodo()` para llamar a `equipo1` y `equipo2`.

---

### Parte 5: Crear Nuevas Implementaciones

1. **`MaquinaTe.java`**: Implementa `EquipoCocina` con mensajes personalizados para té.
2. **`Exprimidor.java`**: Implementa `EquipoCocina` con mensajes personalizados para exprimir frutas.

---

### Parte 6: Probar la Flexibilidad del Diseño

Crea `TestPreparadorBebidas.java` con un método `main` para probar al menos 3 configuraciones distintas:

1. **Configuración 1:** Cafetera + Licuadora.
2. **Configuración 2:** Máquina de té + Exprimidor.
3. **Configuración 3:** Combinación libre (ej. Cafetera + Máquina de té).

---

### Parte 7: Segunda Versión del Preparador

1. **`PreparadorBebidasV2.java`**: Recibe una lista de equipos (`List<EquipoCocina>`) en el constructor y recorre la
   lista para preparar y apagar todos los equipos.
2. **`TestPreparadorBebidasV2.java`**: Prueba con 3 o 4 equipos a la vez.

---

## 📦 Lista de Entregables del Proyecto

1. `TestAnalisis.java`
2. `EquipoCocina.java` *(Interfaz)*
3. `Cafetera.java` *(Refactorizado)*
4. `Licuadora.java` *(Refactorizado)*
5. `PreparadorBebidas.java` *(Refactorizado con DI)*
6. `MaquinaTe.java` *(Nuevo equipo)*
7. `Exprimidor.java` *(Nuevo equipo)*
8. `TestPreparadorBebidas.java` *(Prueba con 3 configuraciones)*
9. `PreparadorBebidasV2.java` *(Soporte para lista de equipos)*
10. `TestPreparadorBebidasV2.java` *(Prueba de la V2)*