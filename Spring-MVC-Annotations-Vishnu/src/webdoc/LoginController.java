package webdoc;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	@RequestMapping("/login.hello")
	public ModelAndView loginValid(HttpServletRequest request, 
			 HttpServletResponse response,ModelMap map){
			String user = request.getParameter("user");
			String pass = request.getParameter("pass");
			System.out.println("My Login is  Valid");
		ModelAndView mav = new ModelAndView();
			if(user.equals("vishnu1"))
				mav.setViewName("/Success.jsp");
			else
				mav.setViewName("/Failed.jsp");
			return mav;
	}	
	
	@RequestMapping("/user.hello")
	public ModelAndView userValid(HttpServletRequest request, 
			 HttpServletResponse response,ModelMap map){
		
			String user = request.getParameter("user");
			String pass = request.getParameter("pass");
			System.out.println("userValid");
			
		ModelAndView mav = new ModelAndView();
			if(user.equals("vishnu2"))
				mav.setViewName("/Success.jsp");
			else
				mav.setViewName("/Failed.jsp");
			return mav;
	}	
	
	
}
