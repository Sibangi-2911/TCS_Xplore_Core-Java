package com.ilp.tcs;

public class BubbleSort {

	public static void main(String[] args) {
		int array[] = new int[] {10,50,30,20,40};
		array = bubbleSort(array);
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}

	}
	public static int[] bubbleSort(int[] array) {
		int temp;
		for(int i =0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]>array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}

}
