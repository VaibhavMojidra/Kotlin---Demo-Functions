fun main(args: Array<String>) {

	printHello()

	val a = 10
	val b = 20

	printSum(a, b)

	val result = sumTwo(a, b)
	println(result)

}

fun printHello() {
	println("Hello, World!")
}

fun printSum(a: Int, b: Int) {
	println(a + b)
}

fun sumTwo(a: Int, b: Int): Int {
	val x = a + b

	return x
}
