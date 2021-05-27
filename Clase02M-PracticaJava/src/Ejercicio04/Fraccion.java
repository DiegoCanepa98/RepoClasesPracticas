package Ejercicio04;

public class Fraccion {
    private int numerador;
    private int denominador;

    public Fraccion(int n, int d) {
        this.setDenominador(n);
        this.setDenominador(d);
    }

    public Fraccion multiplicar(Fraccion f) {
        setNumerador(numerador * f.getNumerador());
        setDenominador(denominador * f.getDenominador());
        return this;
    }

    public Fraccion multiplicar(int x) {
        setNumerador(numerador * x);
        return  this;
    }

    public void simplificar() {
        int i = 2;

        while(i <= this.numerador && i <= this.denominador) {
            if (this.numerador % i == 0 && this.denominador % i == 0) {
                this.numerador /= i;
                this.denominador /= i;
            } else {
                ++i;
            }
        }

    }

    public static Fraccion sumar(Fraccion a, Fraccion b) {
        Fraccion x = new Fraccion(a.numerador, a.denominador);
        x.sumar(b);
        return x;
    }

    public Fraccion sumar(Fraccion x) {
        int nd = this.denominador * x.denominador;
        int nn = this.numerador * x.denominador + x.numerador * this.denominador;
        this.numerador = nn;
        this.denominador = nd;
        return this;
    }

    public Fraccion sumar(int x){
        setNumerador(numerador + denominador * x);
        return this;
    }

    public Fraccion dividir(Fraccion f){
        setNumerador(numerador * f.getDenominador());
        setDenominador(denominador * f.getNumerador());
        return this;
    }

    public Fraccion dividir(int x){
        setDenominador(denominador * x);
        return this;
    }

    public Fraccion restar (int x) {
        setNumerador(numerador - denominador * x);
        return this;
    }

    public Fraccion restar(Fraccion x) {
        int nd = this.denominador * x.denominador;
        int nn = this.numerador * x.denominador - x.numerador * this.denominador;
        this.numerador = nn;
        this.denominador = nd;
        return this;
    }

    public void imprimir() {
        System.out.println(this.numerador + "/" + this.denominador);
    }

    public int getNumerador() {
        return this.numerador;
    }

    public void setNumerador(int x) {
        this.numerador = x;
    }

    public int getDenominador() {
        return this.denominador;
    }

    public void setDenominador(int d) {
        if (d == 0) {
            throw new RuntimeException("El denominador no puede ser cero");
        } else {
            this.denominador = d;
        }
    }
}
