public class Exercise1 {
    
    public int sum(int n) { 
        if (n == 0) { //Base Case//
            return 0;          
        }         
        else {    //Rescursive Case//
            return n + sum(n - 1);   
        }   
    }
}

// The code defines the recursive method “mystery”. The method takes 2 integers “a” and “b” and returns an integer value. //
// Let's say we were given the numbers (5,1) for (a, b). The output for the code would be 5, because it follows the Base Case. //
// However, if we were given the number (5,4), the output for the code would be 20, because it follows the Recursive Case. //
// The way the Recursive Case works is it takes the “a” value and adds it to itself, while also subtracting 1 from the “b” value. //
// The formula would look like this:  (a + a), (b -1). //
// The Recursive Case will repeat itself until it follows the Base Case. Continuing to add the “a” value to itself. //
