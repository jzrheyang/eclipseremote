package com.jzr.Thread;
//添加了一些东西
public class AppTest {
	public static void main(String[] args) {
		ShareSource shareSource=new ShareSource();
		new Thread(new Producer(shareSource)).start();
		new Thread(new Cosumer(shareSource)).start();
	}

}
