package FabDevs.Edu.demo.data

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class PostData(
    @Id
    var id: UUID? = UUID.randomUUID(),
    var postTitle : String,
    var postContent : String? = null,
    var postImage : String? = null,
    var postDate: String = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss").format(LocalDate.now()),
    var postAuthor: String
)