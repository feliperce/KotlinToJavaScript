import kotlin.browser.*

fun main(args: Array<String>) {

    val button = document.getElementById("submit")

    button?.addEventListener("click", {
        window.alert("Um alert, eita!!!")
    })
}

fun valuate() {

}