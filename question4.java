public class question4 {
    public static void main(String args[])
    {
        double population = 80000;
        int year = 0;

        while ( population < 150000)
        {
            population = population * 1.05 ; // increase of 5% anaually
            year ++;
        }

        System.out.println(year);
    }
    
}
