package com.devops;

import org.json.JSONObject;

public class CheckPort {
        public static void main(String[] args) {
                JSONObject tomJsonObj = new JSONObject();
                tomJsonObj.put("name", "Mydemo");
                tomJsonObj.put("url", "demo.com.io");
                System.out.println(tomJsonObj.toString(4));
        }
}