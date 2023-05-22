

public class ArraysCC {
    public static void printSubarrays(int numbers[]){
        int sum = 0;
        int min = Integer.MIN_VALUE;
        
        
        for(int i=0; i<numbers.length; i++){
           int start = i;

            for(int j= i; j<numbers.length;j++){
                int end = j;
      
                sum = 0; 
                for(int k = start; k <= end;k++  ){
                        
                    sum = sum + numbers[k];                   
                }
              
                if(min <  sum){
                    min = sum;

                }
               
                
                System.out.println(sum);
            }  
            
            

        }    
        System.out.print("minimum " +min);
f
       
    }
            
      
     
    
    public static void main(String args[]){
        int numbers[] = {2 , 4, 6, 8, 10};
        printSubarrays(numbers);
    }
        
   
}











