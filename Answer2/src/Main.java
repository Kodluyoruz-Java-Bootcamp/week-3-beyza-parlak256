import java.util.List;

import Model.Blog;
import Model.Tag;
import Model.User;
import Service.BlogService;
import Service.TagService;
import Service.UserService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BlogService blogService = new BlogService();
        UserService userService = new UserService();
        TagService tagService = new TagService();

        User user1 = new User("User1", "123", "beyza@gmail.com");
        User user2 = new User("User2", "wasdeq", "asli@gmail.com");
        userService.createUser(user1);
        userService.createUser(user2);

        Blog blog1 = new Blog("Blog1", "Blog post.", user1);
        Blog blog2 = new Blog("Blog2", "Blog post.", user2);
        blogService.createBlog(blog1);
        blogService.createBlog(blog2);

        Tag tag1 = new Tag("testTag1", List.of(blog1));
        Tag tag2 = new Tag("testTag2", List.of(blog2));

        tagService.createTag(tag1);
        tagService.createTag(tag2);

        System.out.println("Print all blog titles");
        blogService.printAllBlogs();
        System.out.println("Print blog titles by user");
        userService.printBlogByUser(user1);
        userService.printBlogByUser(user2);

        System.out.println("Publish blog");
        blogService.publishBlog(blog1);
        blogService.publishBlog(blog2);

        System.out.println("Print blog title by user");
        userService.printBlogByUser(user1);
        userService.printBlogByUser(user2);

        System.out.println("Set blog statu : DELETED");
        blogService.deleteBlog(blog1);
        blogService.deleteBlog(blog2);

        System.out.println("Print blog title by user");
        userService.printBlogByUser(user1);
        userService.printBlogByUser(user2);

        System.out.println("Set blog statu : DRAFT");
        blogService.draftBlog(blog1);
        blogService.draftBlog(blog2);

        System.out.println("Print blog title by user");
        userService.printBlogByUser(user1);
        userService.printBlogByUser(user2);

        System.out.println("User follows tag");
        userService.followTag(user1, tag2);
        userService.followTag(user2, tag1);

        System.out.println("User follows user");
        userService.followUser(user1, user2);
        userService.followUser(user2, user1);

        System.out.println("Print followed users");
        userService.printFollowedUsers(user1);
        userService.printFollowedUsers(user2);

        System.out.println("Print all tags");
        tagService.printAllTags();

        System.out.println("Print blog title by tag");
        tagService.printBlogTitleByTag(tag1);
        tagService.printBlogTitleByTag(tag2);

        System.out.println("Print all blog titles");
        blogService.printAllBlogs();
        System.out.println("\nPrint blog titles by user");
        userService.printBlogByUser(user1);
        userService.printBlogByUser(user2);

        System.out.println("Print all tags");
        tagService.printAllTags();

        System.out.println("Print blog title by tag");
        tagService.printBlogTitleByTag(tag1);
        tagService.printBlogTitleByTag(tag2);

        System.out.println("Print all blog titles");
        blogService.printAllBlogs();

        blogService.removeBlog(blog1);
        blogService.removeBlog(blog2);

        System.out.println("Print All Blog Titles !");
        blogService.getAll().forEach(blog -> System.out.println(blog.getTitle()));
        System.out.println("Print All User Blogs !");
        blogService.printAllBlogs();

	}

}
