package Output1;

public class Output {
    final static short i = 2;
    public static int j = 0;

    public static void main(String[] args) {
        for (int k = 0; k < 3; k++) {
            switch (k) {
                case i:
                    System.out.println(" 0 ");
                case i - 1:
                    System.out.println(" 1 ");
                case i - 2:
                    System.out.println(" 2 ");
            }
        }
    }
}
