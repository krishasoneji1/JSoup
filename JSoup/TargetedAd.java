/*
 * Problem 2 Sell My Pet Food
 */

public class TargetedAd {

  public void makeAd()
  
    {
  {
    
    DataCollector dataCollector = new DataCollector();
    dataCollector.setData("usernames_and_reviews.txt", "targetedwords.txt");

    // Step 3: Create a String variable to hold the names of all the users
    String usersString = "";

    // Step 4: Compare each user's post to each target word
    String post;
    String targetWord;
    while ((post = dataCollector.getNextPost()) != "NONE") {
        // Get the username from the post
        String username = post.split(" ")[0]; // Assuming username is the first word in the post

        // Check if the post contains any target words
        while ((targetWord = dataCollector.getNextTargetWord()) != "NONE") {
            if (post.indexOf(targetWord) != -1) { // Check if the target word exists in the post
                if (!usersString.isEmpty()) {
                    usersString += " ";
                }
                usersString += username;
                break; // Break loop once a target word is found in the post
            }
        }
        // Reset the current target word index if we've reached the end of the list
    }

    // Step 5: Prepare advertisement for targeted users
 
    String advertisement = "Since you liked these earrings, we think you'll enjoy our new gold hoop earrings on our site for 50% off using code EARRINGS!!!";
    dataCollector.prepareAdvertisement("targeted_advertisement.txt", usersString, advertisement);        

    }
  }

   /*  
   
     
     * PREPARATION WORK
     * (1) Create a file called targetWords.txt. Populate this file with words on each line that
     *     you think would determine if a user is a dog or cat owner.
     * 
     * PROGRAMMING
     * (2) Create a new DataCollector object and set the data to "socialMediaPostsSmall.txt" and "targetWords.txt"
     *     Important: Use the socialMedialPostsSmall to create your algorithm. Using a small file will help you 
     *     generate your solution quicker and give you the ability to double check your work.
     * (3) Create a String variable to hold the names of all the user. (The first word of every post is 
     *     a person's username)
     * (4) Compare each user's post to each target word. If a user mentions a target word, add their username to 
     *     the String of users. Separate usernames with a space. 
     *         Hint: You can use loops to look through each word. 
     *         Hint2: You can use indexOf to check if a word is in a user post. 
     * (5) Once you have all the users, use your DataCollector's prepareAdvertisement method to prepare a file 
     *     with all users and the advertisement you will send them.
     *         Additional Info: The prepareAdvertisement creates a new file on your computer. Check the posts of
     *         some of the usernames to make sure your algorithm worked.
     * 
     * THE FINAL SOLUTION
     * (6) Your solution should work with the socialMedialPostsSmall.txt. Modify your DataCollector initialization
     *    so you use the socialMediaPosts.txt. You should now have a larger file of users to target.
     */


    
}