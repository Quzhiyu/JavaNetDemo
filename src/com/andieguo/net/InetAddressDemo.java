package com.andieguo.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
	/**
	 * InetAddress��û���ṩ���ع��캯�������Բ�����new()�������������Ķ��󣬶�ֻ���Ե��þ�̬����getLocalHost()��getByName()��getByAddress()��������InetAddress���ʵ�ʡ�
	 * @param args
	 */
	public static void main(String[] args) {
		 try {
			InetAddress address= InetAddress.getLocalHost();
			System.out.println("����IP��ַ�ַ���:"+address.getHostAddress());
			System.out.println("�����û���:"+address.getHostName());
			System.out.println("����������:"+address.toString());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
