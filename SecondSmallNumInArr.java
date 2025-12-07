class SecondSmallNumInArr
{
   

    public static void main(String args[])
    {
        int arr[]={12,34,55,66,77,8,};

        int Min=arr[0];
        int secMin=arr[0];

        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<Min)
            {
                secMin=Min;
                Min=arr[i];
            }
            else if(arr[i] < secMin && arr[i] > Min)
            {
                secMin=arr[i];   
            }
        }

        System.out.println("Second Small Number is "+secMin);
    }
}

