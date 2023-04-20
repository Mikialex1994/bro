package javaarray;

public class arrmain {

	
	 public static void main(String[] args) {
		
		array arr1 = new array("Miki");
		array arr2 = new array("Estif");
		 
		array[] arr3 = {arr1,arr2};
		
		for (array arr4 : arr3) {
			System.out.println(arr4.name);
		}
		System.out.println(arr3[1].name);
	}
}
