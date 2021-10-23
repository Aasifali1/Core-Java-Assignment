package com.knoldus.kup.Core_Java.ques12;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
    String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
    public void validate(String email) throws EmailNotValidException
    {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if (!matcher.matches()){
            throw new EmailNotValidException("Invalid email");
        }
    }

}
