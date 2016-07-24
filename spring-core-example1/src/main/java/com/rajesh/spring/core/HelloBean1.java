package com.rajesh.spring.core;

public class HelloBean1 {
   private String message;

   public void setMessage(String message){
      this.message  = message;
   }

   public void sayHello(){
      System.out.println("Your Message : " + message);
   }
}