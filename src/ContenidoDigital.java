public abstract class ContenidoDigital {

    protected String titulo;
    protected int duracionMinutos;

    public ContenidoDigital(String titulo, int duracionMinutos) {
        this.titulo = titulo;
        this.duracionMinutos = duracionMinutos;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    // Cada tipo de contenido define su propia lógica de reproducción
    public abstract boolean reproducir();

    // Etiqueta del tipo, para el listado
    public abstract String getTipo();
}