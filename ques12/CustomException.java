package com.knoldus.kup.Core_Java.ques12;

public class CustomException{
    public static void main(String[] args)  {
        EmailValidator customException=new EmailValidator();
        try {
//            check email by using validate() method
            customException.validate("aasif#gmail.com");
        }catch (EmailNotValidException e)
        {
            System.err.print(e);
        }
    }
}
