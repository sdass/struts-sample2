package com.subra;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class NameForm extends ActionForm {

	private String name = null;

	public String getName() {
		System.out.println("NameForm: getName(). . . ");
		return (name);
	}

	public void setName(String name) {
		System.out.println("NameForm: setName(). . . ");
		this.name = name;
	}

	public void reset(ActionMapping mapping, HttpServletRequest request) {
		this.name = null;
	}
}
