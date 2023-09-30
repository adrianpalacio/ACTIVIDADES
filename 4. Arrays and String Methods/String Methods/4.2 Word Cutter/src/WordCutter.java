public class WordCutter
{
    //code the method cutInHalf that returns the first half of the String passed as argument
    public static String[] getLettersList(String word)
    {
        String[] letters = new String[word.length()];
        for(int i = 0; i < word.length(); i++)
        {
            letters[i] = word.substring(i, i+1);
        }
        return letters;
}