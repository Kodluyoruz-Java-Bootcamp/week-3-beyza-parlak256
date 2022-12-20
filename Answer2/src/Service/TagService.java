package Service;

import java.util.List;

import Dao.TagDao;
import Model.Tag;

public class TagService {
	private TagDao tagDao = new TagDao();


    public void createTag(Tag tag){
        tagDao.createTag(tag);
    }

    public void removeTag(Tag tag){
        tagDao.removeTag(tag);
    }

    public List<Tag> getAll(){
        return tagDao.getAll();
    }

    public void printAllTags(){
        getAll().forEach(tag -> System.out.println(tag.getName()));
    }

    public void printBlogTitleByTag(Tag tag){
        getAll().forEach(tag1 -> tag1.getBlogs().stream().filter(blog -> blog.getTag().getName().equals(tag.getName()))
                .forEach(blog1 -> System.out.println(blog1.getTitle())));
    }
}
