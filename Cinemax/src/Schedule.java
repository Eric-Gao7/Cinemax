import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Schedule {

	Map<Date,Film> map=new HashMap<Date,Film>();

	public Schedule(Map<Date, Film> map) {
		super();
		this.map = map;
	}

	public Map<Date, Film> getMap() {
		return map;
	}

	public void setMap(Map<Date, Film> map) {
		this.map = map;
	}	   
}
