import java.util.Date

val tpl = (1, "hello", new Date())
val strings = ("apple", "dog")
val fruit = strings._1
val animal = strings._2

val person = ("Boris Bork", 55, new Date(1961, 9, 11))
val (name, age, birthday) = person

name
age
birthday

