package news;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class App {
	
	private static List<User> users = new ArrayList<>();
	private static List<News> news = new ArrayList<>();
	
	private static void randomlyRegisterObservers(News news) {
		Collections.shuffle(users);
		for (User u : users) {
			news.registerObserver(u);
		}
	}
	
	private static void registerAndPublish(News news) {
		randomlyRegisterObservers(news);
		news.publish();
		news.notifyObservers();
	}
	
	
	public static void main(String[] args) {
		users.add(new User("taca@gmail.com"));
		users.add(new User("kaja@gmail.com"));
		users.add(new User("masa@gmail.com"));
		
		news.add(new RegularNews("Politika", new Date(), "Bla bla bla bla blaaaaaaaa"));
		news.add(new UrgentNews("Sport", new Date(), "Djokovic je opet sportista godine!Juhuuuuuuu jea jea jeaa lesgooo"));
		news.add(new UrgentNews("Politika", new Date(), "Ultra ekskluzivno novo sokantno!!!"));
		
		for (News n : news) {
			registerAndPublish(n);
		}
	}

}
