package jp.takeda.aoplogs

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class Controller {

    @GetMapping
    fun getPerson(): String {
        return "ほげ"
    }
}