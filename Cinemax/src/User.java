
public class User {
    private int id;
	private String lastname, firstname, mail, password;
	private String account_type;
	
	public User(String lastname, String firstname, String mail, String password, String account_type) {
		super();
		this.lastname = lastname;
		this.firstname = firstname;
		this.mail = mail;
		this.password = password;
		this.account_type = account_type;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAccount_type() {
		return account_type;
	}
	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}
	
	
}
