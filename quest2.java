public class MinOfThree {
    
    public static void main(String args[])
    {
        int a = 15;
        int b=  13;
        int c = 12;



        if(a>b)
        {
            if(b>c)
            {
                //a>b>c
                System.out.println(c);
            }else{
                //a>b, c>=b so b smallest
                System.out.println(b);
            }

        }else{
            // a <= b
            if(b<c)
            {
                //a<=b<c
                System.out.println(a);
            }else{
                //b>=a,c
                if(a<c)
                {
                    System.out.println(a);
                }else{
                    System.out.println(c);
                }
            }
        }
    }
}
