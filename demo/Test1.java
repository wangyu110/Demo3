package com.yu.demo;

public class Test1 {
public static void main(String[] args){
	Demo3 sum=new Demo3();
	  sum.add1();
	  sum.add2(1, 2);
	  sum.add3(1,1.2);
	       // int c =sum.add4();
	  System.out.println("add4��ֵ��"+sum.add4());
	      // sum.add5();
	  System.out.println("add5��ֵ��"+sum.add5(1,2));
	     //sum.add6();
	  System.out.println("add6��ֵ��"+sum.add6(1,1.5));
}
}
