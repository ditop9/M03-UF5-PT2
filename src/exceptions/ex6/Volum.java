package exceptions.ex6;

public class Volum extends Obra {
    private short numeroVolum;

    public short getNumeroVolum() {
        return numeroVolum;
    }

    public void setNumeroVolum(short numeroVolum) {
        this.numeroVolum = numeroVolum;
    }

    public Volum(String referencia, String titol, String autor, short nombrePagines, short numero) {
        super(referencia, titol, autor, nombrePagines);
        this.numeroVolum = numero;
    }

    @Override
    public String toString() {
        return "Volum{" +
                "numeroVolum=" + numeroVolum +
                "} " + super.toString();
    }
}