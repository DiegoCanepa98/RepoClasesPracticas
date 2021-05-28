package Ejercicio01;

public class SortUtil {

    public static <T extends Precedable> void ordenar(T arr[]){
        for (int i=0; i<arr.length-1;i++){
            for(int j=i+1; j<arr.length;j++){
                if (arr[j].precedeA(arr[i]) < 0) {
                    T aux = arr[i];
                    arr[i]= arr[j];
                    arr[j] = aux;
                }
            }
        }
    }
}
