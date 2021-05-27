package Ejercicio05;

import java.time.DateTimeException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Fecha
{
    private int dia;
    private int mes;
    private int año;

    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }
    public Fecha(){}
    public Fecha(Fecha fecha){
        this.dia = fecha.getDia();
        this.año = fecha.getAño();
        this.mes = fecha.getMes();
    }

    public boolean esCorrecto(){
        try {
            GregorianCalendar date = new GregorianCalendar();
            date.set(año,mes,dia);
        } catch (DateTimeException e) {
            return false;
        }
        return true;
    }

    public void incrementarDia(){
        Calendar date = GregorianCalendar.getInstance();
        date.set(año,mes,dia);
        System.out.println(date.getTime());
    }

    @Override
    public String toString(){
        return dia + "/" + mes + "/" + año;
    }

    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public int getAño() {
        return año;
    }
    public void setAño(int año) {
        this.año = año;
    }
}
