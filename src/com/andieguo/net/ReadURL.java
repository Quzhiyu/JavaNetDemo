package com.andieguo.net;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class ReadURL {
	/**
	 * �����ַ���������������Internet��һ������URL���openStream()����������ʹ��openConnection()��������һ��URLConnection��Ķ���
�������У�����openStream()��ָ����URL�������Ӳ�����InputStream��Ķ����Դ���һ�����ж�ȡ���ݡ�
	 * @param args
	 */
	public static void main(String[] args){
//		readHTML();
		readHTMLByBuffer();
		
	}

	private static void readHTML2() {
		try{
			URL url = new URL("http://www.baidu.com");
			InputStream in = url.openStream();
			byte[] b = new byte[1024];
			int len = 0;
			while((len = in.read(b)) != -1){
				System.out.println(new String(b,0,len,"UTF-8"));
			}
			if(in != null) in.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	private static void readHTML() {
		try {
			URL url = new URL("http://www.baidu.com");
			URLConnection conn = url.openConnection();
			InputStream in = conn.getInputStream();
			byte[] b = new byte[1024];
			int len = 0;
			while((len = in.read(b))!=-1){
				System.out.println(new String(b,0,len,"UTF-8"));
			}
			if(in != null) in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void readHTMLByBuffer() {
		try {
			URL url = new URL("http://www.baidu.com");
			URLConnection conn = url.openConnection();
			InputStream in = conn.getInputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(in,"UTF-8"));
			String str = "";
			while( (str = reader.readLine()) != null){
				System.out.println(str);
			}
			if(in != null) in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
