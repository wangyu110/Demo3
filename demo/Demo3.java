package com.yu.demo;

public class Demo3 {
    /**
     * ���� �����޲��� ��ͬ���� ���޷���ֵ��
     */
	//�޲��� ͬ����
	public void add1(){
		int a=1;
		int b=2;
		int c=a+b;
		System.out.println("c��ֵ��"+c);
	}
	//�в���  ͬ����
	public void add2(double x,double y){
		double z=x+y;
		System.out.println("z��ֵ��"+z);
	}
	//�в��� ��ͬ����
	public void add3(int a,double b){
		double c=a+b;
		System.out.println("c��ֵ��"+c);
	}
	//�޲��� ͬ���� �з���ֵ
	public  int add4(){
		int a=1;
		int b=2;
		int c=a+b;
		return c;
	}
	//�в��� ͬ���� �з���ֵ
	public int add5(int x, int y){
		int z=x+y;
		return z;
	}
	//�в��� ��ͬ���� �з���ֵ
	public double add6(int x, double y){
		double z=x+y;
		return z;
	}
	
	
}
