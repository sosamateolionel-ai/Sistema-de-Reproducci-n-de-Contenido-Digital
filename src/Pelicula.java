public class Pelicula extends ContenidoDigital {

    private int edadMinima;

    public Pelicula(String titulo, int duracionMinutos, int edadMinima) {
        super(titulo, duracionMinutos);
        this.edadMinima = edadMinima;
    }

    @Override
    public boolean reproducir() {

        if (duracionMinutos <= 0) {
            System.out.println("[Película] Error: \"" + titulo + "\" tiene una duración inválida.");
            return false;
        }

        System.out.println("[Película] Reproduciendo \"" + titulo + "\" (" + duracionMinutos
                + " min, +" + edadMinima + "). Descargando el archivo completo en buffer...");
        return true;
    }

    @Override
    public String getTipo() {
        return "Película";
    }
}