public class quest1 {
    public static void main(String args[]) {
        double score = 85;
        System.out.println("original Score " + score);
        score = score > 80 ? (score < 90 ? score + 5 : score) : score; // if score greater than 80 then check if less than 90 , if true then score = score + 5 else score = score
        System.out.println("new Score " + score);
    }
}