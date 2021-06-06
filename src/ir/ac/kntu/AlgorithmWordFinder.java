package ir.ac.kntu;

import java.util.HashMap;

public class AlgorithmWordFinder {

    private final HashMap<String, String> mapFromFile;
    private String result;

    public AlgorithmWordFinder(String inputString, HashMap<String, String> mapFromFile) {
        result = new String("");
        this.mapFromFile = mapFromFile;
        wordBreakUtil(inputString, 0, inputString.length());

    }

    void wordBreakUtil(String inputString, int first, int last) {
        if (first != last) {

            if (mapFromFile.containsValue(inputString.substring(first, last))) {
                result += (inputString.substring(first, last));
                result += (" ");
                first = last;
                last = inputString.length();
            } else {
                last--;
            }
            wordBreakUtil(inputString, first, last);
        } else {
            return;
        }
    }

    public String getResult() {
        return result;
    }
}
