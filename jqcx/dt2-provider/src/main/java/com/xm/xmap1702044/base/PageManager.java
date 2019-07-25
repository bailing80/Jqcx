package com.xm.xmap1702044.base;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PageManager implements IPageManager,Serializable {
	private static final long serialVersionUID = -7333606777664101156L;
	private int page;
	private List dataList = new ArrayList();
	private int totalPage = 0;
	private int pageRows=10;// 每页显示记录数
	private int totalCount = 0;
	private int sEcho;
	
	@Override
	public List getData() {
		// TODO Auto-generated method stub
		return this.dataList;
	}
	public int getiDisplayLength() {
		return getPageRows();
	}
	public int getiTotalRecords() {
		//本次加载记录数量
		return getTotalCount();
	}
	public int getPage() {
		return page;
	}
	public int getTotalPages() {
		return totalPage;
	}
	public int getPageRows() {
		return pageRows;
	}
	


	public int getTotalCount() {
		return totalCount;
	}
	public int getsEcho() {
		return sEcho;
	}
	@Override
	public void setData(List list) {
		// TODO Auto-generated method stub
		this.dataList = list;
	}
	public void setiDisplayLength(int iDisplayLength) {
		setPageRows(iDisplayLength);
	}
	public void setiTotalRecords(int iTotalRecords) {
		setTotalCount(iTotalRecords);
	}
	public void setPage(int page) {
		this.page = page;
	}
	public void setTotalPages(int pageCount) {
		this.totalPage = pageCount;
	}
	public void setPageRows(int rows) {
		this.pageRows = rows;
	}
	public void setTotalCount(int rowsCount) {
		this.totalCount = rowsCount;
	}
	public void setsEcho(int sEcho) {
		this.sEcho = sEcho;
	}
	@Override
	public void setAaData(List list) {
		// TODO Auto-generated method stub
		setData(list);
	}
	@Override
	public List getAaData() {
		// TODO Auto-generated method stub
		return getData();
	}
	@Override
	public void setiTotalDisplayRecords(int iTotalDisplayRecords) {
		//总记录数量
		setTotalCount(iTotalDisplayRecords);
	}
	@Override
	public int getiTotalDisplayRecords() {
		// TODO Auto-generated method stub
		return getTotalCount();
	} 
}
