package com.jzr.demo;

import java.util.Arrays;
//jzr2020.04.28
public class BasketBallDemo {
	//�洢������Ա�����º���22
	private static Integer[] players=null;
	// ������Ա����
	private static  int size=0;
	// ��ʼ��
	private static void init(Integer initialCapacity) {
		players=new Integer[initialCapacity];
		// Integer[] player=new Integer[5];	
	}
	// ���
	private static void add(Integer playNum) {
		// �жϺ�����
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
		//�൱��Integer [] player=new Interger[5];
		sop();
		init(5);
		// ���
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
