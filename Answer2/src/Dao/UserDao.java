package Dao;

import java.util.ArrayList;
import java.util.List;

import Model.Blog;
import Model.BlogStatus;
import Model.Tag;
import Model.User;

public class UserDao {
	private static List<User> userList = new ArrayList<>();
	private TagDao tagDao = new TagDao();
	private BlogDao blogDao = new BlogDao();

	public void createUser(User user) {
		userList.add(user);
	}

	public List<User> getAllUsers() {
		return userList;
	}

	public void followUser(User user1, User user2) {

		if (!userList.contains(user1) || !userList.contains(user2)) {
			System.out.println("This account is not exist!");
		}

		user1.getFollowUsers().add(user2);
		user2.getFollowUsers().add(user1);
	}

	public void unfollowUser(User user1, User user2) {

		if (!userList.contains(user1) || !userList.contains(user2)) {
			System.out.println("This account is not exist!");
		}

		user1.getFollowUsers().remove(user2);
		user2.getFollowUsers().remove(user1);
	}

	public void followTag(User user, Tag tag) {
		user.getFollowTags().add(tag);
	}

	public void unfollowTag(User user, Tag tag) {
		user.getFollowTags().remove(tag);
	}

	public void writeDraft(User user, Blog blog, String input) {

		if (input.equalsIgnoreCase("y")) {
			blog.setBlogStatus(BlogStatus.PUBLISHED);
		}

		user.getBlogs().add(blog);
	}

	public void deleteBlog(User user, Blog blog) {
		user.getBlogs().remove(blog);
	}
}
