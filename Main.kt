//TIP Press <shortcut raw="SHIFT"/> twice to open the Search Everywhere dialog and type <b>show whitespaces</b>,
// then press <shortcut raw="ENTER"/>. You can now see whitespace characters in your code.
fun main() {
    var text: String? = null
     text = "this variable is not null"
    val text2 : String  = text ?: "the variable is null."
    println(text2)


}