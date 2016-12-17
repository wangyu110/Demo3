package com.yu.demo;

public class Demo4 {
    /**
     * 数组输出
     * 
     */
	public void array5() {
		// 定义数组
		String[] arr1 = { "we", "are", "the", "world" };
		
		//遍历每个元素
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("arr1[" + i + "]:" + arr1[i]);
		}
	}
 
	public static void main(String[] args){
		Demo4 arr= new Demo4();
	    	arr.array5();
	}
	}
