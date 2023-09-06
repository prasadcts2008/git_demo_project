package com.cyr.gitdemo;

public class App {

	public void addData(String data) {
		System.out.println("data::" + data);
		if (data.equals(Constant.DATA_TYPE)) {
			System.out.println("welcomes");
		}
	}
	public void dispaly(){
	System.out.println("Added new method");
	}

	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}
