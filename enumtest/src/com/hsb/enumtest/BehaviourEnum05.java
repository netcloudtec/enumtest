package com.hsb.enumtest;

import com.hsb.interfce.Behaviour;
/**
 * �÷��壺ʵ�ֽӿ�
 * ���е�ö�ٶ��̳���java.lang.Enum�ࡣ����Java ��֧�ֶ�̳У�����ö�ٶ������ټ̳������ࡣ
 * @author Administrator
 *
 */
public enum BehaviourEnum05 implements Behaviour {
      RED("��ɫ", 1), GREEN("��ɫ", 2), BLANK("��ɫ", 3), YELLO("��ɫ", 4);
      // ��Ա����
      private String name;
      private int index;

      // ���췽��
      private BehaviourEnum05(String name, int index) {
          this.name = name;
          this.index = index;
      }

      // �ӿڷ���

      @Override
      public String getInfo() {
          return this.name;
      }

      // �ӿڷ���
      @Override
      public void print() {
          System.out.println(this.index + ":" + this.name);
      }
  }