package FabDevs.Edu.demo.controllers

import FabDevs.Edu.demo.data.PostData
import FabDevs.Edu.demo.service.PostService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
class PostCrudController @Autowired constructor(var postService: PostService) {
    @RequestMapping(path = ["/post"], method = [RequestMethod.POST])
    fun postDataPost(@RequestBody post: PostData) {

    }
}