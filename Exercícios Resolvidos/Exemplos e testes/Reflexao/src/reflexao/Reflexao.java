package reflexao;

/**
 *
 * @author daniel
 */

public class Reflexao {
    public static void main(String args[]) {  
                        
        int x = 1;
        char y = 'a'; 
        String z = "blahblahblah";  
          
        System.out.println(x + " é do tipo " + ((Object)x).getClass().getSimpleName());  
        System.out.println(y + " é do tipo " + ((Object)y).getClass().getSimpleName());  
        System.out.println(z + " é do tipo " + z.getClass().getSimpleName());
        
    }  
}  
