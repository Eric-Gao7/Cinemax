import java.util.*;



public class Film {
	
	private String title;
	private String realisator;
	private float average_Mark;
	private String summary;
	private List<String> comment;
	private List<String> pictures;
	private List<String> trailers;
	
	public Film(String title, String realisator, float average_Mark, String summary) {
		super();
		this.title = title;
		this.realisator = realisator;
		this.average_Mark = average_Mark;
		this.summary = summary;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getRealisator() {
		return realisator;
	}

	public void setRealisator(String realisator) {
		this.realisator = realisator;
	}

	public float getAverage_Mark() {
		return average_Mark;
	}

	public void setAverage_Mark(float average_Mark) {
		this.average_Mark = average_Mark;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}
	
	
	
	


}
