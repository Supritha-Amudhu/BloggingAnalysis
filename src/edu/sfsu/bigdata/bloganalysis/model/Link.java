package edu.sfsu.bigdata.bloganalysis.model;

public class Link {

	private String url;
	private String linkText;
	
	/**
	 * Define default and parameterized constructors
	 */
	public Link() {}
	
	public Link(String url) {
		this.url = url;
	}
	
	/**
	 * Define Getters and Setters for Link parameters
	 * @return
	 */
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getLinkText() {
		return linkText;
	}
	public void setLinkText(String linkText) {
		this.linkText = linkText;
	}
	
	@Override
	public String toString() {
		return "[linkText='"+this.linkText+"', url='"+this.url+"']";
	}
	
}
