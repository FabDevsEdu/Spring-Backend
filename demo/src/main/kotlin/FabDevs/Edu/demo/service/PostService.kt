package FabDevs.Edu.demo.service

import FabDevs.Edu.demo.data.PostData
import java.util.*

interface PostService {
    fun savePost(postData: PostData): PostData
    fun fetchAllPosts(): List<PostData>
    fun getPostWithThisName(name: Int): Optional<PostData>
    fun deleteThisId(id: Int)
    fun updateThisPost(postId: Int, post: PostData): PostData
}