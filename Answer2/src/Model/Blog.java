package Model;

public class Blog {
	private String title;
    private String content;
    private Tag tag;
    private User user;
    private BlogStatus blogStatus = BlogStatus.DRAFT;
    
	public Blog() {
		super();
	}

	public Blog(String title, String content, User user) {
		super();
		this.title = title;
		this.content = content;
		this.tag = tag;
		this.user = user;
		this.blogStatus = blogStatus;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Tag getTag() {
		return tag;
	}

	public void setTag(Tag tag) {
		this.tag = tag;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public BlogStatus getBlogStatus() {
		return blogStatus;
	}

	public void setBlogStatus(BlogStatus blogStatus) {
		this.blogStatus = blogStatus;
	}
    
    
}
