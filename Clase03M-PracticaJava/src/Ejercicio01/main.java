package Ejercicio01;

public class main {
    public static void main(String[] args) {
        Persona[] personas = {  new Persona("Pablo",30),
                                new Persona("Daniela",20),
                                new Persona("Valentina",25),
                                new Persona("Tomas",70),
                                new Persona("Dario",60),};
        SortUtil.ordenar(personas);
        for (int i = 0; i < personas.length; i++) {
            System.out.println(personas[i]);
        }

        System.out.println("----------------------");

        Celular[] celulares = { new Celular(78954, "Pedro"),
                                new Celular(84114, "Lopez"),
                                new Celular(7122, "Gustavo"),
                                new Celular(1114, "Adrian"),
                                new Celular(33333, "Marcos")};
        SortUtil.ordenar(celulares);
        for (int i = 0; i < celulares.length; i++) {
            System.out.println(celulares[i]);
        }

    }
}
