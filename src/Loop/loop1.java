package Loop;

public class loop1 {
    public static void main(String[] args) {
        int i = 1, j = 5;
        for (; i < 5 && j > 0; i++, j++) {
            System.out.println(i + " " + j + ", ");
        }
    }
}
