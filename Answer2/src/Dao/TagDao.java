package Dao;

import java.util.ArrayList;
import java.util.List;

import Model.Tag;

public class TagDao {
	private static List<Tag> tagList = new ArrayList<>();

    public void createTag(Tag tag){
        tag.getBlogs().forEach(blog -> blog.setTag(tag));
        tagList.add(tag);
    }

    public List<Tag> getAll(){
        return tagList;
    }

    public void removeTag(Tag tag){
        tagList.remove(tag);
        tag.getBlogs().forEach(blog -> blog.setTag(null));
    }
}
