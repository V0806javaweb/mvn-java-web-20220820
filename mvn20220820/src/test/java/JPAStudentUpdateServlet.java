

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Student;

/**
 * Servlet implementation class JPAStudentUpdateServlet
 */
@WebServlet("/JPAStudentUpdateServlet")
public class JPAStudentUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JPAStudentUpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("mvn20220820");
	        EntityManager em = emf.createEntityManager();

	        em.getTransaction().begin();
	        
            Student obj=em.find(Student.class, 1002);
	        System.out.println(obj);
            obj.setAge(299);
            obj.setUsername("中華電信");
            em.merge(obj);
	        
            em.getTransaction().commit();
	        em.close();
	        emf.close();
	        response.getWriter().append(obj.toString());
	       
			}catch(Exception ex) {
				 response.getWriter().append("Error:"+ex.getMessage());
			}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
