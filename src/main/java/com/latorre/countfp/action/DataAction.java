package com.latorre.countfp.action;

import java.util.List;

import com.latorre.countfp.model.Data;
import com.opensymphony.xwork2.ActionSupport;

public class DataAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private Data data;
	private List<Data> datas;
	
	public String execute() {
		return SUCCESS;
	}

	public String add() {
		if(data != null) {
			datas.add(data);
		}
		return " ";
	}

	public void setData(Data data) {
		this.data = data;
	}

	public void setDatas(List<Data> datas) {
		this.datas = datas;
	}

	public List<Data> getDatas() {
		return datas;
	}
}
