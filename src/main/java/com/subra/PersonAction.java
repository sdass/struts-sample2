package com.subra;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class PersonAction extends Action {

	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String target = new String("success");
		
		String firstName="", lastName="", email="";
		int age =0;
		if (form != null) {
			// Use the PersonForm to get the request parameters
			System.out.println("1. PersonAction: execute(). . . ");
			PersonForm personForm = (PersonForm) form;
			firstName = personForm.getFirstName();
			lastName = personForm.getLastName();
			email = personForm.getEmail();
			age = personForm.getAge();
		}
		// if no mane supplied Set the target to failure
		if ((firstName == "") && (age == 0)) {
			target = new String("failure");
		} else {
			request.setAttribute("NAME", firstName + " " + lastName + " , " + email + " , " + age );
			System.out.println("2. PersonAction: execute(). . . ");
		}
		return (mapping.findForward(target));
	}
}
