package Ejercicio03;

public class Libro
{
    private String titulo;
    private String autor;
    private String isbn;
    private String estado;

    public Libro(String titulo, String autor, String isbn,String estado) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.estado = estado;
    }
    public Libro() {}


    public void prestamo(){
        this.setEstado("Pestado");
    }

    public void devolucion(){
        this.setEstado("Disponible");
    }

    @Override
    public String toString(){
        return this.getTitulo() + ", " + this.getIsbn() + ", " + this.getAutor() + ", " + this.getEstado();
    }


    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
}
