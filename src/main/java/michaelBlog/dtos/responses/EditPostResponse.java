package michaelBlog.dtos.responses;

import lombok.Data;

@Data
public class EditPostResponse {
    private String postId;
    private String title;
    private String content;
    private String dateCreated;
}
