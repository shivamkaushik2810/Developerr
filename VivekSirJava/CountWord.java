
public class CountWord {
    public static void main(String[] args) {
        String text = "shivam kaushik rd college";
        // without using split
        int wordCount = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ' && i < text.length() - 1 && text.charAt(i + 1) != ' ') {
                wordCount++;
            }
        }
        // Adding one for the last word ccc
        wordCount++;
        System.out.println("Number of words: " + wordCount);
    }

}
