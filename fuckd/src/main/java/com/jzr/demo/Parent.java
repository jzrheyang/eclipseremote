package com.jzr.demo;


	public class Parent{
		public static int t = parentStaticMethod2();
		{
		System.out.println("����Ǿ�̬��ʼ����");
		}
		static {
		System.out.println("���ྲ̬��ʼ����");
		}
		public Parent(){
		System.out.println("����Ĺ��췽��");
		}
		public static int parentStaticMethod(){
		System.out.println("������ľ�̬����");
		return 0;
		}
		private static int parentStaticMethod2() {
		System.out.println("����ľ�̬����2");
		return 9;
		}
		}

