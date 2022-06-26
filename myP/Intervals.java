package com.myP;

import java.util.ArrayList;
import java.util.List;

public class Intervals {

//	Merge overlapping intervals
//
//	For example, let the given set of intervals be {{1,3}, {2,4}, {5,7}, {6,8} }. The intervals {1,3} and {2,4} overlap with each other, so they should be merged and become {1, 4}. Similarly {5, 7} and {6, 8} should be merged and become {5, 8}
//
//	input: {1,3}, {2,4}, {5,7}, {12,14}, {6,8}, {16,18}, {9,10},{17,19}
//	output: {1,4}, {5,8}, {16,19}
	
	
	public static void main(String[] args) {
		int[][] arr = { {1,3}, {2,4}, {5,7}, {12,14}, {6,8}, {16,18}, {9,10},{17,19} };
		
//		for (int i = 0; i < 2; i++)
//            for (int j = 0; j < 2; j++)
//                System.out.println("arr[" + i + "][" + j + "] = "
//                                   + arr[i][j]);
//		 {1,4}, {5,8}, {16,19}
		List<Integer> visited = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			if(visited.contains(i))
				continue;
			for(int j=0;j<arr.length;j++) {
				//if(arr[i][j] < arr[i+1][j+1] && arr[i][j+1] < arr[i+1][j+1] && arr[i+1][j] < arr[i+1][j+1])
				//	if(arr[i][j+1] > arr[i+1][j]) {
				if(arr[i][0] < arr[i+1][1] && arr[i][1] < arr[i+1][1] && arr[i+1][0] < arr[i+1][1])
					if(arr[i][1] > arr[i+1][0]) {
					System.out.println(arr[i][0] +", "+ arr[i][1]+", "+ arr[i+1][0]+", "+ arr[i+1][1]);
						visited.add(j+1);
						break;
					}
						
			}
		}
	}

}
