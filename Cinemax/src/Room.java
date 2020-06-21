
public class Room {

	private int number;
	private int places_number;
	private float x_position;
	private float y_position;
	private Schedule schedule;
	
	public Room(int number, int places_number, float x_position, float y_position, Schedule schedule) {
		super();
		this.number = number;
		this.places_number = places_number;
		this.x_position = x_position;
		this.y_position = y_position;
		this.schedule = schedule;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getPlaces_number() {
		return places_number;
	}

	public void setPlaces_number(int places_number) {
		this.places_number = places_number;
	}

	public float getX_position() {
		return x_position;
	}

	public void setX_position(float x_position) {
		this.x_position = x_position;
	}

	public float getY_position() {
		return y_position;
	}

	public void setY_position(float y_position) {
		this.y_position = y_position;
	}

	public Schedule getSchedule() {
		return schedule;
	}

	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}
	
	
}
