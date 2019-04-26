package TheSecond;

import java.util.Scanner;

/**
 * 
 * @author 超超
 *
 */
public class Class03_luojiyunsuan {
	/*
	 * ! 取反
	 * && 有一假为假
	 * || 有一真为真
	 */
public static void main(String[] args) {
	System.out.println("请输入公里数：");
	Scanner sc=new Scanner(System.in);
	double km=sc.nextDouble()-3;		
	double price=        km   <=      7      ?    ( km>=0?  km*1.5+5:5 )      :     ((km-7)*2+15.5)  ;
	System.out.println("价格为："+price+"元");
}
}






	/*
		 * System.out.println("请输入：0 (不同意)    1 (同意)"); Scanner sc=new
		 * Scanner(System.in); int a=sc.nextInt(); int b=sc.nextInt(); int
		 * c=sc.nextInt(); String d=((a+b+c)>=2)?"通过":"不通过";//三目运算符
		 * System.out.println("是否通过？"+d);
		 */
/*
		 * System.out.println("请输入年份："); Scanner sc=new Scanner(System.in); int
		 * y=sc.nextInt(); boolean leap=(y%400==0)||(y%4==0&&y%100!=0);
		 * System.out.println("是否为闰年？"+leap);
		 */
/*
		 * System.out.println("请输入三个数："); Scanner sc=new Scanner(System.in); double
		 * a=sc.nextDouble(); double b=sc.nextDouble(); double c=sc.nextDouble();
		 * boolean s=a+b>c&&a+c>b&&b+c>a&&a>0&&b>0&&c>0;
		 * System.out.println("是否可以组成三角形？"+s);
		 */
/*	if(a>0&&b>0&&c>0) {
		if(a+b>c&&a+c>b&&b+c>a) {
			System.out.println("可以转换为三角形");
		}else {
			System.out.println("不能组成三角形");
		}
	}
	else {
		System.out.println("不能组成三角形2");
	}
}*/

