package com.hsb.enumtest;

/**
 * �÷��ģ�����ö�ٵķ��� �������һ��toString()�������ǵ����ӡ�
 * 
 * @author Administrator
 *
 */
public class OverrideEnum04 {
	public enum ColorTest {
		RED("��ɫ", 1), GREEN("��ɫ", 2), BLANK("��ɫ", 3), YELLO("��ɫ", 4);
		// ��Ա����
		private String name;
		private int index;

		// ���췽��
		private ColorTest(String name, int index) {
			this.name = name;
			this.index = index;
		}

		// ���Ƿ���
		@Override
		public String toString() {
			return this.index + "_" + this.name;
		}
	}

}