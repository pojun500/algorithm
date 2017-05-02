package pers.jun.algorithm.sort;

import static org.fusesource.jansi.Ansi.ansi;
import static org.fusesource.jansi.Ansi.Color.GREEN;
import static org.fusesource.jansi.Ansi.Color.RED;

import pers.jun.algorithm.util.Util;  

/**
 * for j<- 2 to length[A]  
 *  do key <- A[j]  
 *      >Insert A[j] into the sorted sequence A[1..j-1] （>符号代表后面的部分是注释） 
 *      i <- j-1  
 *      while i>0 and A[i]>key  
 *          do A[i+1] <- A[i]  
 *          i <- i-1  
 *      A[i+1] <- key  
 * 算法复杂度：n^2 
 */
public class InsertionSort {
	
	public static void main(String[] args) {
		
		int[] input = {9,2,5,7,4,1,3};
		for (int j = 1; j < input.length; j++) {// 复杂度 n 
            int key = input[j]; 
            int i = j - 1; 
            //依次跟之前的元素进行比较，如果发现比前面的原素小，则交换位置，最终完成排序。 
            while (i >= 0 && input[i] > key) {//复杂度：1+2+...+(n-1)=Θ(n^2) 
                input[i + 1] = input[i]; 
                input[i] = key; 
                i--; 
            } 
            Util.print(input, key);
        } 
	}

	
	
}
