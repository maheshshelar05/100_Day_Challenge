
class CountPosNegNumbers
{
     public static void main(String args[])
    {
       
  
        int arr[]={20,30,5,7,8,9,-10,1,-3,4,-5,-10,0,0};

        int posCount=0;
        int negCount=0;
        int zeroCount=0;
        int i=0;
        while(i<arr.length)
        {

            if(arr[i]>0)
            
                posCount++;
           
            else if(arr[i]<0)
            
                negCount++;
            
            else
                  zeroCount++;
           
            i++;
        }
       System.out.println("Number of Positive Number in Array :"+posCount);
       System.out.println("Number of Negative Number in Array :"+negCount);
       System.out.println("Number of Zero in Array :"+zeroCount);
    }

}
