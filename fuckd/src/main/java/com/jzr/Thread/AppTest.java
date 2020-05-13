package com.jzr.Thread;
//ĚíźÓÁËŇťĐŠśŤÎ÷567888jizhirong 吉智荣红
//jxt233 555
//jxt233 444
public class AppTest {
	public static void main(String[] args) {
		ShareSource shareSource=new ShareSource();
		new Thread(new Producer(shareSource)).start();
		new Thread(new Cosumer(shareSource)).start();
	}

}
