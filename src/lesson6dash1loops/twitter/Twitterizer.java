package lesson6dash1loops.twitter;

// Write code for the shorten(String longPost) method.
public class Twitterizer
{
    /**
     * Shortens and prints longPost by removing vowels
     * @param longPost the post whose vowels need to be removed.
     */
    public String shorten(String longPost) 
    {
        for(int i = 0; i < longPost.length(); i++) {
            String letter = longPost.substring(i, i + 1);
            if ("aeiouAEIOU".contains(letter)) {
                longPost.replace(letter, "");
            }
        }
        return longPost;
    }
}
