import java.util.*;


public interface UserDAO {
	public List<User> getUsers();
	public User getUser(int id);
	public String addUser(User u);
	public boolean deleteUser(int id);
}
