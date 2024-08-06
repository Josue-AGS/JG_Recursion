public class Exercise2 {
    
    public int sum(int n) { 
        if (n == 0) {            
        return 0;          
         }         
       else {    
        return n + sum(n);   
       }   
    }
    
}

// The problem with the Recursive method is that it won’t ever stop repeating itself if the “n” value is greater than 0. //
// To fix this, you could change the Recursive method’s formula. Changing it to n + sum(n-1). //