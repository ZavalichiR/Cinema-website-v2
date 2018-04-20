package lumeafilmelor.webserver;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URI;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.HttpUrlConnectorProvider;

import lumeafilmelor.core.User;


@WebServlet("/ReturnMovieName")
public class ReturnMovieName extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReturnMovieName() {
        super();
        // TODO Auto-generated constructor stub
    }

    private static URI getBaseURI() {
        //TODO change the port to whatever is the server running on
        return UriBuilder.fromUri("http://localhost:8080/LumeaFilmelorWebServices/").build();
    }


    public static void main(String[] args) {
        
    }
    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		response.setContentType("text/plain");
		response.setCharacterEncoding("UTF-8");
		
		String partialName = request.getParameter("str");
		String data = partialName;
		PrintWriter pw = response.getWriter();
		//TO DO//
		/*for()--parcurgi lista cu filme
		{
			if -PartialName se gaseste intr-un film din lista de filme
				afisare film cu: pw.append(nume_film).append("<br/>");
		}
		*/
		
		//Cautare in baza de date a filmelor care contin cifrele din variabila partialName
		pw.append("<a class='selectFilm'  method='get' href='film.php?idFilm=\"1' >").append("Film").append("</a><br/>");
		response.getWriter().write(data);
       
        
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
