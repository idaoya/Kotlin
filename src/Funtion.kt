package my.demo

import kotlin.text.*

fun main(args: Array<String>) {
	println(sum(2, 3))
	println(sumExpressionBody(2, 3))
	sumNoMeaningfulValue(2, 3)
	sumReturnOmitted(2, 3)
}

fun sum(a: Int, b: Int): Int {
	return a + b
}

fun sumExpressionBody(a: Int, b: Int) = a + b

fun sumNoMeaningfulValue(a: Int, b: Int): Unit {
	println("sum of $a and $b is ${a + b}")
}

fun sumReturnOmitted(a: Int, b: Int) {
	println("sum of $a and $b is ${a + b}")
}