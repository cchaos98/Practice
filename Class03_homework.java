package TheSecond;

import java.util.Scanner;
/**
 * ��ﳬ
 * @author ����
 *
 */
public class Class03_homework {
public static void main(String[] args) {
	NiXu();
	toUpcase();
	max();
}

public static void NiXu() {
	Scanner sc=new Scanner(System.in);
	System.out.println("������һ����λ����");
	int number=sc.nextInt();
	int a=number/1000;
	int b=number%1000/100;
	int c=number%1000%100/10;
	int d=number%1000%100%10;
	System.out.println("����Ϊ��"+d+c+b+a);
}
public static void toUpcase() {
	String h="Hello World";
	String s=h.toUpperCase();
	System.out.println(s);
}
public static void max() {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	
	int result=a>b?(a>c?a:c):(b>c?b:c);
	System.out.println(result);
	
}
}
