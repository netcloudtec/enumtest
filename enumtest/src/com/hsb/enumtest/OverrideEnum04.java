package com.hsb.enumtest;

/**
 * 用法四：覆盖枚举的方法 下面给出一个toString()方法覆盖的例子。
 * 
 * @author Administrator
 *
 */
public class OverrideEnum04 {
	public enum ColorTest {
		RED("红色", 1), GREEN("绿色", 2), BLANK("白色", 3), YELLO("黄色", 4);
		// 成员变量
		private String name;
		private int index;

		// 构造方法
		private ColorTest(String name, int index) {
			this.name = name;
			this.index = index;
		}

		// 覆盖方法
		@Override
		public String toString() {
			return this.index + "_" + this.name;
		}
	}

}