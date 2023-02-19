package Lesson_2;
import java.io.*;
import java.util.ArrayList;

public class program2 {

    public static void main (String args[]) throws Exception {
        BufferedReader br = new BufferedReader (new FileReader("f:\\input.txt"));
        ArrayList<Integer> nums = new ArrayList<Integer>();
        String str;
        String substr;
        while ((str = br.readLine()) !=null) {
                substr = str.substring(2);
                int i = Integer.parseInt(substr);
                nums.add(i);
                       
        }
        br.close(); 
        int b = nums.get(0);
        int a = nums.get(1);
        String result;
        if (a == 0 && b == 0){
            result = "не определено";
        }    
        else 
        {
            double c = pow (a, b);
            if (c % 1 == 0) {
                int d = (int)c;
                System.out.println("Число " + a + " в степени " + b + " равно " + d);
                result = Integer.toString(d);

             }
             else 
             {
                System.out.println("Число " + a + " в степени " + b + " равно " + c);
                result = Double.toString (c);   
             }
             
            
            
        }     
            
        writeToFile("f:\\output.txt", result);  
    }

    // Метод записи строки в файл 
    static void writeToFile(String path, String str) {
        try(FileWriter fw = new FileWriter (path, false)) {
            fw.write (str); 
        } catch (IOException ex) {
            System.out.println(ex.getMessage());  
        }
    }
    
    // Метод возведения числа в степень
    static double pow (int num, int degr){
        double result = 1;
        if (num != 0 && degr >= 1) {
            for (int i = 1; i <= degr; i++) {
               result = result * num;
            }
        }  
        else if (num != 0 && degr < 0) {
            for (int i = 1; i <= -degr; i++) {
                result = result * num;
            }
            result = 1 / result; 
        }
        else if (num == 0 && degr != 0) {
            result = 0;    
        }
        else 
        {
            result = 1;
        }
        return result; 
    }


 
} 
        
       








    

