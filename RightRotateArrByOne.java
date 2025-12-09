class RightRotateArrByOne
{
    public static void main(String args[])
    {
        int arr[]={5,6,3,4,1};

        int temp=arr[4];
        arr[4]=arr[3];
        arr[3]=arr[2];
        arr[2]=arr[1];
        arr[1]=arr[0];
        arr[0]=temp;
        

         for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

    }
}