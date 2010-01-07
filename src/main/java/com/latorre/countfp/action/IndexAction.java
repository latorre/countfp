package com.latorre.countfp.action;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;

public class IndexAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	
	private static final Logger log = Logger.getLogger(IndexAction.class);
	
	public String execute() {
		log.info("Execute in IndexAction");
		return SUCCESS;
	}
}
