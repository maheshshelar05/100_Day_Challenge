class CommonBetArrays
{
    public static void main(String args[])
    {
        int arr1[]={1,2,3,4,5,0};
        int arr2[]={0,9,8,7,6,1,3,4};

        int arr3[]=new int[10];
        int index=0;
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr2.length;j++)
            {
                if(arr1[i]==arr2[j])
                {
                    arr3[index]=arr1[i];
                    index++;
                }
            }
        }

         for(int k=0;k<index;k++)
        {
            System.out.println(arr3[k]);
        }
    }
}