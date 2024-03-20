package exercise.controller.users;

import exercise.Data;
import exercise.model.Post;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// BEGIN
@RestController
@RequestMapping("/api/users")
public class PostsController {
    private List<Post> posts = Data.getPosts();

    @GetMapping(path = "/{id}/posts")
    public List<Post> index(@PathVariable int id) {
        return posts.stream()
                .filter(post -> post.getUserId() == id)
                .toList();
    }

    @PostMapping("/{id}/posts")
    @ResponseStatus(HttpStatus.CREATED)
    public Post create(@PathVariable int id, @RequestBody Post post) {
        post.setUserId(id);
        posts.add(post);
        return post;
    }

    // END
}

// END
