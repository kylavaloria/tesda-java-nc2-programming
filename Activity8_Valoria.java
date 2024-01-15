public class Activity8_Valoria {
    public static void main(String[] args) {
        String str = "Philippines";
        int last;
        int count = 0;
        
        System.out.println("Given String: PHILIPPINES");

        System.out.println("First character: " + str.charAt(0));

        for (last = 0; last < str.length(); last++) {
            
        }
        System.out.println("Last character: " + str.charAt(last - 1));

        for (char element : str.toCharArray()) {
            if (element == 'a' || element == 'e' || element == 'i' || element == 'o' || element == 'u') {
                count++;
            }
        }

        System.out.println("No. of vowels: " + count);
    }
}
