public class Anagram {

    public  String makeAnagram(String sentence) {
        String[] arrayStrings = sentence.split(" ");

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < arrayStrings.length; i++) {
            stringBuilder.append(reverseSymbols(arrayStrings[i]));
            stringBuilder.append(" ");
        }

        return stringBuilder.toString().trim();
    }

    private static String reverseSymbols(String symbols) {
        char[] arraySymbols = symbols.toCharArray();
        int indexNeedChange = 0;
        for (int i = 0; i < arraySymbols.length / 2; i++) {

            if (Character.isLetter(arraySymbols[i])) {
                char symbolFromEnd = arraySymbols[arraySymbols.length - 1 - i];
                if (Character.isLetter(symbolFromEnd)) {
                    changeSymbols(arraySymbols, i, arraySymbols.length - 1 - i);
                } else {
                    indexNeedChange = i;
                }
            } else {
                indexNeedChange = arraySymbols.length - 1 - i;
            }

        }

        if (arraySymbols.length % 2 != 0) {
            int indexMiddleSymbol = (int) Math.ceil(arraySymbols.length / 2);
            char middleSymbols = arraySymbols[indexMiddleSymbol];
            if (Character.isLetter(middleSymbols)) {
                changeSymbols(arraySymbols, indexNeedChange, indexMiddleSymbol);
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < arraySymbols.length; i++) {
            stringBuilder.append(arraySymbols[i]);
        }

        return stringBuilder.toString();
    }

    private static void changeSymbols(char[] arraySymbols, int firstIndex, int secondIndex) {
        char temp = arraySymbols[firstIndex];
        arraySymbols[firstIndex] = arraySymbols[secondIndex];
        arraySymbols[secondIndex] = temp;
    }
}
