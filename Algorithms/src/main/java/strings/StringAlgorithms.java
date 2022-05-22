package strings;

public class StringAlgorithms {
    public final static int d = 256;


    public static void main(String[] args) {
        String pattern = "TEST";
        String text = "THIS IS A TEST";
        int prime = 11;

        karpSearch(pattern, text, prime);
    }


    public static void karpSearch(String pat, String txt, int q) {
        int patLength = pat.length();
        int txtLength = txt.length();
        int i, j;
        int p = 0; //hash value for pattern
        int t = 0; //hash value for txt
        int h = 1;

        // calculates the value of h
        for (i = 0; i < patLength - 1; i++) {
            h = (h * d) % q;
        }

        //Calculate the hash value of pattern and text
        for (i = 0; i < patLength; i++) {
            p = (d * p + pat.charAt(i)) % q;
            t = (d * t + txt.charAt(i)) % q;
        }

        for (i = 0; i <= txtLength - patLength; i++) {

            // Check if hash values of p and t are equal
            // If they match check characters one by one
            if (p == t) {
                // Check characters one by one
                for (j = 0; j < patLength; j++) {
                    if (txt.charAt(i + j) != pat.charAt(j))
                        break;
                }

                if (j == patLength)
                    System.out.println("Pattern found at index " + i);
            }


            if (i < txtLength - patLength) {
                t = (d * (t - txt.charAt(i) * h) + txt.charAt(i + patLength)) % q;

                if (t < 0)
                    t = (t + q);
            }
        }
    }
}
