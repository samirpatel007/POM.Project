package com.pageclass;

import org.json.JSONArray;
import org.json.JSONObject;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;

public class RestAssuredDemo {
	
public static void main(String[] args) {
		
		System.setProperty("http.proxyHost","64.210.197.20");
		System.setProperty("http.proxyPort","80" );
		Response re=RestAssured.get("http://escluster-stage.cnbc.com/pubindex/news/103993210");
		System.out.println(re.asString());
		boolean found=new JSONObject(re.asString()).getBoolean("found");
		System.out.println(found);
		JSONObject basicMeta=new JSONObject(re.asString()).getJSONObject("_source").getJSONObject("meta");
		System.out.println(basicMeta.getString("id"));
		System.out.println(basicMeta.getString("title"));
		System.out.println(basicMeta.getJSONObject("type").getString("system_name"));
		JSONArray attribution=new JSONObject(re.asString()).getJSONObject("_source").getJSONObject("attribution").getJSONArray("source_assets");
		JSONObject source=(JSONObject) attribution.get(0);
		
		System.out.println(source.getString("title"));
		
		JSONArray relations=new JSONObject(re.asString()).getJSONObject("_source").getJSONObject("Relations").getJSONArray("franchise_assets");
		JSONObject franchise=(JSONObject) relations.get(0);
		System.out.println(franchise.getString("title"));
	
	}

}
