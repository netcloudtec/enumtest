package com.hsb.test;

import org.junit.Test;

import com.hsb.enumtest.ColorEnum01;
import com.hsb.enumtest.ColorEnum03;
import com.hsb.enumtest.SignalEnum02;
import com.hsb.enumtest.OverrideEnum04.ColorTest;
import com.hsb.enumtest.BehaviourEnum05;
public class TestEnum {

	@Test
	/*�����÷�һ�� �÷�һ��ö����Ϊ����ʹ��*/
	public void testColorEnum01() {
		System.out.println(ColorEnum01.RED);//RED
	}
	
	@Test
	/*�����÷������÷�����ö����Ϊswitch������ʹ��*/
	public void testSignalEnum02(){
		new SignalEnum02().change();
	}
	@Test
	/*�����÷���:�÷���������ö��������·���*/
    public void testColorEnum03(){
		System.out.println(ColorEnum03.getName(1));
    }
	
	@Test
	/*�����÷���:�÷��ĸ���ö�ٵķ���*/
    public void OverrideEnum04(){
	System.out.println(ColorTest.RED.toString());	
    }
	
	@Test
	/*�����÷���:�÷���ʵ�ֽӿ�*/
    public void BehaviourEnum05(){
	BehaviourEnum05.RED.print();	
    }
}
