package com.jzr.Thread;

public class Cosumer implements Runnable{
	private ShareSource source=null;
public Cosumer(ShareSource shareSource) {
		this.source=shareSource;
	}
@Override
public void run() {
	for (int i = 0; i <50; i++) {
		source.popup();
	}
	
}
}
