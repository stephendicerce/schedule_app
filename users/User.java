import java.util.*;

public class User {
    private String userName;
    private String password;

    private User(String u, String p) {
	userName = u;
	password = p;
    }

    public User createUser(String u, String p) {
	return new User(u,p);
    }

    public boolean updateUserName(String oldUserName, String newUserName) {
	User user = getUser(oldUserName); // needs to be implemented
	
	if(user != null) {
	    user.setUserName(newUserName);
	    return saveUser(user);
	} else {
	    return false;
	}
    }

    public void setUserName(String u) {
	userName = u;
    }

    /**
     *This method will be phased out once a better storage system with hashing is implemented
     */
    public void setPassword(String p) {
	password = p;
    }
}
