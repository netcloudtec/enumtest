package com.hsb.test;

import org.junit.Test;

import com.hsb.enumtest.ColorEnum01;
import com.hsb.enumtest.ColorEnum03;
import com.hsb.enumtest.SignalEnum02;
import com.hsb.enumtest.OverrideEnum04.ColorTest;
import com.hsb.enumtest.BehaviourEnum05;
public class TestEnum {

	@Test
	/*测试用法一： 用法一的枚举作为常量使用*/
	public void testColorEnum01() {
		System.out.println(ColorEnum01.RED);//RED
	}
	
	@Test
	/*测试用法二：用法二的枚举作为switch的条件使用*/
	public void testSignalEnum02(){
		new SignalEnum02().change();
	}
	@Test
	/*测试用法三:用法三可以向枚举中添加新方法*/
    public void testColorEnum03(){
		System.out.println(ColorEnum03.getName(1));
    }
	
	@Test
	/*测试用法四:用法四覆盖枚举的方法*/
    public void OverrideEnum04(){
	System.out.println(ColorTest.RED.toString());	
    }
	
	@Test
	/*测试用法五:用法四实现接口*/
    public void BehaviourEnum05(){
	BehaviourEnum05.RED.print();	
    }
}
