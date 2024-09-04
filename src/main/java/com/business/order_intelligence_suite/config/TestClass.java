package com.business.order_intelligence_suite.config;

import java.io.IOException;

class Mayank
{
  public Object getMethod(String m) throws RuntimeException
  {
    return "hi";
  }

}
class Nagpal extends Mayank
{
  @Override
  public String getMethod(String s)
  {
    return null;
  }
}
public class TestClass {
  public static void main(String[] args) throws Exception {
    Mayank m = new Nagpal();
    System.out.println(m.getMethod(null));
  }

}
