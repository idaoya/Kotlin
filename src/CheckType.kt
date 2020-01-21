fun main(args: Array<String>) {
	println(getString("Hello"))
	println(getStringShort(""))
}

fun getString(obj: Any): Int? {
	if (obj is String) {
		return obj.length
	}

	return null
}

fun getStringShort(obj: Any): Int? {
	if (obj !is String) return null

	return obj.length
}