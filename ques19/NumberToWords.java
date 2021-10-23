package com.knoldus.kup.Core_Java.ques19;

import com.knoldus.kup.Core_Java.Printer;
//We have defined a class as Printer and a static method print() inside the class to print.

public class NumberToWords {

//    declaring an array of type string and loading with words
   static String[] numberWords ={
      "Zero","One","Two","Three","Four", "Five","Six","Seven","Eight","Nine","Ten",
            "Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen",
            "Nineteen"
    };

   static String[] tenPower={
           "Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"
   };
    public static String numTowords(int num)
    {
        StringBuffer sb =new StringBuffer();
        if(num == 0) {
            return numberWords[num];
        }
        if(num >=1000000000){
             int bill = num/1000000000;
             sb.append(convert(bill)+" Billion");
             num =num%1000000000;
        }
        if(num >= 1000000){
            int million = num/1000000;
            sb.append(convert(million)+" Million");
            num = num % 1000000;
        }
        if(num>= 1000){
            int thousand = num/1000;
            sb.append(convert(thousand)+" Thousand");
            num = num%1000;
        }
         if(num > 0){
            sb.append(convert(num));
        }
        return sb.toString();
    }
    static String convert(int num){
        StringBuffer sb =new StringBuffer();
        if(num>=100){
            int hundred = num/100;
            sb.append(" "+numberWords[hundred]+" Hundred");
            num = num%100;
        }
        if(num > 0){
            if(num<=20){
                sb.append(" "+numberWords[num]);
            }else {
                int ten = num/10;
                sb.append(" "+tenPower[ten-2]);
                num = num % 10;
                if(num>0){
                    sb.append(" "+numberWords[num]);
                }
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Printer.print(numTowords(123));
        Printer.print(numTowords(1234567891));
        Printer.print(numTowords(12));
        Printer.print(numTowords(1998));
    }
}
