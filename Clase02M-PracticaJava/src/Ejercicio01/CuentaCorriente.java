package Ejercicio01;

public class CuentaCorriente
{
    private double saldo;

    public CuentaCorriente(double saldo) {
        this.saldo = saldo;
    }

    public CuentaCorriente(){ }

    public CuentaCorriente(CuentaCorriente cuentaCorriente){
        this.saldo = cuentaCorriente.getSaldo();
    }

    public void ingreso(double monto){
        this.saldo += monto;
    }

    public void egreso(double monto){
        this.saldo -= monto;
    }

    public void reintegro(double monto, CuentaCorriente cuentaCorriente){
        cuentaCorriente.egreso(monto);
        this.ingreso(monto);
    }

    public void transferencia(double monto, CuentaCorriente cuentaCorriente){
        cuentaCorriente.ingreso(monto);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
