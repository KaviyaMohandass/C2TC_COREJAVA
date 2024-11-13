package com.tnsif.dayeleven.v1;

public class ArrayOperations {

	int intArray[] ;
	
	public ArrayOperations() {
		super();
		
	}

	public ArrayOperations(int[] intArray) {
		super();
		this.intArray = intArray;
		
	}
	
	public void displayArray() {
		for(int no:intArray) {
			System.out.println("The array elements are: "+no);
		}

	}

	public static void main(String[]args) {}

	public String getElement(int i) {
		// TODO Auto-generated method stub
		return null;
	} 
	
}