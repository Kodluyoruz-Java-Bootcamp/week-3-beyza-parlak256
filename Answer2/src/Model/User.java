package Model;

import java.util.List;

public class User {
	private String name;
    private String password;
    private String email;
    private List <Blog> blogs;
    private List <User> followUsers;
    private List <Tag> followTags;
    
	public User() {
		super();
	}

	public User(String name, String password, String email) {
		super();
		this.name = name;
		this.password = password;
		this.email = email;
		this.blogs = blogs;
		this.followUsers = followUsers;
		this.followTags = followTags;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Blog> getBlogs() {
		return blogs;
	}

	public void setBlogs(List<Blog> blogs) {
		this.blogs = blogs;
	}

	public List<User> getFollowUsers() {
		return followUsers;
	}

	public void setFollowUsers(List<User> followUsers) {
		this.followUsers = followUsers;
	}

	public List<Tag> getFollowTags() {
		return followTags;
	}

	public void setFollowTags(List<Tag> followTags) {
		this.followTags = followTags;
	}
    
}
