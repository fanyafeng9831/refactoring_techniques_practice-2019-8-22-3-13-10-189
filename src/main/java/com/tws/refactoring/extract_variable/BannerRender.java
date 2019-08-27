package com.tws.refactoring.extract_variable;

public class BannerRender {
    public String renderBanner(String platform, String browser) {
    	int platformIndexOf =platform.toUpperCase().indexOf("MAC"); 
    	int browserIndexOf = browser.toUpperCase().indexOf("IE");
        if (platformIndexOf> -1 &&( browserIndexOf > -1)) {
            return "IE on Mac?";
        }else {
        return "banner";
        }
    }
}
