import kotlin.browser.*
import org.w3c.dom.*

fun main(args: Array<String>) {

    val button = document.getElementById("submit") as HTMLInputElement
    val text = document.getElementById("note") as HTMLInputElement

    button.addEventListener("click", {
        window.alert(evaluate(text.value))
    })
}

fun evaluate(value: String): String {

    val number: Int? = value.toIntOrNull()

    return if(number != null) {
        when (number) {
            in 0..3 -> "Que absurdo!"
            in 4..6 -> "Invejoso!!!"
            in 7..10 -> "s2 Kotlin é amor s2"
            else -> "Informe somente número de 0 a 10, der."
        }
    } else {
        "Informe apenas números!!"
    }
}