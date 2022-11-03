public class Runner {
    public static void main(String[] args) {
        StringLoops loops = new StringLoops();
        System.out.println(loops.countCharacters("a", "Apples and bananas"));
        System.out.println(loops.countCharacters("A", "Apples and bananas"));
        System.out.println(loops.countCharacters("!", "Hello! Nice day!"));
        System.out.println(loops.reverseString("hello!"));
        System.out.println(loops.reverseString("Apples and bananas"));
        System.out.println(loops.reverseString("hello!"));
        System.out.println(loops.reverseString("Apples and bananas"));
        System.out.println(loops.countVowels("Apples and bananas"));
        System.out.println(loops.countVowels("Hello Joe"));
        System.out.println(loops.countVowels("Hmm.. pssh!"));
        System.out.println(loops.countVowels("I"));
        System.out.println(loops.countVowels("Supercalifragilisticexpialidocious"));






    }
}
