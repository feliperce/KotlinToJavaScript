import kotlin.browser.*
import org.w3c.dom.*

private var rankArrayList: ArrayList<TopIde> = arrayListOf(
        TopIde(1, "Visual Studio"),
        TopIde(2, "Eclipse"),
        TopIde(3, "Android Studio"),
        TopIde(4, "Netbeans"),
        TopIde(5, "IntelliJ"),
        TopIde(6, "Sublime Text"),
        TopIde(7, "Atom"),
        TopIde(8, "pyCharm")
)

fun main(args: Array<String>) {

    val button = document.getElementById("submit") as HTMLInputElement
    val text = document.getElementById("note") as HTMLInputElement

    button.addEventListener("click", {
        window.alert(evaluate(text.value))
    })

    rankArrayList.forEach {
        val h = document.createElement("p")
        val t = document.createTextNode("${it.rank} - ${it.name}")
        h.appendChild(t)
        document.body?.appendChild(h)
    }
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