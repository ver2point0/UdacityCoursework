package lesson6dash1loops.twitterbackwards;

// Implement the reverse(String post) method.
public class Twitterizer
{
    /**
     * Shortens and prints longPost by removing vowels.
     * @param longPost the post whose vowels need to be removed.
     */
    public String shorten(String longPost) 
    {
        String shortPost = "";
        for (int i = 0; i < longPost.length(); i++)
        {
            if (!"aeiouAEIOU".contains(longPost.substring(i, i+1)))
            {
                shortPost = shortPost + longPost.substring(i, i+1);
            }
        }
        return shortPost;
    }
    
    /**
     * Prints a post backwards to hide its contents.
     * @param post the post to be reversed.
     */
    public String reverse(String post)
    {
       String reverseString = "";
       for (int i = post.length() - 1; i >= 0; i--){
           reverseString += post.charAt(i);
       }
       return reverseString;
    }
}
