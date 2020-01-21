fun main(args: Array<String>) {
	val x = 10
	val y = 9

	if (x in 1..y + 1) {
		println("range")
	}

	val list = listOf("a", "b")

	if (-1 !in 0..list.lastIndex) {
		println("-1 is out of range")
	}

	if (list.size !in list.indices) {
		println("list size is out of valid list indices range")
	}
}