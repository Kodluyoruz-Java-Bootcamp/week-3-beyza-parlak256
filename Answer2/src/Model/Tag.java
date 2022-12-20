package Model;

import java.util.List;

public class Tag {
	private String name;
    private List<Blog> blogs;
    
	public Tag() {
		super();
	}
	
	public Tag(String name, List<Blog> blogs) {
		super();
		this.name = name;
		this.blogs = blogs;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Blog> getBlogs() {
		return blogs;
	}

	public void setBlogs(List<Blog> blogs) {
		this.blogs = blogs;
	}
    
    
}
