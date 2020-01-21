fun main(args: Array<String>) {
	println(maxOf(5, 1))
	println(maxOfShort(4, 2))
}

fun maxOf(a: Int, b: Int): Int {
	if (a > b) {
		return a
	} else {
		return b
	}
}

fun maxOfShort(a: Int, b: Int) = if (a > b) a else b