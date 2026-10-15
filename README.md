# Sistema de Reproducción de Contenido Digital

## Descripción

Este proyecto desarrolla un sistema de reproducción de contenido digital utilizando Java y los principios de la Programación Orientada a Objetos.

El programa permite administrar un catálogo con películas, episodios de series y transmisiones en vivo. Cada tipo de contenido implementa su propia lógica de reproducción y valida las condiciones necesarias para iniciarla.

## Funcionamiento

El sistema realiza dos operaciones principales:

1. **Mostrar el catálogo:** recorre la lista de contenidos y muestra el tipo, el título y la duración de cada elemento. Las transmisiones en vivo aparecen con la etiqueta `en vivo`.
2. **Reproducir el contenido:** intenta reproducir cada elemento y contabiliza cuántos pudieron iniciarse correctamente.

Al finalizar, muestra un resumen con la cantidad de contenidos reproducidos correctamente sobre el total del catálogo.

## Clases principales

### 1. `ContenidoDigital`

Clase abstracta que representa la estructura común de todos los contenidos.

**Atributos:**

* `titulo`: nombre del contenido.
* `duracionMinutos`: duración expresada en minutos.

**Métodos principales:**

* `getTitulo()`: devuelve el título.
* `getDuracionMinutos()`: devuelve la duración.
* `reproducir()`: método abstracto que cada clase hija implementa.
* `getTipo()`: devuelve una etiqueta que identifica el tipo de contenido.

### 2. `Pelicula`

Representa una película.

**Atributo adicional:**

* `edadMinima`: edad mínima indicada para el contenido.

**Funcionamiento:**

* Comprueba que la duración sea mayor que cero.
* Si la duración es inválida, informa el error y devuelve `false`.
* Si es válida, muestra un mensaje simulando la reproducción y la descarga del archivo completo en un búfer.

### 3. `EpisodioSerie`

Representa un episodio de una serie.

**Atributos adicionales:**

* `serie`: nombre de la serie.
* `temporada`: número de temporada.
* `numeroEpisodio`: número del episodio.

**Funcionamiento:**

* Comprueba que la temporada y el número de episodio sean mayores que cero.
* Si alguno es inválido, informa el error y devuelve `false`.
* Si ambos son válidos, muestra los datos del episodio y un mensaje que simula la carga automática del siguiente.

### 4. `TransmisionEnVivo`

Representa una transmisión en directo.

**Atributos adicionales:**

* `enCurso`: indica si la transmisión está activa.
* `espectadores`: cantidad de espectadores.

**Métodos principales:**

* `setEnCurso()`: permite modificar el estado de la transmisión.
* `reproducir()`: comprueba si la transmisión está en curso antes de iniciar la reproducción.
* `getTipo()`: devuelve la etiqueta `Transmisión en vivo`.

Como una transmisión no tiene una duración fija, se inicializa con una duración de cero. Si no está en curso, la reproducción falla.

### 5. `Main`

Contiene el método principal del programa.

**Responsabilidades:**

* Crear una lista de tipo `ContenidoDigital`.
* Agregar películas, episodios de series y transmisiones en vivo.
* Mostrar el catálogo completo.
* Intentar reproducir todos los contenidos.
* Contabilizar y mostrar los resultados.

## Ejemplo de funcionamiento

El catálogo incluye cinco contenidos:

* Una película válida: *El secreto de sus ojos*.
* Un episodio válido: *La nevada*.
* Una transmisión en vivo activa: *Final del torneo*.
* Una transmisión que no está en curso: *Recital de medianoche*.
* Un episodio con una temporada inválida: *Episodio inválido*.

De los cinco contenidos, **tres pueden reproducirse correctamente**. Los otros dos generan mensajes de error debido a sus condiciones de validación.

El resumen final será:

`Resumen: 3 de 5 contenidos se reprodujeron.`

## Conceptos de programación utilizados

* **Abstracción:** `ContenidoDigital` define los atributos y métodos comunes.
* **Herencia:** las clases `Pelicula`, `EpisodioSerie` y `TransmisionEnVivo` heredan de la clase abstracta.
* **Polimorfismo:** una lista de tipo `ContenidoDigital` permite almacenar distintos tipos de contenido y ejecutar su comportamiento específico.
* **Sobrescritura de métodos:** cada clase implementa `reproducir()` y `getTipo()`.
* **Encapsulamiento:** se utilizan atributos `private` y `protected`, además de métodos de acceso.
* **Colecciones:** se utiliza `List` y `ArrayList` para administrar el catálogo.
* **Validación de datos:** cada clase comprueba las condiciones necesarias para iniciar la reproducción.
* **Métodos booleanos:** `reproducir()` devuelve `true` si puede iniciarse la reproducción y `false` si falla una validación.

## Tecnologías utilizadas

* Java
* Programación Orientada a Objetos
* IntelliJ IDEA

## Ejecución

<img width="1292" height="457" alt="image" src="https://github.com/user-attachments/assets/f1531fe9-0bd0-4339-8b22-3bbb9bf7165d" />

## Objetivo del ejercicio

Practicar clases abstractas, herencia y polimorfismo, implementando distintos comportamientos de reproducción y validaciones según el tipo de contenido digital.
