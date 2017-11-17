package chat.model;

import java.util.List;
import java.time.LocalTime;
import java.util.ArrayList;

public class Chatbot
{
	private List<Movie> movieList;
	private List<String> shoppingList;
	private List<String> cuteAnimalMemes;
	private String [] verbs;
	private String [] topics;
	private String [] followUps;
	private String [] questions;
	private String username;
	private String content;
	private String intro;
	private LocalTime currentTime;
	
	public Chatbot(String username)
	{
		this.movieList = new ArrayList<Movie>();
		this.shoppingList = null;
		this.cuteAnimalMemes = null;
		this.currentTime = null;
		this.questions = null;
		this.username = null;
		this.content = null;
		this.intro = null;
		this.currentTime = null;
		this.topics = null;
		this.verbs = new String [4];
		this.followUps = null;
		
		buildVerbs();
		buildShoppingList();
	}
	
	private void buildVerbs()
	{
		verbs[0] = "like";
		verbs[1] = "dislike";
		verbs[2] = "am ambivalent about";
		verbs[3] = "am thinking about";
	}

	private void buildMovieList()
	{
		Movie Alien = new Movie("Alien");
		Movie Spiderman = new Movie("Spiderman");
		Movie StarWars = new Movie("Star Wars");
		Movie HiddenFigures = new Movie("Hidden Figures");
		
		movieList.add(Alien);
		movieList.add(Spiderman);
		movieList.add(StarWars);
		movieList.add(HiddenFigures);
	}
	
	private void buildShoppingList()
	{
		shoppingList.add("cookies");
		shoppingList.add("tofu");
		shoppingList.add("fruits");
		shoppingList.add("vegetables");
	}
	
	private void buildCuteAnimals()
	{
		cuteAnimals doge = new cuteAnimals("doge");
		cuteAnimals puppers = new cuteAnimals("puppers");
		cuteAnimals doggo = new cuteAnimals("doggo");
		cuteAnimals goodboyes = new cuteAnimals("good boyes");
		
		cuteAnimals.add(doge);
		cuteAnimals.add(puppers);
		cuteAnimals.add(doggo);
		cuteAnimals.add(goodboyes);
	}
	
	private void buildQuestions()
	{
		
	}
	/**
	 * Takes the user input and combines with a generated response and returns it.
	 * @param input The users supplied text
	 * @return
	 */
	
	public String processConversation(String input)
	{
		String chatbotResponse = "";
		chatbotResponse += "You said:" + "\n" + input;
		chatbotResponse += buildChatbotResponse();
		
		return chatbotResponse;
	}
	
	private String buildChatbotResponse()
	{
		String response = "I ";
		int random = Math.random() * verbs.length;
		
		response += verbs[random];
		
		random = (int) (Math.random() * topics.length);
		response += " " + topics[random] + ".\n"
				
		random = (int) (Math.random() * questions.length);
		response += questions[random];
		
		random = (int) (Math.random() * 2);
		
		if (random % 2 == 0)
		{
			random = (int) (Math.random() * movieList.size());
			response += movieList.get(random).getTitle() + " is a great movie";
		}
		
		
		
		return response;
	}
	
	public boolean lengthChecker(String input)
	{
		boolean validLength = false;
		
		if (input != null && input.length() > 2)
		{
			validLength = true;
		}
	}
	
	public boolean htmlTagChecker(String input)
	{
		return false;
	}
	
	public boolean userNameChecker(String input)
	{
		return false;
	}
	
	public boolean contentChecker(String contentCheck)
	{
		return false;
	}
	
	public boolean cuteAnimalMemeChecker(String input)
	{
		return false;
	}
	
	public boolean shoppingListChecker(String shoppingItem)
	{
		return false;
	}
	
	public boolean movieTitleChecker(String title)
	{
		return false;
	}
	
	public boolean movieGenreChecker(String genre)
	{
		return false;
	}

	public boolean quitChecker(String exitString)
	{
		return false;
	}

	public boolean keyboardMashChecker(String sample)
	{
		if (exitString.equals.IgnoreCase("quit"))
		{
			return true;
		}
		return false;
	}
	
	public List<Movie> getMovieList()
	{
		return movieList;
	}
	
	public List<String> getShoppingList()
	{
		return shoppingList;
	}
	
	public List<String> getCuteAnimalMemes()
	{
		return cuteAnimalMemes;
	}

	public String [] getQuestions()
	{
		return null;
	}
	
	public String[] getVerbs()
	{
		return verbs;
	}

	public String[] getTopics()
	{
		return topics;
	}

	public String[] getFollowUps()
	{
		return followUps;
	}

	public String getUsername()
	{
		return username;
	}
	
	public String getContent()
	{
		return content;
	}

	public String getIntro()
	{
		return null;
	}
	
	public LocalTime getCurrentTime()
	{
		return null;
	}
	
	public void setUsername(String username)
	{
		this.username = username;
	}
	
	public void setContent(String content)
	{
		this.content = content;
	}
}
