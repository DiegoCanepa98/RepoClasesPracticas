package meli.ejerc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RadixSortEjerc
{
	public static void radixSort(int []arr)
	{
		String[] arrString = StringUtil.toStringArray(arr);
		StringUtil.lNormalize(arrString,'0');


		HashMap<Integer, ArrayList<String>> hm = new HashMap<>();
		for (int i=StringUtil.maxLength(arrString)-1; i>=0; i--){
			for (int j=0; j<arrString.length; j++){
				ArrayList<String> arrayListExist =  hm.get(Character.getNumericValue(arrString[j].charAt(i)));

				if (arrayListExist == null) {
					ArrayList<String> newArrayList = new ArrayList<>();
					newArrayList.add(arrString[j]);
					hm.put(Character.getNumericValue(arrString[j].charAt(i)), newArrayList);
				}else {
					arrayListExist.add(arrString[j]);
					hm.put(Character.getNumericValue(arrString[j].charAt(i)), arrayListExist);
				}
			}

			int iteration = 0;
			while (iteration<arr.length) {
				for(Map.Entry<Integer, ArrayList<String>> entry:hm.entrySet()){
					Integer key = entry.getKey();
					ArrayList<String> value = entry.getValue();
					for(int p=0; p<value.size();p++)
					{
						arrString[iteration] = value.get(p);
						iteration++;
					}
				}
			}
			hm.clear();

		}

		int[] arrayInt = StringUtil.toIntArray(arrString);
		for (int i=0; i<arrayInt.length;i++){
			arr[i] = arrayInt[i];
		}
	}

	public static void main(String[] args)
	{
		int arr[]={16223,898,13,906,235,23,9,1532,6388,2511,8};
		radixSort(arr);

		for(int i=0; i<arr.length;i++)
		{
			System.out.print(arr[i]+(i<arr.length-1?",":""));
		}
	}
}
