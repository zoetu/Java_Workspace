package chapter05;

import java.util.Scanner;

import java.nio.charset.Charset;

public class Code {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in,"GBK");
        System.out.println("请输入中文：");
        String str = sc.next();
        System.out.println("输出为 "+str);
        System.out.println("jvm默认字符集为"+Charset.defaultCharset());

        String x = getEncoding(str);
        System.out.println("当前输入的编码为"+x);

    }
    public static String getEncoding(String str) {
		String[] sEncodeArr = {"GBK", "GB2312", "ISO-8859-1", "UTF-8"};
		for (int i = 0; i < sEncodeArr.length; i++) {
			try {
				if(str.equals(new String(str.getBytes(sEncodeArr[i]),sEncodeArr[i]))){
					return sEncodeArr[i];
				}
			} catch (Exception e) {}
		}
		return "";
	}
}

