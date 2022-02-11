package com.kihyeonkim.springmsaskeleton

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@EnableEurekaClient
@SpringBootApplication
class SpringMsaSkeletonApplication

fun main(args: Array<String>) {
	runApplication<SpringMsaSkeletonApplication>(*args)
}
