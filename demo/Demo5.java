package com.yu.demo;
import java.util.Arrays;
public class Demo5{
/**
 * 数组定义
 */
	//定义整型数组
	public void Array(){
		int[] arr1={1,2,3,4,5};
		System.out.println(Arrays.toString(arr1));
	}
	//定义浮点型数组
	public void Array1(){
		double[] arr2={1.1,2.2,3.3,4.4,5.5};
		System.out.println(Arrays.toString(arr2));	
	}
	//定义字符串数组
	public void Array2(){
		String[] arr3={"wo","de","dream"};
		System.out.println(Arrays.toString(arr3));	
	}
	/**
	 * 数组长度
	 * 
	 */
	 public void Array3(){
		 int[] arr4={1,2,3};
		 int arra= arr4.length;
	       System.out.println("数组长度："+arra);
	 }
	 /**
	  * 访问数组元素
	  */
	 public void Array4(){
		     //定义整数型数组
		 int[] arr5={2,3,4,5,6};
		     //提取数组
	       int a= arr5[0];
	       int b=arr5[3];
	       System.out.println("arr5[]的第一个值："+a);
	       System.out.println("arr5[]的第四个值："+b);
	 }
	 /**
	  * 数组遍历
	  */
	 public void Array5(){
		   String[] arr5={"wo","de","shi","jie"};
		   for(int i=0;i<arr5.length;i++){
			   System.out.println("arr1[" + i + "]:"+arr5[i] );
		   }
	 }
	 /**
	  * 修改数组元素
	  */
	 //定义数组
	 public void Array6(){
		 int[] arr6={2,4,6,8};
	      System.out.println("arr6"+Arrays.toString(arr6));	 
	 
	 //修改
	 for(int i=0;i<arr6.length;i++){
		 if(arr6[i]<0){
			 arr6[i]=0;
		 }
	 }
	 System.out.println("arr6:" + Arrays.toString(arr6));
	 }
	 
	 
	 
	 
	public static void main(String[] args) {
		    //定义数组 并赋值
	  int arr[] =new int[5];
	          arr[0]=1;
	          arr[1]=2;
	          arr[2]=3;
	          arr[3]=4;
	          arr[4]=5;
	          //输出
	          System.out.println("arr[0]的值："+arr[0]);
	          System.out.println("arr[1]的值："+arr[1]);
	          System.out.println("arr[2]的值："+arr[2]);
	          System.out.println("arr[3]的值："+arr[3]);
	          System.out.println("arr[4]的值："+arr[4]);
	          Demo5 arr1= new Demo5();
//	             arr1.Array();
//	             arr1.Array3();
//	             arr1.Array5();
	             arr1.Array6();
	             
	}
}
