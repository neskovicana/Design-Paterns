package news;

import java.util.Calendar;
import java.util.Date;

public class RegularNews extends News {

	public RegularNews(String subject, Date date, String content) {
		super(subject, date, content);
	}

	@Override
	protected String subjectForPrinting() {
		return super.getSubject();
	}

	@Override
	protected Date dateForPrinting() {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_YEAR, 1);
		return calendar.getTime();
	}

	@Override
	protected String contentforPrinting() {
		return super.getContent();
	}
	
	
	
}
