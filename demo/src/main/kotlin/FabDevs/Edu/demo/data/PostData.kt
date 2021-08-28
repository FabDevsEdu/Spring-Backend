package FabDevs.Edu.demo.data

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*
import javax.persistence.*

@Entity
data class PostData(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Int,
    var postTitle : String = "Default Name",
    var postContent : String? = null,
    var postImage : String? = null,
    var postDate: String = "",
    var postAuthor: String = "Akshat"
)