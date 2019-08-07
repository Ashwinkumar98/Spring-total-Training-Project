package com.cts.scd.service;
import java.util.List;

public class ListServiceImp  {
	
	public List<Integer> arr;
	
	public ListServiceImp()
	{
		
	}

	public ListServiceImp(List<Integer> arr) {
		super();
		this.arr = arr;
	}
	
	
	
	public List getList()
	{
		return arr;
	}

}
