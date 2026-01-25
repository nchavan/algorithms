package org.nc.algo.data.interview.prep.regex;

//* String s = "Hello!How@are#you"; String[] arr = s.split("[^a-zA-Z]+");
//  * [a-z]   // any lowercase letter
//  * [A-Z]   // any uppercase letter
//  * [a-zA-Z] → matches letters only
//  * [^a-zA-Z] -> When ^ is the first character inside brackets, it negates the class.
//  * [^a-zA-Z]+ -> + → one or more

public enum RegularExpression {
    EMPTY_SPACES("\\s"),
    LOWER_OR_UPPER_CASE("[^a-zA-Z]+"),
    REMOVE_LOWER_OR_UPPER_CASE_LETTERS("[a-zA-Z]+"), // remove the ^ and it will behave exactly opposite
    LOWER_CASE_CHARACTERS("[^a-z]+"),
    UPPER_CASE_CHARACTERS("[^A-Z]+"),
    NUMBERS("[^0-9]+"),
    NUMBERS_AND_SPACES("\\s[^0-9]+"),
    WORDS_LETTERS_AND_NUMBERS("[^a-zA-Z0-9]+"),
    REMOVE_LOWER_OR_UPPER_CASE_LETTERS_AND_NUMBERS("[a-zA-Z0-9]+"), // remove the ^ and it will behave exactly opposite
    ANY("[^a-zA-Z0-9]*"),
    WORDS("\\W+"),
    DIGITS_ONLY("\\D+");

    private String value;

    RegularExpression(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
