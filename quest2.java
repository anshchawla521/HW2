public class MinOfThree {

    public static void main(String args[]) {
        int a = 15;
        int b = 13;
        int c = 12;

        if (args.length == 3) { // 3 arguments passed
            try {
                int e = Integer.parseInt(args[0]);
                int f = Integer.parseInt(args[1]);
                int g = Integer.parseInt(args[2]);

                a = e; // after conversion of string to int set the values of a,b,c
                b = f;
                c = g;
            } catch (Exception ex) {
                // if any exception occurs during conversion catch it and use the predefined
                // values of a and b
                System.out.println("the supplied arguments raised an error \nusing inbuilt numbers");

            }
        }

        if (a > b) {
            if (b > c) {
                // a>b>c
                System.out.println(c);
            } else {
                // a>b, c>=b so b smallest
                System.out.println(b);
            }

        } else {
            // a <= b
            if (b < c) {
                // a<=b<c
                System.out.println(a);
            } else {
                // b>=a,c
                if (a < c) {
                    System.out.println(a);
                } else {
                    System.out.println(c);
                }
            }
        }
    }
}
