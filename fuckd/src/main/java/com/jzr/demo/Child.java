package com.jzr.demo;

public class Child extends Parent{
public static int t=childStaticMethod2();
{
System.out.println("����Ǿ�̬��ʼ����");
}
static{
System.out.println("���ྲ̬��ʼ����");
}
public Child(){
System.out.println("����Ĺ��췽��");
}
public static int childStaticMethod(){ System.out.println("����ľ�̬����");
return 1000;
}
public static int childStaticMethod2(){
System.out.println("����ľ�̬����2"); return 1000;
}
public static void main(String[] args) {
Parent child=new Child();
}
}