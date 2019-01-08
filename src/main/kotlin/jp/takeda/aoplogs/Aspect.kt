package jp.takeda.aoplogs

import org.aspectj.lang.JoinPoint
import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Before
import org.springframework.stereotype.Component


@Aspect
@Component
class AspectLog {

    @Before("execution(* jp.takeda.aoplogs.*.*(..))")
    fun before(joinPoint: JoinPoint) {
        println("beforeだよー。")
    }
}