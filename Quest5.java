public class Quest5 {
    public static void main(String args[])
    {
        int n = 7;
        //int arr[] = new int[n];
        int arr_ans[][] = new int[n][4];

        System.out.println("n   n^2   n^3   n^4");
        for(int i = 0 ; i < n ; i ++)
        {
            // go through the array row by row 
            for (int j = 0 ; j< 4 ; j++)
            {
                // go through the row elemnt by element
                arr_ans[i][j] = (int)Math.pow(i+1,j+1); // row index (i) gives us the number in column 1 of the row , column index tells us which power to calculate
                System.out.print(arr_ans[i][j] + "  ");
            }
            System.out.println(" ");// shift to next line
        }
        
    }
}
