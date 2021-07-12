public class integerAnagramLogic 
{  
    
    public static void main(String args[])
    {  
    	   	
       int numbers[]= {74,47,85,58,98,52,32};
       
    
       System.out.println(isAnagram(5,5));
       System.out.println(isAnagram(74,147));
       System.out.println(isAnagram(74,48));
       System.out.println(isAnagram(74,47));
       
           
    }  
    
    public static boolean isAnagram(int a,int b)
    {
    	int ascii_first=0;
    	int ascii_second=0;
    	
    	
    	
    	for(int first=a,second=b ;first!=0||second!=0;first=first/10,second=second/10)
    	{
    		ascii_first=ascii_first+(char)first%10;
    		ascii_second=ascii_second+(char)second%10;
    		
    	}
    	if(ascii_first==ascii_second)
    		return true;
    	
    	return false;
    }
} 