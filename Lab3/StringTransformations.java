package com.company;
public class StringTransformations {

    String input;
    char[] input_as_array;
    int nrOfSentences= 0;
    int nrOfVowels = 0;
    int nrOfConsonants = 0;
    int nrOfLetters = 0;


    public StringTransformations(String input) {
        this.input = input;
        this.input_as_array = this.input.toCharArray();
    }

    public int getNumberOfWords()
    {
        return input.split(" ").length;
    }

    public int getNumberOfSenteces() {
        for (int i = 0; i < this.input_as_array.length; i++) {

            if (input.charAt(i) == '.' || input.charAt(i) =='?' || input.charAt(i) =='!') {
                nrOfSentences++;
            }

        }
        return nrOfSentences;
    }

    public int getNumberOfVowels() {
        for (int i = 0; i < this.input_as_array.length; i++) {
            if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u'
                    || input.charAt(i) == 'A' || input.charAt(i) == 'E' || input.charAt(i) == 'I'
                    || input.charAt(i) == 'O' || input.charAt(i) == 'U' ) {
                nrOfVowels++;
            }
        }
        return nrOfVowels;
    }

    public int getNumberOfConsonants() {
        for (int i = 0; i < this.input_as_array.length; i++) {
                  if ( input.charAt(i) == 'B' || input.charAt(i) == 'b' || input.charAt(i) == 'C' || input.charAt(i) == 'c'
                    || input.charAt(i) == 'D' || input.charAt(i) == 'd' || input.charAt(i) == 'F'
                    || input.charAt(i) == 'f' || input.charAt(i) == 'G' || input.charAt(i) == 'g'
                    || input.charAt(i) == 'H' || input.charAt(i) == 'h' || input.charAt(i) == 'J'|| input.charAt(i) == 'j'
                    || input.charAt(i) == 'K' || input.charAt(i) == 'k' || input.charAt(i) == 'L'|| input.charAt(i) == 'l'
                    || input.charAt(i) == 'M' || input.charAt(i) == 'm' || input.charAt(i) == 'N'|| input.charAt(i) == 'n'
                    || input.charAt(i) == 'P' || input.charAt(i) == 'p' || input.charAt(i) == 'Q'|| input.charAt(i) == 'q'
                    || input.charAt(i) == 'R' || input.charAt(i) == 'r' || input.charAt(i) == 'S'|| input.charAt(i) == 's'
                    || input.charAt(i) == 'T' || input.charAt(i) == 't' || input.charAt(i) == 'V'|| input.charAt(i) == 'v'
                    || input.charAt(i) == 'X' || input.charAt(i) == 'x' || input.charAt(i) == 'Z'|| input.charAt(i) == 'z'
                    || input.charAt(i) == 'W' || input.charAt(i) == 'w') {
                      nrOfConsonants++;
            }
        }
        return nrOfConsonants;
    }

    public int getNumberOfLetters(){
        for (int i = 0; i < input.length(); i++) {
            if (Character.isLetter(input.charAt(i)))
                nrOfLetters++;
        }
        return nrOfLetters;
    }
    public String getLongestWord() {

        String[] word = input.split(" ");
        String longword = " ";

            for(int i=0;i<word.length;i++){
                if(word[i].length()>=longword.length()){
                    longword=word[i];
                }
            }

        return longword;
    }
}
