package Ejercicio02;

public class Contador
{
    private long valor;

    public Contador(long valor) {
        this.valor = valor;
    }

    public Contador() {}

    public Contador(Contador contador){
        this.valor = contador.getValor();
    }

    public void incrementar(long incremento){
        valor += incremento;
    }

    public void decrementar(long decremento){
        valor += decremento;
    }

    public long getValor() {
        return valor;
    }

    public void setValor(long valor) {
        this.valor = valor;
    }


}
