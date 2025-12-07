class SecondLargeNumInArr
{
    public static void main(String args[])
    {
        int arr[]={12,34,55,66,77,8,};

        int large=arr[0];
        int secLarge=arr[0];

        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>large)
            {
                secLarge=large;
                large=arr[i];
            }
        
            else if(arr[i] > secLarge && arr[i] < large)
            {
                secLarge=arr[i];   
            }
        }

        System.out.println("Second Largest Number is "+secLarge);
    }
}
