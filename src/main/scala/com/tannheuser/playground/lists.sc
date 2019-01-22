val list1 = List(1, 2, 3)
val list2 = 1 :: 2 :: 3 :: Nil

// Lists identity (same object)
val listsIdentity = list1 eq list2

// List equality (same content)
val listsEquality = list1 == list2

// Nil lists

val nil1 = Nil
val nil2 = Nil
val digitNil: List[Int] = Nil
val stringNil: List[String] = Nil

val nilIdentity = nil1 eq nil2
val nilEquality = nil1 == nil2
val difNilIdentity = digitNil eq stringNil
val difNilEquality = digitNil == stringNil

val concatList = List("a", "b") ::: List("c", "d")

concatList.drop(2)
concatList.dropRight(2)
concatList.exists(l => l == "e")
concatList.head
concatList.init
concatList.last
concatList.map(l => l + l)
concatList.reverse



