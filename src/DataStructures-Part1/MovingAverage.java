package test;

import java.util.Scanner;

public class MovingAverage {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double[] a = new double[N];
		int i=1;
		double sum = 0;
		while(sc.hasNextDouble()){
			sum -= a[i%N];
			a[i%N] = sc.nextDouble();
			sum += a[i%N];
			if(i>=N) System.out.println("Average = "+ sum/N);
			i++;
		}
	}
}
