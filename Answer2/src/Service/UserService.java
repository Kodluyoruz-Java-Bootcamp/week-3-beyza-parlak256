package Service;

import java.util.List;
import java.util.Scanner;
import Dao.UserDao;
import Model.Blog;
import Model.Tag;
import Model.User;

public class UserService {
	private UserDao userDao = new UserDao();
    private static final Scanner scanner = new Scanner(System.in);
    
    public void createUser(User user){
        userDao.createUser(user);
    }

    public List<User> getAll(){
        return userDao.getAllUsers();
    }  

    public void writeDraftBlog(User user, Blog blog){
        String input;
        do {
            System.out.println("Do you want to publish your blog?\n" + "Yes or No (Y/N)");
            input = scanner.nextLine();
            
            if (input.equalsIgnoreCase("Y")){
                userDao.writeDraft(user,blog,input);
            } 
            else {
                System.out.println("Blog has not been published.");
            }
        }while (input.equalsIgnoreCase("Y") || input.equalsIgnoreCase("N"));
    }
    
    public void printBlogByUser(User user){
        userDao.getAllUsers().stream()
                .filter(usr -> usr.getName().equalsIgnoreCase(user.getName()))
                .forEach(user1 -> user1.getBlogs().forEach(blog -> System.out.println(blog.getTitle() + " - " + blog.getBlogStatus())));
    }
    
    public void printFollowedUsers(User user){
        user.getFollowUsers().forEach(user1 -> System.out.println(user1.getName()));
    }

    public void deleteBlog(User user, Blog blog){
        userDao.deleteBlog(user,blog);
    }

    public void followUser(User user1, User user2){
        userDao.followUser(user1,user2);
    }

    public void unfollowUser(User user1, User user2){
        userDao.unfollowUser(user1,user2);
    }

    public void followTag(User user, Tag tag){
        userDao.followTag(user, tag);
    }

    
}
