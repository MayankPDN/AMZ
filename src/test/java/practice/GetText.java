package practice;







import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class GetText {
	 
	
	public static void main(String[]args) {
		
	
		RestAssured.baseURI="http://reqres.in";
		
		RequestSpecification httprequest=RestAssured.given();
		Response httpResponse = httprequest.request(Method.GET,"/api/users?page=2");
		
		String response = httpResponse.getBody().asPrettyString();
		System.out.println(response);
	}
		 	
}


				
	
		
		
		
			
		

	

	

	
	
	
	
	

			
		
		
	

