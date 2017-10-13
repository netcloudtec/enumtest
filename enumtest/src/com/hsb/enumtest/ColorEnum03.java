package com.hsb.enumtest;
/**
 * �÷�������ö��������·���
 * ��������Զ����Լ��ķ�������ô������enumʵ�����е�������һ���ֺš����� Java Ҫ������ȶ��� enum ʵ����
 * @author Administrator
 *
 */
public enum ColorEnum03 {
	RED("��ɫ", 1), GREEN("��ɫ", 2), BLANK("��ɫ", 3), YELLO("��ɫ", 4);
    // ��Ա����
    private String name;
    private int index;

    // ���췽��
    private ColorEnum03(String name, int index) {
        this.name = name;
        this.index = index;
    }

    // ��ͨ����
    public static String getName(int index) {
        for (ColorEnum03 c : ColorEnum03.values()) {
            if (c.getIndex() == index) {
                return c.name;
            }
        }
        return null;
    }

    // get set ����
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
