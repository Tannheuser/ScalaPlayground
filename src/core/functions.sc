val add = (x: Int) => x + 1
add.toString

val subtract = add.compose((x: Int) => x - 1)
subtract.apply(10)
subtract(10)
