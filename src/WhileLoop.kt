fun main(args: Array<String>) {
	val items = listOf("man", "woman")
	var index = 0

	while (index < items.size) {
		println("item at $index is ${items[index]}")
	}
}

fun describe(obj: Any): String =
	when (obj) {
		1 -> "One"
		"Hello" -> "Greeting"
		is Long -> "Long"
		!is String -> "Not a string"
		else -> "Unknow"
	}