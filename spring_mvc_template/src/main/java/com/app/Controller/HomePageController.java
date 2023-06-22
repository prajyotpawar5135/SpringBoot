package com.app.Controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller  //
//mandatory to tell sc: following is request handling controller=handler,
//containing request handling ,methods
public class HomePageController {

	public HomePageController()
	{
		System.out.println("in ctor of "+getClass());
	}
	//add req handling method to forward the client to index.jsp
	@RequestMapping("/")// can intercept get/put /post/delete...
	public ModelAndView showHomePage()
	{
		System.out.println("in show home page");
		//API o.s.w.s.ModelAndView(String lvn,String modelAttrName,Object value)
							//   /nahi takla tr 404
		return new ModelAndView("/index","timestamp",LocalDateTime.now());
		//Handler method returns -->modelAndView object to--> DS(dispatcher servlet)-->sends LVN-
		//-->V.R(View resolver)->AVN :/WEB-INF/views/index.jsp-->D.S. 
		//checks for model attributes -->yes-->saves it under the request scope
		//why request scope->bcoz of server code-->RD rd=request.getRD("/WEB-INF/views/index.jsp");
		//rd.forward(req,resp)-->JSP-->${...}
	}
}
