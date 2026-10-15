public class EpisodioSerie extends ContenidoDigital {

    private String serie;
    private int temporada;
    private int numeroEpisodio;

    public EpisodioSerie(String serie, int temporada, int numeroEpisodio, String titulo, int duracionMinutos) {
        super(titulo, duracionMinutos);
        this.serie = serie;
        this.temporada = temporada;
        this.numeroEpisodio = numeroEpisodio;
    }

    @Override
    public boolean reproducir() {

        if (temporada <= 0 || numeroEpisodio <= 0) {
            System.out.println("[Serie] Error: temporada o número de episodio inválidos para \"" + titulo + "\".");
            return false;
        }

        System.out.println("[Serie] Reproduciendo " + serie + " T" + temporada + "E" + numeroEpisodio
                + " - \"" + titulo + "\" (" + duracionMinutos + " min).");
        System.out.println("        Al terminar, se cargará automáticamente el siguiente episodio.");
        return true;
    }

    @Override
    public String getTipo() {
        return "Episodio de serie";
    }
}