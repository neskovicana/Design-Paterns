package news;

import java.util.Calendar;
import java.util.Date;

public class UrgentNews extends News {

	public UrgentNews(String subject, Date date, String content) {
		super(subject, date, content);
	}

	@Override
	protected String subjectForPrinting() {
		return super.getSubject().toUpperCase();
	}

	@Override
	protected Date dateForPrinting() {
		Calendar calendar = Calendar.getInstance();
		return calendar.getTime();
	}

	@Override
	protected String contentforPrinting() {
		return super.getContent();
	}

}
