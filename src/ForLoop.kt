fun main(args: Array<String>) {
	var items = listOf("apple", "banana", "kiwi")

	for (item in items) {
		println(item)
	}

	var animals = listOf("cat", "dog")

	for (index in animals.indices) {
		println("animal at $index is ${animals[index]}")
	}
}
 