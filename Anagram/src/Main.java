public class Main {
    public static void main(String[] args) {
        String sentence1 = "a1bcd efg!h";
        String sentence2 = "abcd efgh";

        Anagram anagram1 = new Anagram();
        Anagram anagram2 = new Anagram();

        String result1 = anagram1.makeAnagram(sentence1);
        String result2 = anagram2.makeAnagram(sentence2);

        System.out.println(result1);
        System.out.println(result2);

    }
}
