package mx.com.shell.java.helloworld

import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

class HelloServlet : HttpServlet() {

    override fun doGet(request: HttpServletRequest, response: HttpServletResponse) {
        response.writer.print("Hello from servlet")
    }
}