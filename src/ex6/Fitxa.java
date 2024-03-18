package ex6;

import java.util.Objects;

public class Fitxa {
    private String referencia;
    private String titol;

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getTitol() {
        return titol;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public Fitxa(String referencia, String titol) {
        this.referencia = referencia;
        this.titol = titol;
    }

    @Override
    public String toString() {
        return "Fitxa{" +
                "referencia='" + referencia + '\'' +
                ", titol='" + titol + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fitxa fitxa = (Fitxa) o;
        return Objects.equals(referencia, fitxa.referencia) && Objects.equals(titol, fitxa.titol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(referencia, titol);
    }
}