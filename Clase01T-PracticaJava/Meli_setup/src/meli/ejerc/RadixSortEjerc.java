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
			for (int j=arrString.length-1; j>=0; j--){
				if (hm.get((int) arrString[j].charAt(i)) == null){
					ArrayList<String> arrayList = new ArrayList<String>();
					arrayList.add(arrString[j]);
					hm.put((int) arrString[j].charAt(i), arrayList);
				} else {
					ArrayList<String> arrayList = hm.get((int) arrString[j].charAt(i));
					arrayList.add(arrString[j]);
					hm.put((int) arrString[j].charAt(i), arrayList);
				}
			}

			for(Map.Entry<Integer, ArrayList<String>> entry:hm.entrySet()){
				Integer key = entry.getKey();
				ArrayList<String> value = entry.getValue();
				System.out.println("key=" + key);
				for(int p=0; p<value.size();p++)
				{
					System.out.print(value.get(p)+(i<value.size()-1?",":""));
				}
			}
			break;
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
