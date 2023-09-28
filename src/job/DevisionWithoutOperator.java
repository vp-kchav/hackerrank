package job;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DevisionWithoutOperator {
	static int divide(int dividend, int divisor) {
          
        // Calculate sign of divisor i.e., 
        // sign will be negative only iff 
        // either one of them is negative 
        // otherwise it will be positive 
        int sign = ((dividend < 0) ^  
                   (divisor < 0)) ? -1 : 1; 
      
        // Update both divisor and 
        // dividend positive 
        dividend = Math.abs(dividend); 
        divisor = Math.abs(divisor); 
      
        // Initialize the quotient 
        int quotient = 0; 
          
        while (dividend >= divisor) 
        { 
            dividend -= divisor; 
            ++quotient; 
        } 
      
        return sign * quotient; 
    }     
      
    public static void main (String[] args)  
    { 
        int a = 10; 
        int b = 3; 
          
       // System.out.println(divide(a, b)); 
          
        a = 43; 
        b = -8; 
          
        //System.out.println(divide(a, b));
        subStringsKDist("abacdefghig", 4);
    } 
    
    public static List<String> subStringsKDist(String inputStr, int num)
	{
    	List<String> strings = new ArrayList<String>();
    	int last = num;
    	for(int i = 0; i<=inputStr.length() - last ; i++) {
    		String subString = inputStr.substring(i, num);
    		num +=1;
    		boolean add = true;
    		for(char chr : subString.toCharArray()) {
    			add = true;
    			long n = subString.chars().filter(ch -> ch==chr).count();
    			if(n >1) {
    				add = false;
    				break;
    			}
    		}
    		if(add == true && !strings.contains(subString)) strings.add(subString);
	    }
    	return strings;
    	
        // WRITE YOUR CODE HERE
    }

}
