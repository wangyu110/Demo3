package com.yu.demo;

import java.util.Arrays;

public class Demo2 {
	 public static void main(String[] args) {
	        
			// ����һ���������飬����ɼ���Ϣ
			int[] scores = { 89, 72, 64, 58, 93 };
	        
			// ��Arrays��������������
			Arrays.sort(scores);
	        
			// ʹ��foreach������������е�Ԫ��
			for (int score : scores                ) {
				System.out.println(score);
			}
		}
}
