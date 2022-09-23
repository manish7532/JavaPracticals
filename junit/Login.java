package junit;

public class Login {
	
	private String username,password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	boolean checkLogin() 
	{
		if(username.equals("admin") && password.equals("admin123"))

		{return true;}
		else
			{return false;}
	}

}
