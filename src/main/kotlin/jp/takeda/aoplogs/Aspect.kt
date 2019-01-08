package jp.takeda.aoplogs

import org.aspectj.lang.JoinPoint
import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Before
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.security.core.userdetails.User
import org.springframework.stereotype.Component


@Aspect
@Component
class AspectLog {

    @Before("execution(* jp.takeda.aoplogs.*.*(..))")
    fun before(joinPoint: JoinPoint) {
        val principal = SecurityContextHolder.getContext().authentication.principal

        if (principal is User) {
            println("${principal.username}:beforeだよー")
        }
    }
}