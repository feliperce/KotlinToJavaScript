import kotlin.browser.*
import org.w3c.dom.*
import kotlin.dom.appendText


fun main(args: Array<String>) {

    val button = document.getElementById("mybutton") as HTMLButtonElement

    button.addEventListener("click", {
        document.title = "button was clicked"
    })
}

fun valuate() {
    window.alert("dasdasd")
}