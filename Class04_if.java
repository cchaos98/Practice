package TheSecond;

import java.util.Scanner;

public class Class04_if {
/**
 * main:���������
 * { }������飺1���������ı���Ϊ�ֲ��������ڿ�����Ч��
 * 						2������Ĵ����ڿ�����Ч
 * 						3�����ⲿ�����ı����ڿ��ڸı�ʱ�����ı��ⲿ��ֵ��
 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		int month=sc.nextInt();
		int day=sc.nextInt();
		
		int days = day;
		
		boolean isleap=(year%400==0)||(year%4==0&&year%100!=0);
		if(month>1)
			days+=31;
		if(month>2)
			days+=28;
		if(month>3)
			days+=31;
		if(month>4)
			days+=30;
		if(month>5)
			days+=31;
		if(month>6)
			days+=30;
		if(month>7)
			days+=31;
		if(month>8)
			days+=31;
		if(month>9)
			days+=30;
		if(month>10)
			days+=31;
		if(month>11)
			days+=30;
		if(month>12)
			days+=31;	
		if(isleap)
		days+=1;
		System.out.println(days);
	}
	
	
}





/*
		 * Scanner sc=new Scanner(System.in); int a=sc.nextInt(); int b=sc.nextInt();
		 * int c=sc.nextInt(); int d; if(a<b) { d=a; a=b; b=d; } if(a<c) { d=a; a=c;
		 * c=d; } if(b<c) { d=b; b=c; c=d; } System.out.println(" "+a+" "+b+" "+c);
		 */
/*
		 * boolean israin=true; if (israin) { System.out.println("�������겻�ܴ������ˣ�");
		 * System.out.println("����ȥ�Լ����ˣ�"); }else { System.out.println("����ȥ������");
		 * System.out.println("Ȼ����ȥߣ��������"); }
		 */