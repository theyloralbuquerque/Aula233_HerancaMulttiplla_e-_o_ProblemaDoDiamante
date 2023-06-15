package dispositivos;

public abstract class Dispositivo {

    public String numeroDeSerie;

    public Dispositivo(String numeroDeSerie) {
        this.numeroDeSerie = numeroDeSerie;
    }

    public String getNumeroDeSerie() {
        return numeroDeSerie;
    }

    public void setNumeroDeSerie(String numeroDeSerie) {
        this.numeroDeSerie = numeroDeSerie;
    }

    public abstract void processarDoc(String doc);
}