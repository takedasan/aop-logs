package jp.takeda.aoplogs

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AopLogsApplication

fun main(args: Array<String>) {
	runApplication<AopLogsApplication>(*args)
}

