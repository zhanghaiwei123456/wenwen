package com.paixu.maopao;
//ð������
public class BubbleSort {
	public static void main(String[] args){
		/*
		 * 1.������������arr,����10��Ԫ�أ�
		 * 2.��arr��ÿһ��Ԫ�ظ�ֵ0��99���������
		 * 3.ð���㷨��arr��������
		 * 4.���ÿ��arrԪ��
		 */
		int[] arr = new int[10];
		for(int i=0;i<arr.length;i++){
			arr[i] = (int) (Math.random()*100);
			System.out.print(arr[i]+" ");
		}
		
		System.out.println("�����:");
		
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j]>arr[j+1]){
					int t = arr[j];
					arr[j]=arr[j+1];
					arr[j+1] = t;
				}
			}
		}
		
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}

}
