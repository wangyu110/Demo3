package com.yu.demo;

public class Demo3 {
    /**
     * 函数 （有无参数 不同类型 有无返回值）
     */
	//无参数 同类型
	public void add1(){
		int a=1;
		int b=2;
		int c=a+b;
		System.out.println("c的值："+c);
	}
	//有参数  同类型
	public void add2(double x,double y){
		double z=x+y;
		System.out.println("z的值："+z);
	}
	//有参数 不同类型
	public void add3(int a,double b){
		double c=a+b;
		System.out.println("c的值："+c);
	}
	//无参数 同类型 有返回值
	public  int add4(){
		int a=1;
		int b=2;
		int c=a+b;
		return c;
	}
	//有参数 同类型 有返回值
	public int add5(int x, int y){
		int z=x+y;
		return z;
	}
	//有参数 不同类型 有返回值
	public double add6(int x, double y){
		double z=x+y;
		return z;
	}
	
	
}
