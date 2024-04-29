package news;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class News implements Subject {
	
	private String subject;
	private Date date;
	private String content;
	private List<Observer> observers;
	
	public News(String subject, Date date, String content) {
		this.subject = subject;
		this.date = date;
		this.content = content;
		this.observers = new ArrayList<>();
	}

	public String getSubject() {
		return subject;
	}

	public Date getDate() {
		return date;
	}

	public String getContent() {
		return content;
	}
	
	@Override
	public final String toString() {
		return "News [subject=" + subjectForPrinting() + ", date=" + dateForPrinting() + ", content=" + contentforPrinting() + "]";
	}
	
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}
	
	@Override
	public void unregisterObserver(Observer observer) {
		observers.remove(observer);
	}
	
	@Override
	public void notifyObservers() {
		for (Observer o : observers) {
			o.update("Observer updated");
		}
		System.out.println("Observers notified.");
	}
	
	public void publish() {
		System.out.println("The " + this.toString() +" are published.");
		System.out.println();
	}
	
	protected abstract String subjectForPrinting();
	
	protected abstract Date dateForPrinting();
	
	protected abstract String contentforPrinting();

}
