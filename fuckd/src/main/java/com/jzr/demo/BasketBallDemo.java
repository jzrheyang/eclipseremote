package com.jzr.demo;

import java.util.Arrays;
//jzr2020.04.28
public class BasketBallDemo {

	//存储场上球员的球衣号码22

	//瀛樺偍鍦轰笂鐞冨憳鐨勭悆琛ｅ彿鐮�33

	private static Integer[] players=null;
	// 鍦轰笂鐞冨憳涓暟
	private static  int size=0;
	// 鍒濆鍖�
	private static void init(Integer initialCapacity) {
		players=new Integer[initialCapacity];
		// Integer[] player=new Integer[5];	
	}
	// 娣诲姞
	private static void add(Integer playNum) {
		// 鍒ゆ柇鍜屾墿瀹�
		if(size==players.length) {
		Integer []temp=Arrays.copyOf(players, players.length*2);
		   players=temp;
		}
		  players[size]=playNum;
		  size++;
		
	}
	private static void sop() {
		if(players==null) {
			System.out.println("null");
			return;
			
		}if(size==0) {
			System.out.println("[]");
			return;
			
		}
		StringBuilder sb=new StringBuilder(size*2+1);
		sb.append("[");
		for (int i = 0; i <size; i++) {
			
			sb.append(players[i]);
			if(i!=size-1) {
				sb.append(",");
			}else {
                sb.append("]");
            }
		}
		System.out.println(sb.toString());
		
	}
	
	
	
	public static void main(String[] args) {
		//鐩稿綋浜嶪nteger [] player=new Interger[5];
		sop();
		init(5);
		// 娣诲姞
//		sop();
		add(11);
		add(22);
		add(33);
		add(44);
		add(55);
		add(66);
		 sop();
	}

}
