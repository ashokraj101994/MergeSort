package com.greatlearing.MS;

import java.util.Scanner;

public class MergeSort {
	public static void main(String[] args) { 
	
		Scanner sc = new Scanner(System.in);		
			int Arr[];
			       System.out.println("please Enter number of elements you want");
			int Num_Elements = sc.nextInt();
			 Arr = new int[Num_Elements];
		for(int i=0;i<Num_Elements;i++) {
		            System.out.println("Please Enter your value in index : " + i);
		    Arr[i]=sc.nextInt();
		    }	
		System.out.println("your Array before sort"); 
		for(int i=0;i<Arr.length;i++) {
			System.out.print(Arr[i] + " ");
		}
			int left = 0;
			int right = Arr.length-1;
			mergeSort(Arr,left,right);
			
			System.out.println(" ");
			System.out.println("your Array After Sort");
			for(int i=0;i<Arr.length;i++) {
				System.out.print(Arr[i] + " ");
			}
		
}

	public static void mergeSort(int arr[],int left,int right) {
		if(left< right) {
			int mid = (left+right)/2;
			
			mergeSort(arr,left,mid);
			mergeSort(arr,mid+1,right);
			
			merge(arr,left,mid,right);
			
		}
		
		}

	public static void merge(int[] arr, int left, int mid, int right) {
		int len1 = mid-left+1;
		int len2 = right-mid; 
		int[] leftArr =new int[len1];
		int[] rightArr=new int[len2];
		for(int i=0;i<len1;i++) {
			leftArr[i]=arr[left+i];
		}
		for(int j=0;j<len2;j++) {
			rightArr[j]=arr[mid+1+j];
		}
		int i = 0;
		int j = 0;
		int k = left;
		while((i<len1)&&(j<len2)) {
			if(leftArr[i]<=rightArr[j]) {
				arr[k]=leftArr[i];
				i++;
			}else
			{
				arr[k]=rightArr[j];
				j++;
	            		
			}
			k++;
		}
		while(i<len1) {
			arr[k]=leftArr[i];
			i++;
			k++;
		}
	    while(i<len2) {
	    	arr[k]=rightArr[j];
	    	j++;
	    	k++;
	    }
	 
	  }
	
}

