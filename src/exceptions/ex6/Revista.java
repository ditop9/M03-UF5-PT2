package exceptions.ex6;

public class Revista extends Fitxa{
    private short any;
    private short numeroRevista;

    public short getAny() {
        return any;
    }

    public void setAny(short any) {
        this.any = any;
    }

    public short getNumeroRevista() {
        return numeroRevista;
    }

    public void setNumeroRevista(short numeroRevista) {
        this.numeroRevista = numeroRevista;
    }

    public Revista(String referencia, String titol, short any, short numeroRevista) {
        super(referencia, titol);
        this.any = any;
        this.numeroRevista = numeroRevista;
    }


    @Override
    public String toString() {
        return "Revista{" +
                "any=" + any +
                ", numeroRevista=" + numeroRevista +
                "} " + super.toString();
    }
}