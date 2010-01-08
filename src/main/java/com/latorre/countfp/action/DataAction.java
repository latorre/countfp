package com.latorre.countfp.action;

import java.util.ArrayList;
import java.util.List;

import com.latorre.countfp.model.Data;
import com.opensymphony.xwork2.ActionSupport;

public class DataAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private List<String> types;
	private List<String> complexities;
	private Data data;
	private List<Data> datas = new ArrayList<Data>();
	
	public String execute() {
		return SUCCESS;
	}

	public String add() {
		if(data != null) {
			datas.add(data);
		}
		return SUCCESS;
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

	public void setTypes(List<String> types) {
		this.types = types;
	}

	public List<String> getTypes() {
		return types;
	}

	public void setComplexities(List<String> complexities) {
		this.complexities = complexities;
	}

	public List<String> getComplexities() {
		return complexities;
	}
}
