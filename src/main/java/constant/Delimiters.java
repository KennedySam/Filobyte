package constant;

/**
 * Created by Sam on 25/10/2018.
 */
public enum Delimiters {

    NEWLINE("\n"),
    TAB("\t"),
    COMMA(",");

    private final String delimiter;

    private Delimiters(String delimiter) {
        this.delimiter = delimiter;
    }

}
