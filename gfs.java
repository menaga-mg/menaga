class GFG 
{ 
    static float sumOfAP(float a, float d, int n) 
    { 
        float sum = (n / 2) * (2 * a + (n - 1) * d); 
        return sum; 
    } 
  
    // Driver code 
    public static void main (String[] args)  
    { 
        int n = 20; 
        float a = 2.5f, d = 1.5f; 
        System.out.print(sumOfAP(a, d, n)); 
    } 
} 
