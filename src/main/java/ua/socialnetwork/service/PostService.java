package ua.socialnetwork.service;

import org.springframework.web.multipart.MultipartFile;
import ua.socialnetwork.dto.PostDto;
import ua.socialnetwork.entity.Post;
import ua.socialnetwork.entity.enums.PostAction;

import java.util.List;

public interface PostService {
    Post create(Post post);

    Post create(Post postDto, MultipartFile postImage);

    Post update(PostDto postDto, MultipartFile multipartFile);
    Post returnPostEntityById(Integer postId);

    void delete(int id);

    PostDto readById(int id);

    List<PostDto> getPostsByUser_Username(String username);

    List<PostDto> getAll();

    void makeReaction(Post post, PostAction action);
}
