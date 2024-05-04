package Anudip;

public class Parenthes {

    public static int findClosingParenthesis(String sentence, int openingPosition) {
        int nestedLevel = 0;

        for (int i = openingPosition + 1; i < sentence.length(); i++) {
            char currentChar = sentence.charAt(i);

            if (currentChar == '(') {
                nestedLevel++;
            } else if (currentChar == ')') {
                if (nestedLevel == 0) {
                    return i; // Found the corresponding closing parenthesis
                } else {
                    nestedLevel--;
                }
            }
        }

        // If no corresponding closing parenthesis is found
        return -1;
    }

    public static void main(String[] args) {
        String inputSentence = "Sometimes (when I nest my parenthesis (also called parentheticals) too many times (like this (and this))) they get quite confusing.";
        int openingPosition = 10;

        int closingPosition = findClosingParenthesis(inputSentence, openingPosition);

        if (closingPosition != -1) {
            System.out.println("The position of the closing parenthesis is: " + closingPosition);
        } else {
            System.out.println("No corresponding closing parenthesis found.");
        }
    }
}

