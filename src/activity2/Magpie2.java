/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White, Pharell, DogMouseCat
 * @version April 2012
 */
public class Magpie2 {
    /**
     * Get a default greeting
     *
     * @return a greeting
     */
    public String getGreeting() {
        return "Hello, let's talk.";
    }

    /**
     * Gives a response to a user statement
     *
     * @param statement the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement) {
        statement = statement.trim();
        String response = "";
        if (statement.indexOf("no") >= 0) {
            response = "Why so negative?";
        } else if (statement.indexOf("father") >= 0
                || statement.indexOf("mother") >= 0
                || statement.indexOf("sister") >= 0
                || statement.indexOf("brother") >= 0) {
            response = "Tell me more about your family.";
        } else if (statement.indexOf("dog") >= 0
                || statement.indexOf("cat") >= 0) {
            response = "Tell me more about your pets.";
        } else if (statement.indexOf("Mr") >= 0
                || statement.indexOf("Mrs") >= 0
                || statement.indexOf("Miss") >= 0) {
            response = "They sound like a good Teacher.";
        } else if (statement.length() == 0) {
            response = "Say something, please.";
        } else if (statement.indexOf("soccer") >= 0)

        {
            response = "I don't know much about soccer.";
        }
        else if (statement.indexOf("football") >= 0)
        {
            response = "I like football.";
        }
        else if (statement.indexOf("baseball") >= 0)
        {
            response = "Baseball is boring.";
        }
        else
		{
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse() {
        final int NUMBER_OF_RESPONSES = 6;
        double r = Math.random();
        int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
        String response = "";

        if (whichResponse == 0) {
            response = "Interesting, tell me more.";
        } else if (whichResponse == 1) {
            response = "Hmmm.";
        } else if (whichResponse == 2) {
            response = "Do you really think so?";
        } else if (whichResponse == 3) {
            response = "You don't say.";
        } else if (whichResponse == 4) {
            response = "Go away!";
        } else if (whichResponse == 5) {
            response = "Stop.";
        }



		return response;
	}
}
