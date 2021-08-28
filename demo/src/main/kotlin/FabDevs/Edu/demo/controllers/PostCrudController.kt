package FabDevs.Edu.demo.controllers

import FabDevs.Edu.demo.data.PostData
import FabDevs.Edu.demo.service.PostService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
class PostCrudController @Autowired constructor(var postService: PostService) {
    @RequestMapping(path = ["/post"], method = [RequestMethod.POST])
    fun postDataPost(@RequestBody post: PostData): String {
        var send = postService.savePost(post)
        return "Post updated for author :${send.postAuthor} with title: ${send.postTitle}"
    }

    @RequestMapping(path = ["/all"], method = [RequestMethod.GET])
    fun getAllPosts() = postService.fetchAllPosts()

    @RequestMapping(path = ["/post/{name}"], method = [RequestMethod.GET])
    fun getPostWithTitle(@PathVariable("name") name: Int) = postService.getPostWithThisName(name)

    @RequestMapping(path = ["/deletePost/{id}"], method = [RequestMethod.DELETE])
    fun deleteParticular(@PathVariable("id") id: Int): String {
        postService.deleteThisId(id)
        return "Deleted $id"
    }

    @RequestMapping(path = ["/updatePost/{id}"], method = [RequestMethod.PUT])
    fun updatePost(@PathVariable("id") postId: Int, @RequestBody post: PostData) : PostData{
       return postService.updateThisPost(postId, post)
    }
}