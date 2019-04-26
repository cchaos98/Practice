package TheSecond;

import java.util.Scanner;

//变量：可以变化的量，eg：温度
//常量：恒定不变的量，eg：圆周率
//标识符：用来标识变量的名字，要做到见名知意,由字母、下划线、$和数字组成，且第一个不能是数字。
//驼峰命名法：首个单词小写，后面每个单词首字母大写，学生姓名：studentName
//数据类型：简单数据类型和复合数据类型。简单数据类型：1，整数类型：byte(一个字节，8bit：-128~127)
//					short(),int,long。
//				   2，浮点类型：float,double。3，字符型：char。4，布尔类型：
public class Class02__Type {
public static void main(String[] args) {
//	int a=250%14;
//	System.out.println(a);
	int i=5;
	System.out.println(5%2);
	
//	++i;//(先++，再使用)
//	i++;//(先使用，再++)
//	int a=5;
//	int d=a++ + ++a +a--;//a++是一个单独的语句，使用完就自增；
//	System.out.println(a);
//	System.out.println(d);
//	System.out.println(i++);
	
//	Scanner sc=new Scanner(System.in);
//	String s=sc.next();
//	toDowncase(s);
	
	
//	double a=9.99999;
//	System.out.println((int)a);
//	System.out.println((char)66);
//	char B=sc.next().charAt(0);
//	System.out.println(change(B));
}
//public static char change(char a) {
//	if((int)a<97||(int)a>122) {
//		System.out.println("请输入一个小写字母");
//		Scanner sc=new Scanner(System.in);
//		char B=sc.next().charAt(0);
//		return change(B);
//	}else
//	return (char)((int)a-32);
//}
//}


//public static void toDowncase(String b) {
//
//	for(int i=0;i<b.length();i++) {
//		char x=b.charAt(i);
//		if(x>='a'&&x<='z') {
//			x=(char) (x+32);
//			System.out.print(x);
//		}else {
//		System.out.print(x);}
//	}
//}
}
