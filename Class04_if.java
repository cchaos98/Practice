package TheSecond;

import java.util.Scanner;

public class Class04_if {
/**
 * main:函数的入口
 * { }：代码块：1、中声明的变量为局部变量，在块外无效。
 * 						2、块外的代码在块内有效
 * 						3、在外部声明的变量在块内改变时，不改变外部的值。
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
		 * boolean israin=true; if (israin) { System.out.println("今天下雨不能打篮球了！");
		 * System.out.println("我们去吃鸡算了！"); }else { System.out.println("我们去打篮球");
		 * System.out.println("然后再去撸串！！！"); }
		 */