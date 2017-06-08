package org.heloworldmvc.controller;

import org.heloworldmvc.Contract.IModel;
import org.heloworldmvc.Contract.IView;
//import org.heloworldmvc.model.Model;

public class Controller {
	private final IView view;
	private final IModel model;
	
	public Controller(final IView view, final IModel model ){
		this.view = view;
		this.model = model;
	}

	public void run(){
		this.view.displayMessage(this.model.getHelloWorld());
	}
}
