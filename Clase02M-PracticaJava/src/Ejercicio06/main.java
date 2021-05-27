package Ejercicio06;

public class main {
    public static void main(String[] args) {
        System.out.println("¡" + StringUtil.ltrim("     jbfsjdbf   ") + "!");
        System.out.println("¡" + StringUtil.rtrim("     jbfsjdbf   ") + "!");
        System.out.println("¡" + StringUtil.trim("     jbfsjdbf   ") + "!");
        System.out.println(StringUtil.rpad("X",4,'Z'));
        System.out.println(StringUtil.indexOfN("John|Paul|George|Ringo",'|',2));
    }
}
