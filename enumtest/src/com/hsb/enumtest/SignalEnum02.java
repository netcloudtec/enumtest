package com.hsb.enumtest;

/**
 * �÷�����switch JDK1.6֮ǰ��switch���ֻ֧��int,char,enum���ͣ�ʹ��ö�٣��������ǵĴ���ɶ��Ը�ǿ��
 * 
 * @author Administrator
 *
 */
enum Signal {

	GREEN, YELLOW, RED
}

public class SignalEnum02 {
	Signal color = Signal.RED;

	public void change() {
		switch (color) {
		case RED:
			color = Signal.GREEN;
			break;
		case YELLOW:
			color = Signal.RED;
			break;
		case GREEN:
			color = Signal.YELLOW;
			break;
		}
		System.out.println(color);
	}

}
