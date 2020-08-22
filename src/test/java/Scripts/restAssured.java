package Scripts;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class restAssured {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification httpPost=RestAssured.given();
		
		
		httpPost.header("Content-Type", "application/json");
		
		Response response =httpPost.queryParam("page", "2")
									.post("api/users");
		
		Assert.assertEquals(201, response.statusCode());
		System.out.println("Response is : "+response.statusCode());

	}

}
