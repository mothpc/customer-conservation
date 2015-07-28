package com.adms.web.view.handler;

import javax.faces.application.ViewHandler;
import javax.faces.application.ViewHandlerWrapper;

public class CustomViewHandler extends ViewHandlerWrapper {

	private ViewHandler wrapped;

    public CustomViewHandler(ViewHandler wrapped) {
        this.wrapped = wrapped;
    }
	
	@Override
	public ViewHandler getWrapped() {
		// TODO Auto-generated method stub
		return null;
	}

}
