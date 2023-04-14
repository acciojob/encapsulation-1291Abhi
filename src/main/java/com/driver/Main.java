package com.driver;

public class Main {
  public static void main(String args[]){
      RWOnly rw=new RWOnly();

     // rw.name="Abhi";
     // System.out.println(rw.name);
      //getting error while printing and setting name here
      //7:9
      //java: name has private access in com.driver.RWOnly
      rw.setName("Abhi");
      String name=rw.getName();

  }
}