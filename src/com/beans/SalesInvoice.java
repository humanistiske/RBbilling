package com.beans;

public class SalesInvoice 
{
	private String cust_name;
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	public String getCust_address() {
		return cust_address;
	}
	public void setCust_address(String cust_address) {
		this.cust_address = cust_address;
	}
	public String getParty_gst() {
		return party_gst;
	}
	public void setParty_gst(String party_gst) {
		this.party_gst = party_gst;
	}
	public String getDispatch() {
		return dispatch;
	}
	public void setDispatch(String dispatch) {
		this.dispatch = dispatch;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getState_code() {
		return state_code;
	}
	public void setState_code(String state_code) {
		this.state_code = state_code;
	}
	public String getDel_name() {
		return del_name;
	}
	public void setDel_name(String del_name) {
		this.del_name = del_name;
	}
	public String getDel_address() {
		return del_address;
	}
	public void setDel_address(String del_address) {
		this.del_address = del_address;
	}
	public int getInvoice_no() {
		return invoice_no;
	}
	public void setInvoice_no(int invoice_no) {
		this.invoice_no = invoice_no;
	}
	public int getOrder_no() {
		return order_no;
	}
	public void setOrder_no(int order_no) {
		this.order_no = order_no;
	}
	public int getChallan_no() {
		return challan_no;
	}
	public void setChallan_no(int challan_no) {
		this.challan_no = challan_no;
	}
	private String cust_address;
	private String party_gst;
	private String dispatch;
	private String state;
	private String state_code;
	private String del_name;
	private String del_address;
	private int invoice_no;
	private int order_no;
	private int challan_no;

}
