package TheSecond;

import java.util.Scanner;

/**
 * 
 * @author ����
 *
 */
public class Class03_luojiyunsuan {
	/*
	 * ! ȡ��
	 * && ��һ��Ϊ��
	 * || ��һ��Ϊ��
	 */
public static void main(String[] args) {
	System.out.println("�����빫������");
	Scanner sc=new Scanner(System.in);
	double km=sc.nextDouble()-3;		
	double price=        km   <=      7      ?    ( km>=0?  km*1.5+5:5 )      :     ((km-7)*2+15.5)  ;
	System.out.println("�۸�Ϊ��"+price+"Ԫ");
}
}






	/*
		 * System.out.println("�����룺0 (��ͬ��)    1 (ͬ��)"); Scanner sc=new
		 * Scanner(System.in); int a=sc.nextInt(); int b=sc.nextInt(); int
		 * c=sc.nextInt(); String d=((a+b+c)>=2)?"ͨ��":"��ͨ��";//��Ŀ�����
		 * System.out.println("�Ƿ�ͨ����"+d);
		 */
/*
		 * System.out.println("��������ݣ�"); Scanner sc=new Scanner(System.in); int
		 * y=sc.nextInt(); boolean leap=(y%400==0)||(y%4==0&&y%100!=0);
		 * System.out.println("�Ƿ�Ϊ���ꣿ"+leap);
		 */
/*
		 * System.out.println("��������������"); Scanner sc=new Scanner(System.in); double
		 * a=sc.nextDouble(); double b=sc.nextDouble(); double c=sc.nextDouble();
		 * boolean s=a+b>c&&a+c>b&&b+c>a&&a>0&&b>0&&c>0;
		 * System.out.println("�Ƿ������������Σ�"+s);
		 */
/*	if(a>0&&b>0&&c>0) {
		if(a+b>c&&a+c>b&&b+c>a) {
			System.out.println("����ת��Ϊ������");
		}else {
			System.out.println("�������������");
		}
	}
	else {
		System.out.println("�������������2");
	}
}*/

