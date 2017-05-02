package pers.jun.algorithm.sort;

import static org.fusesource.jansi.Ansi.ansi;
import static org.fusesource.jansi.Ansi.Color.GREEN;
import static org.fusesource.jansi.Ansi.Color.RED;

import pers.jun.algorithm.util.Util;  

/**
 * for j<- 2 to length[A]  
 *  do key <- A[j]  
 *      >Insert A[j] into the sorted sequence A[1..j-1] ��>���Ŵ������Ĳ�����ע�ͣ� 
 *      i <- j-1  
 *      while i>0 and A[i]>key  
 *          do A[i+1] <- A[i]  
 *          i <- i-1  
 *      A[i+1] <- key  
 * �㷨���Ӷȣ�n^2 
 */
public class InsertionSort {
	
	public static void main(String[] args) {
		
		int[] input = {9,2,5,7,4,1,3};
		for (int j = 1; j < input.length; j++) {// ���Ӷ� n 
            int key = input[j]; 
            int i = j - 1; 
            //���θ�֮ǰ��Ԫ�ؽ��бȽϣ�������ֱ�ǰ���ԭ��С���򽻻�λ�ã������������ 
            while (i >= 0 && input[i] > key) {//���Ӷȣ�1+2+...+(n-1)=��(n^2) 
                input[i + 1] = input[i]; 
                input[i] = key; 
                i--; 
            } 
            Util.print(input, key);
        } 
	}

	
	
}
