public class StringLoops
{
    // default constructor; no instance variables
    public StringLoops() { }

    /* Returns the number of times "character" appears in "searchString"
       This should be case sensitive!

       Examples:
       - if character = "a" and searchString = "Apples and bananas",
         this method returns 4
       - if character = "A" and searchString = "Apples and bananas",
         this method returns 1
       - if character = "!" and searchString = "Hello! Nice day!",
         this method returns 2
      */
    public int countCharacters(String character, String searchString)
    {
        int count = 0;
        for (int i = 0; i < searchString.length(); i ++) {
            String letter = searchString.charAt(i) + "";
            if (letter.equals(character)) {
                count ++;
            }
        }
        return count;
    }

    /* Returns the original string reversed

     Examples:
     - if origString = "hello!" this method returns "!olleh"
     - if origString = "Apples and bananas" this method returns "sananab dna selppA"
    */
    public String reverseString(String origString)
    {
        String reversed = "";
        for (int i = 0; i < origString.length(); i ++) {
            String character = origString.charAt(i) + "";
            reversed = character + reversed;
        }
        return reversed;
    }


    /* Returns the original string reversed -- SECOND IMPLEMENTATION

   Examples:
   - if origString = "hello!" this method returns "!olleh"
   - if origString = "Apples and bananas" this method returns "sananab dna selppA"
  */
    public String reverseString2(String origString)
    {
   /*
    look how you implemented reverseString above from the last Exploration; if you counted DOWN in your for loop,
   i.e. you started at i = origString.length() - 1 and decremented by i--, then in this implementation, figure out a way to reverse the string by starting at i = 0 and counting UP by 1 (i++).
   If you counted UP in your original reverseString implementation, then in reverseString2, figure out a way to count DOWN.  The output of both reverseString and reverseString2 should be identical!
   */
        String reversed = "";
        for (int i = origString.length() - 1; i > 0; i --) {
            String character = origString.charAt(i) + "";
            reversed = reversed + character;
        }
        return reversed;
    }

    /* Returns the number of vowels ("a", "e", "i", "o", "u") that appear in "origString";
    matches should NOT be case sensitive.

    (Note: you could do this by simply calling your countCharacters method 5 times in a
    row, one for each vowel, but that would lead to traversing the entire origString 5
    times -- it’s more efficient to only traverse the string once, so don’t use your
    countCharacters method for this!)

     Examples:
     - if origString = "Apples and bananas", this method returns 6: Apples and bananas
     - if origString = "Hello Joe", this method returns 4: Hello Joe
     - if origString = "Hmm.. pssh!", this method returns 0
     - if origString = "I", this method returns 1
     - if origString = "Supercalifragilisticexpialidocious", this method returns 16
    */
    public int countVowels(String origString)
    {
        int count = countCharacters("A", origString) + countCharacters("E", origString) + countCharacters("I", origString) + countCharacters("O", origString) + countCharacters("U", origString) +
                countCharacters("a", origString) + countCharacters("e", origString) + countCharacters("i", origString) + countCharacters("o", origString) + countCharacters("u", origString);
        return count;
    }

    /* Returns the number of times "searchString" appears in "origString";
     matches should NOT be case sensitive.

     Examples:
     - if searchString = "an" and origString = "Apples and bananas",
       this method returns 3: Apples and bananas
     - if searchString = "tat" and origString = "Ratatattat",
       this method returns 3: Ratatattat (note that two overlap)
     - if searchString = "lower" and origString = "sunflower",
       this method returns 1: sunflower
     - if searchString = "haha" and origString = "Hahahahaha",
       this method returns 4: Hahahahaha
 (note that two overlap)
     - if searchString = "HAHA" and origString = "Hahahahaha",
       this method returns 4: Hahahahaha (note that two overlap)
     - if searchString = "rain" and origString = "it’s the brain drain pain train",
       this method returns 3: it’s the brain drain pain train
     - if searchString = "was" and origString = "I was about to call you, wasn’t I?",
       this method returns 2
     - if searchString = "but" and origString = "I was about to call you, wasn’t I?",
       this method returns 0
     - if searchString = "i" and origString = "Supercalifragilisticexpialidocious",
       this method returns 7
    */
    public int countString(String searchString, String origString)
    {
        String origLower = origString.toLowerCase();
        String searchLower = searchString.toLowerCase();
        int count = 0;

        int maxIndex = origLower.length() - searchLower.length();

        for (int i = 0; i <= maxIndex; i ++) {

        }

    }

}
