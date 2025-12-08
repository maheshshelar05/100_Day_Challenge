class MissingNumber
{
    public static void main(String args[])
    {
        int arr[] = {1, 2, 4, 5};
        int n = 5;

        int sum1 = 0;
        int sum2 = 0;

        for(int i=1; i<=n; i++)
        {
            sum1 = sum1 + i;
        }

        for(int i=0; i<arr.length; i++)
        {
            sum2 = sum2 + arr[i];
        }

        int missing = sum1 - sum2;

        System.out.println("Missing Number: " + missing);
    }
}
