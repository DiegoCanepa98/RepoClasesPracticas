package meli.ejerc;

public class StringUtil
{
	// Retorna una cadena compuesta por n caracteres c
	// Ejemplo: replicate('x',5) ==> 'xxxxx'
	public static String replicate(char c,int n)
	{
		String cadena = new String();
		cadena = Character.toString(c);
		for (int i=1; i<n; i++) {
			cadena += Character.toString(c);
		}
		return cadena;
	}

	// Retorna una cadena de longitud n, compuesta por s
	// y precedida de tantos caracteres c como sea necesario
	// para completar la longitud mencionada
	// Ejemplo lpad("5",3,'0') ==> "005"
	public static String lpad(String s, int n, char c)
	{
		while (s.length()<n){
			s = Character.toString(c) + s;
		}
		return s;
	}

	// Retorna un String[] conteniendo los elementos de arr
	// representados como cadenas de caracteres
	public static String[] toStringArray(int arr[])
	{
		String[] arrString = new String[arr.length];
		for(int i=0; i<arr.length;i++){
			arrString[i] = Integer.toString(arr[i]);
		}
		return arrString;
	}

	// Retorna un String[] conteniendo los elementos de arr
	// representados como cadenas de caracteres
	public static int[] toIntArray(String arr[])
	{
		int[] arrInt = new int[arr.length];
		for(int i=0; i<arr.length;i++){
			arrInt[i] = Integer.parseInt(arr[i]);
		}
		return arrInt;
	}

	// Retorna la longitud del elemento con mayor cantidad
	// de caracteres del array arr
	public static int maxLength(String arr[])
	{
		int maxLength = 0;
		for(int i=0; i<arr.length; i++) {
			if (arr[i].length() > maxLength) {
				maxLength = arr[i].length();
			}
		}
		return maxLength;
	}

	// Completa los elemento del arr agregando caracteres c
	// a la izquierda, dejando a todos con la longitud del mayor
	public static void lNormalize(String arr[], char c)
	{
		int maxLength = maxLength(arr);
		for (int i=0; i<arr.length; i++) {
			arr[i] = lpad(arr[i],maxLength,'0');
		}
	}
}
