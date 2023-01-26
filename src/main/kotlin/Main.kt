import com.code.softech.httputils.HttpResponseStatus
import com.code.softech.httputils.HttpStatusCodes

fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
    HttpStatusCodes.ACCEPTED.code
    HttpStatusCodes.ACCEPTED.reason
    println(HttpResponseStatus().parse(100).reason)
}