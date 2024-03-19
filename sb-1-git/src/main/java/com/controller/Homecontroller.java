package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homecontroller {

          	//hi iam raju
         //hi Iam RAni


	@RequestMapping("/")
	public String getMsg() {
		return "Welcome To Exponent";
	}



       // Rani - Feature-101
       public void getRaniMsg()
       {
     	//hi rani changes is here.
       }

		//hi Raju Change

}
