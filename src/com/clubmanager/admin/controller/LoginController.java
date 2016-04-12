package com.clubmanager.admin.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJacksonJsonView;

import com.clubmanager.admin.service.LoginService;

@Controller
public class LoginController {
	@Autowired
	@Qualifier("LoginSerivce")
	private LoginService loginservice;

	@ResponseBody
	@RequestMapping(value="/login.do",method=RequestMethod.GET)
  public ModelAndView login(@RequestParam String username,@RequestParam String password){
		System.out.println("enter controller!");
	  Map<String,String> result = new HashMap<String,String>();
	  try{
		  if(this.loginservice.validateUser(username, password)){
			  result.put("result", "true");
		  }else{
			  result.put("result", "false");
		  }
	  }catch (Exception e) {
		// TODO: handle exception
		  result.put("result", "error");
		  result.put("msg", e.toString());
	}
	  return new ModelAndView(new MappingJacksonJsonView(),result);
  }

}
