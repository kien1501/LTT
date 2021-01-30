package com.globits.da.view.utils;

public class SystemUtil {

	public static String getDomainName(String path) {
		   String[] parts = path.split("//");
		   if(parts!=null && parts.length>1) {
			   path = parts[1];
		   }
		   parts = path.split(":");
		   if(parts!=null && parts.length>1) {
			   path = parts[0];
		   }
		   parts = path.split("/");
		   String domain =null;
		   if(parts!=null && parts.length>0) {
			   String[] splits = parts[0].split("//");
			   if(splits!=null && splits.length>1) {
				   domain =splits[1];
			   }else {
				   domain =splits[0];
			   }
		   }
	   return domain;
	}
}
