public class TransmisionEnVivo extends ContenidoDigital {

    private boolean enCurso;
    private int espectadores;

    public TransmisionEnVivo(String titulo, boolean enCurso, int espectadores) {
        super(titulo, 0); // una transmisión en vivo no tiene duración fija
        this.enCurso = enCurso;
        this.espectadores = espectadores;
    }

    public void setEnCurso(boolean enCurso) {
        this.enCurso = enCurso;
    }

    @Override
    public boolean reproducir() {

        if (!enCurso) {
            System.out.println("[En vivo] Error: la transmisión \"" + titulo + "\" no está en curso.");
            return false;
        }

        System.out.println("[En vivo] Conectando a la transmisión \"" + titulo + "\" ("
                + espectadores + " espectadores). Sin duración fija, sin posibilidad de adelantar.");
        return true;
    }

    @Override
    public String getTipo() {
        return "Transmisión en vivo";
    }
}