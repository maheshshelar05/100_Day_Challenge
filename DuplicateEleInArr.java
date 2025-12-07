class DuplicateEleInArr
{
    public static void main(String args[])
    {
         int arr[]={12,34,55,66,77,8,8,12,34,6,8};

         for(int i=0;i<arr.length;i++)
         {


            
             boolean isCount = false;

            for(int k = 0; k < i; k++)
            {
                if(arr[i] == arr[k])
                {
                    isCount = true;  
                }
            }

            if(isCount==false)
            {
                int count=1;
                for(int j=i+1;j<arr.length;j++)
                {
                    if(arr[i]==arr[j])
                    {
                    count++; 
                    }

                }

                if(count>1)
                {
                    System.out.println(arr[i]+ " is Duplicate appear "+count+" times");
                }
            }

         }
    }
}
