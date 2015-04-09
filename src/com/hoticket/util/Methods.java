package com.hoticket.util;

import java.util.List;


public class Methods {
	/**
	 * get index for min number in the arraylist
	 * @param list
	 * @return index of minimum number in the arraylist
	 */
	public static int minIndex(List<Double> list) {
		  Integer i=0, minIndex=-1;
		  Double max=null;
		  for (Double x : list) {
		    if ((x!=null) && ((max==null) || (x<max))) {
		      max = x;
		      minIndex = i;
		    }
		    i++;
		  }
		  return minIndex;
		}
	

}