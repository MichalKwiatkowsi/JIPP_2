public class Chain {

    public static void main(String[] args) {

        int maxLength = 0;
        int maxNumber = 0;

        for (int i = 1; i < 1000000; i++) {
            int length = getSequenceLength(i);
            if (length > maxLength) {
                maxLength = length;
                maxNumber = i;
            }
        }
        System.out.println("Starting number under one million that produces the longest chain: " + maxNumber);
        System.out.println("Length of the chain: " + maxLength);
    }

        public static int getSequenceLength(long n) {
            int length = 1;
            while (n > 1) {
                if (n % 2 == 0) {
                n /= 2;
            }
                else {
                n = 3 * n + 1;
            }
                length++;
        }
            return length;
    }

}
