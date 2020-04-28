package com.jzr.Thread;

public class ShareSource {
	private String  name;
	private String  gender;
	public void push(String name, String gender) {
		this.name = name;
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.gender = gender;
	}
	public void popup() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(this.name+"-"+this.gender);
	}
	
	

}
