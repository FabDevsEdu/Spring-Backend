package FabDevs.Edu.demo.controllers

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
class MainController {
    @RequestMapping(path = ["/"], method = [RequestMethod.GET])
    fun getRootPath() : String {return "Root Path"}
}