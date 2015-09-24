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
        String shortPost = "";
        for (int i = 0; i < longPost.length(); i++) {
            if (!"aeiouAEIOU".contains(longPost.substring(i, i + 1))) {
                shortPost = shortPost + longPost.substring(i, i + 1);
            }
        }
        return shortPost;
    }
}
