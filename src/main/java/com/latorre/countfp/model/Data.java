package com.latorre.countfp.model;

/**
 * Model Data functions
 * @author edgar
 *
 */
public class Data {
	private String file;
	private int type;
	private int alr;
	private int der;
	private int complexity;
	
	
	public String getFile() {
		return file;
	}
	
	public void setFile(String file) {
		this.file = file;
	}
	
	public int getType() {
		return type;
	}
	
	public void setType(int type) {
		this.type = type;
	}
	
	public int getAlr() {
		return alr;
	}
	
	public void setAlr(int alr) {
		this.alr = alr;
	}
	
	public int getDer() {
		return der;
	}
	
	public void setDer(int der) {
		this.der = der;
	}
	
	public int getComplexity() {
		return complexity;
	}
	
	public void setComplexity(int complexity) {
		this.complexity = complexity;
	}
}
