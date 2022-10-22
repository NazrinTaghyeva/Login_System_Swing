package org.example;

import java.util.HashMap;

public class IDandPassword {
    HashMap<String,String> logininfo = new HashMap<>();

    IDandPassword(){
        logininfo.put("Nazryn","programmer");
        logininfo.put("Tarlan","leadDeveloper");
        logininfo.put("Sabi","seniorDeveloper");
    }

    protected HashMap<String, String> getLoginInfo(){
        return logininfo;
    }
}
