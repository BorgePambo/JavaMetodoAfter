package javaappdateafter01;

import java.util.Date;


public class JavaAppDateAfter01 {

    
    public static void main(String[] args) {
        
      Date data1 = new Date(2020, 10, 5);
      
      Date data2 = new Date(2020, 10, 10);
      
      System.out.println("Data data1 é após data2: " + data1.after(data2));
        
    }
    
}
