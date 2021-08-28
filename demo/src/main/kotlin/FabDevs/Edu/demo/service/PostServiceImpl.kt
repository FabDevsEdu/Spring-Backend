package FabDevs.Edu.demo.service

import FabDevs.Edu.demo.data.PostData
import FabDevs.Edu.demo.repository.PostCrudRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class PostServiceImpl @Autowired constructor(var repo: PostCrudRepository) : PostService {
    override fun savePost(postData: PostData): PostData {
        return repo.save(postData)
    }

    override fun fetchAllPosts(): List<PostData> {
        return repo.findAll()
    }

    override fun getPostWithThisName(name: Int): Optional<PostData> {
        return repo.findById(name)
    }

    override fun deleteThisId(id: Int) {
        repo.deleteById(id)
    }

    override fun updateThisPost(postId: Int, post: PostData): PostData {
        var remote = repo.findById(postId).get()
        when{
            Objects.nonNull(post.postAuthor) -> remote.postAuthor = post.postAuthor
            Objects.nonNull(post.postContent) -> remote.postContent = post.postContent
            Objects.nonNull(post.postDate) -> remote.postDate = post.postDate
            Objects.nonNull(post.postImage) -> remote.postImage = post.postImage
        }
        return repo.save(remote)
    }
}