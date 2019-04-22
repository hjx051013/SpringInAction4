package com.hjx;

import org.springframework.context.support.
                   ClassPathXmlApplicationContext;

public class KnightMain {

  public static void main(String[] args) throws Exception {
//    test1();
    test2();
  }

  private static void test1() {
    ClassPathXmlApplicationContext context =
            new ClassPathXmlApplicationContext(
                    "META-INF/spring/knight.xml");
    Knight knight = context.getBean(Knight.class);
    knight.embarkOnQuest();
    context.close();
  }

  private static void test2() {
    ClassPathXmlApplicationContext context =
            new ClassPathXmlApplicationContext(
                    "META-INF/spring/minstrel.xml");
    Knight knight = context.getBean(Knight.class);
    knight.embarkOnQuest();
    context.close();
  }

}
