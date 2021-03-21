package com.automation.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class AdidasApiSteps {

    private static final String BASE_URL = "https://petstore.swagger.io/v2/pet/";


    private static Response response;
    private static String jsonString;
    private static String petId;
    private static String petName;
    private static String petStatus;
    private static String messageResponse;
    private static String jsonPutBody;


    private static RequestSpecification request;

     public static void addHeaders(){
            request= RestAssured.given();
            request.header("Accept", "application/json");
            request.header("Content-type", "application/json");
        }

    @Given("^set api endpoint$")
    public void setGetPetsURI(){
        RestAssured.baseURI = BASE_URL;
        System.out.println(BASE_URL);
    }

    @When("^get available pets$")
    public void getAvailablePets() {

        response = RestAssured.get("findByStatus?status=available");
    }
    @Then("^Assert response code$")
        public void assertResponseCode(){
        Assert.assertEquals(200,response.getStatusCode());

        }

    @Then("^Assert expected result$")

            public void assertGetAvailableList(){
        String jsonString= response.asString();
        List<Map<String, String>> petNames = JsonPath.from(jsonString).get("name");
        Assert.assertTrue(petNames.size() > 0);
    }


    @When("^Post a new available pet to the store$")
    public void postNewPet(){

        double nameId=Math.random();
        String pet_name="Zizo"+nameId;

        String jsonBody="{\n" +
                "  \"id\": 0,\n" +
                "  \"category\": {\n" +
                "    \"id\": 0,\n" +
                "    \"name\": \"string\"\n" +
                "  },\n" +
                "  \"name\": \"" + pet_name + "\",\n" +
                "  \"photoUrls\": [\n" +
                "    \"string\"\n" +
                "  ],\n" +
                "  \"tags\": [\n" +
                "    {\n" +
                "      \"id\": 0,\n" +
                "      \"name\": \"string\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"status\": \"available\"\n" +
                "}";


       addHeaders();
        response= (Response) request.body(jsonBody).post();

    }

    @Then("^Assert new pet added$")
    public void assertNewPetAdded(){

        petId=response.jsonPath().getString("id");
        petName=response.jsonPath().getString("name");
        System.out.println(petId + " " +petName);
    }

    @When("^Update this pet status to sold$")
    public void updatePetStatus(){

       jsonPutBody="{\n" +
               "  \"id\": \"" + petId +"\",\n" +
               "  \"category\": {\n" +
               "    \"id\": 0,\n" +
               "    \"name\": \"string\"\n" +
               "  },\n" +
               "  \"name\": \"" + petName + "\",\n" +
               "  \"photoUrls\": [\n" +
               "    \"string\"\n" +
               "  ],\n" +
               "  \"tags\": [\n" +
               "    {\n" +
               "      \"id\": 0,\n" +
               "      \"name\": \"string\"\n" +
               "    }\n" +
               "  ],\n" +
               "  \"status\": \"sold\"\n" +
               "}";

       addHeaders();
        response= (Response) request.body(jsonPutBody).put();


    }

    @Then("^Assert status updated$")
    public void assertStatusPet(){
        petStatus=response.jsonPath().getString("status");
        Assert.assertEquals("sold",petStatus);

    }

    @When("^Delete this pet$")
    public void deletePet(){
       addHeaders();
        response=(Response)request.body(jsonPutBody).delete(petId);
    }

    @Then("^Assert deletion$")
    public void assertDeletePet(){
        messageResponse=response.jsonPath().getString("message");
        if(messageResponse.equalsIgnoreCase(petId)){
            System.out.println("The Body response contains the right Pet Id" + " " + petId + " " + messageResponse);
        }
        //to verify that this petId is not exist in the list already
        response = RestAssured.get(petId);
        Assert.assertEquals(404,response.getStatusCode());

    }





}
