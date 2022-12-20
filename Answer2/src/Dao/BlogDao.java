package Dao;

import java.util.ArrayList;
import java.util.List;

import Model.Blog;
import Model.BlogStatus;
import Model.Tag;

public class BlogDao {
	private static List<Blog> blogList = new ArrayList<>();
    private TagDao tagDao  = new TagDao();

    public void createBlog(Blog blog){

        if (blog!=null && blog.getTag()!=null && blog.getTag().getName()!=null){
            tagDao.createTag(blog.getTag());
        }

        if (blog.getUser()!=null){
            blog.getUser().getBlogs().add(blog);
        }
        blogList.add(blog);
    }

    public void addBlogToTag(Blog blog, Tag tag){

        if (blog.getTag()==null && blogList.contains(blog) && tagDao.getAll().contains(tag)){
            blog.setTag(tag);
            tag.getBlogs().add(blog);
        }
    }

    public void removeBlogFromTag(Blog blog, Tag tag){

        if (blogList.contains(blog) && tagDao.getAll().contains(tag)){
            blog.setTag(null);
            tag.getBlogs().remove(blog);
        }
    }

    public void removeBlog(Blog blog){
        blogList.remove(blog);
        blog.getUser().getBlogs().remove(blog);
    }

    public List<Blog> getAll(){
        return blogList;
    }

    public void setBlogStatus(Blog blog, BlogStatus blogStatus){
        blog.setBlogStatus(blogStatus);
    }
}
