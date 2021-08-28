package FabDevs.Edu.demo.repository

import FabDevs.Edu.demo.data.PostData
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PostCrudRepository : JpaRepository<PostData, Int>