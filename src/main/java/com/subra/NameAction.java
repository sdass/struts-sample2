package com.subra;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class NameAction extends Action {

	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String target = new String("success");
		String name = null;
		if (form != null) {
			// Use the NameForm to get the request parameters
			System.out.println("1. NameAction: execute(). . . ");
			NameForm nameForm = (NameForm) form;
			name = nameForm.getName();
		}
		// if no mane supplied Set the target to failure
		if (name == null) {
			target = new String("failure");
		} else {
			request.setAttribute("NAME", name);
			System.out.println("2. NameAction: execute(). . . ");
		}
		return (mapping.findForward(target));
	}
}
