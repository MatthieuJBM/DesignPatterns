package sorters;

import sources.InputSource;

import java.util.Arrays;

public class TextSorter {
    private final InputSource input;

    public TextSorter(InputSource input) {
        this.input = input;
    }

    public void sortuj() {
        String text = input.getText();
        String[] words = text.split("\\s+");
        Arrays.sort(words, String.CASE_INSENSITIVE_ORDER);
        System.out.println("Posortowane słowa: ");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
