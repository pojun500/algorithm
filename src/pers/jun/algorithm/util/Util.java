package pers.jun.algorithm.util;

import static org.fusesource.jansi.Ansi.ansi;
import static org.fusesource.jansi.Ansi.Color.GREEN;
import static org.fusesource.jansi.Ansi.Color.RED;

public class Util {
	
	public static void print(int[] input, int temp) {
		for (int i = 0; i < input.length; i++) {
			if (input[i]==temp) {
				System.out.print(ansi().eraseScreen().fg(RED).a(input[i])); 
			}else{
				System.out.print(ansi().eraseScreen().fg(GREEN).a(input[i])); 
			}
		}
		System.out.println();
	}
	public static void print(int[] input) {
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i]); 
		}
		System.out.println();
	}
	
}
