package com.kh.practice.dimension;

import java.util.Scanner;

public class DimensionPractice {
    public void practice1() {
    	int[][] arry1 = new int[3][3];
    	for(int i = 0; i < arry1.length; i++) {
    		for(int j = 0; j <arry1[i].length; j++) {
    			System.out.print("(" + i +", "+ j + ")");
    		}
    		System.out.println();
    	}
    }
    
    public void practice2() {
    	int[][] arry1 = new int[4][4];
    	int sum = 0;
    	for(int i = 0; i < arry1.length; i++) {
    		for(int j = 0; j <arry1[i].length; j++) {
    			    sum += 1;
    				System.out.printf("%3d",sum);   			
    		}
    		System.out.println();
    	}
    }
    
    
}
