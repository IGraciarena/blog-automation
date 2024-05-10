package dev.igraciarena.blogautomation;

import com.intuit.karate.junit5.Karate;

/**
 * @author ivan.graciarena
 * @project blog-automation
 */
class PostRunner {
    @Karate.Test
    Karate testGetAllPosts() {
        return Karate.run("posts").relativeTo(getClass());
    }
}
