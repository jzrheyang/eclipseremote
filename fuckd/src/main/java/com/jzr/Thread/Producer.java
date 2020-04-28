package com.jzr.Thread;

public class Producer  implements Runnable{
	private ShareSource source=null;

	public Producer(ShareSource shareSource) {
		this.source=shareSource;
	}

	@Override
	public void run() {
		for (int i = 0; i <50; i++) {
			if(i%2==0) {
				source.push("´º¸ç", "ÄÐ");
			}else {
				source.push("·ï½ã", "Å®");
			}
		}
		
	}

}
