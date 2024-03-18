package ex6;

public class Obra extends Fitxa {
    private String autor;
    private short nombrePagines;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public short getNombrePagines() {
        return nombrePagines;
    }

    public void setNombrePagines(short nombrePagines) {
        this.nombrePagines = nombrePagines;
    }

    public Obra(String referencia, String titol, String autor, short nombrePagines) {
        super(referencia, titol);
        this.autor = autor;
        this.nombrePagines = nombrePagines;
    }


    @Override
    public String toString() {
        return "Obra{" +
                "autor='" + autor + '\'' +
                ", nombrePagines=" + nombrePagines +
                "} " + super.toString();
    }
}