
public interface RoomDAO {
	public Schedule getSchedule(int n);
	public void addRoom(Room r);
	public void deleteRoom(Room r);
	public void addRoom(int number);
	public void deleteRoom(int number);
}
