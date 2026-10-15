import java.util.ArrayList;
import java.util.List;

void main() {

    List<ContenidoDigital> catalogo = new ArrayList<>();

    catalogo.add(new Pelicula("El secreto de sus ojos", 129, 16));
    catalogo.add(new EpisodioSerie("El Eternauta", 1, 3, "La nevada", 52));
    catalogo.add(new TransmisionEnVivo("Final del torneo", true, 85000));
    catalogo.add(new TransmisionEnVivo("Recital de medianoche", false, 0));
    catalogo.add(new EpisodioSerie("Serie de prueba", 0, 1, "Episodio inválido", 40));

    System.out.println("=== Catálogo ===");
    for (ContenidoDigital c : catalogo) {
        String duracion = c.getDuracionMinutos() > 0 ? c.getDuracionMinutos() + " min" : "en vivo";
        System.out.println("- " + c.getTipo() + ": " + c.getTitulo() + " (" + duracion + ")");
    }

    System.out.println("\n=== Reproducción ===");
    int reproducidos = 0;

    for (ContenidoDigital c : catalogo) {
        if (c.reproducir()) {
            reproducidos++;
        }
    }

    System.out.println("\nResumen: " + reproducidos + " de " + catalogo.size() + " contenidos se reprodujeron.");

}
