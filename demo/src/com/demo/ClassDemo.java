package com.demo;

public class ClassDemo implements InterDemo{
	
	ClassDemo(){
		System.out.println(" CLASSDEMO CONSTRUCTOR ");
	}
	
	
	/*
	 * ClassDemo(int a){
	 * 
	 * }
	 */
	 public static void main(String[] args) {
		InterDemo cd=new ClassDemo();
		cd.add();
		cd.multiple();
	//	cd.show();    can not call 
		System.out.println(cd.ADDRESS);
		cd.show();
		InterDemo.subtract();
	
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println(30+20);
	}

	@Override
	public void multiple() {
		// TODO Auto-generated method stub
		System.out.println(30*20);
		
	}
	public void show() {
		System.out.println("CLASS SHOW");
	}
}
