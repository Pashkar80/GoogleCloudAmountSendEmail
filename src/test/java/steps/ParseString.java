package steps;

/**
 * Created by user on 24.11.2019.
 */
public class ParseString {

    public static String getPartString(String startLine) {
        String partLine = "";
        String[] parts = startLine.split(":", 2);
        for (int i = 0; i < parts.length; i++) {
            partLine = parts[parts.length - 1].trim();
        }
        return partLine;
    }


    public static  String parseLineForLastsWords(String startLine) {
        String partLine = "";
        String[] parts = startLine.split("\\s*(\\s|,|!|\\.)\\s*");
        for (int i = 0; i < parts.length; i++) {
            partLine = parts[parts.length - 2] + " " + parts[parts.length - 1];
        }
        return  partLine;
    }

    public static  String parseLineForWordsOnMiddle(String startLine) {
        String partLine = "";
        String[] parts = startLine.split(":", 2);
        for (int i = 0; i < parts.length; i++) {
            partLine = parts[parts.length - 1].trim();
        }
        String[] partsLine = partLine.split(" ", 3);
        for (int i = 0; i < partsLine.length; i++) {
            partLine = partsLine[partsLine.length - 3] + " " + partsLine[partsLine.length - 2].trim();

        }
        return partLine;
    }

}
