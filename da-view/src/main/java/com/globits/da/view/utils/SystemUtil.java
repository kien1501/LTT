package com.globits.da.view.utils;

public class SystemUtil {
//	public static Hashtable<String, WebsiteDto> hashWebsite= new Hashtable<String, WebsiteDto>(); 
//	public static String getTemplate(String domainPath) {
//		String template ="template3";
//	   if(domainPath!=null) {
//		   String domainName = getDomainName(domainPath);
//		   WebsiteDto website =null;
////		   website = SystemUtil.hashWebsite.get(domainName);
////		   if(website==null) {
////			   website=  ServerService.getWebsiteByDomain(domainName);
////			   if(website!=null) {
////				   SystemUtil.hashWebsite.put(domainName, website);
////			   }			   
////		   }
//		   website=  ServerService.getWebsiteByDomain(domainName);
//		   if(website!=null) {
//			   template = website.getTemplate();
//		   }
//	   }
//	   return template;
//	}
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
