package randomnum;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class randomServlet
 */
@WebServlet("/randomServlet")
public class randomServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public randomServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StringBuilder sb = new StringBuilder();
		String inputNum = request.getParameter("inputNum");
		int num = Integer.parseInt(inputNum);
		PrintWriter writer = response.getWriter();
		if(num > 0 && num <= 10) {
			for(int i=0;i<num;i++) {
				int rand = new Random().nextInt(1000+1);
				sb.append(rand+"   ");
			}	
			writer.println("Random numbers generated " + sb.toString() );
		}else {
			writer.println("You entered an invalid Number -- Valid numbers are 1 - 10");
		}
		writer.close();			
			
		}
		
}

