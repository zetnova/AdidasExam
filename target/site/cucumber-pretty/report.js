$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AdidasTest.feature");
formatter.feature({
  "line": 1,
  "name": "",
  "description": "",
  "id": "",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "API Get available pets from the list",
  "description": "",
  "id": ";api-get-available-pets-from-the-list",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@Test1"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "set api endpoint",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "get available pets",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Assert response code",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Assert expected result",
  "keyword": "Then "
});
formatter.match({
  "location": "AdidasApiSteps.setGetPetsURI()"
});
formatter.result({
  "duration": 489588640,
  "status": "passed"
});
formatter.match({
  "location": "AdidasApiSteps.getAvailablePets()"
});
formatter.result({
  "duration": 1833703440,
  "status": "passed"
});
formatter.match({
  "location": "AdidasApiSteps.assertResponseCode()"
});
formatter.result({
  "duration": 1126601,
  "status": "passed"
});
formatter.match({
  "location": "AdidasApiSteps.assertGetAvailableList()"
});
formatter.result({
  "duration": 965639967,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "API Add new pet in the list",
  "description": "",
  "id": ";api-add-new-pet-in-the-list",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@Test2"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "set api endpoint",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "Post a new available pet to the store",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "Assert response code",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Assert new pet added",
  "keyword": "Then "
});
formatter.match({
  "location": "AdidasApiSteps.setGetPetsURI()"
});
formatter.result({
  "duration": 97894,
  "status": "passed"
});
formatter.match({
  "location": "AdidasApiSteps.postNewPet()"
});
formatter.result({
  "duration": 700867099,
  "status": "passed"
});
formatter.match({
  "location": "AdidasApiSteps.assertResponseCode()"
});
formatter.result({
  "duration": 58859,
  "status": "passed"
});
formatter.match({
  "location": "AdidasApiSteps.assertNewPetAdded()"
});
formatter.result({
  "duration": 43030444,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "API Update pet in the list",
  "description": "",
  "id": ";api-update-pet-in-the-list",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@Test3"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "set api endpoint",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "Update this pet status to sold",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "Assert response code",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "Assert status updated",
  "keyword": "Then "
});
formatter.match({
  "location": "AdidasApiSteps.setGetPetsURI()"
});
formatter.result({
  "duration": 75575,
  "status": "passed"
});
formatter.match({
  "location": "AdidasApiSteps.updatePetStatus()"
});
formatter.result({
  "duration": 685500246,
  "status": "passed"
});
formatter.match({
  "location": "AdidasApiSteps.assertResponseCode()"
});
formatter.result({
  "duration": 41684,
  "status": "passed"
});
formatter.match({
  "location": "AdidasApiSteps.assertStatusPet()"
});
formatter.result({
  "duration": 11081801,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "API Delete pet from the list",
  "description": "",
  "id": ";api-delete-pet-from-the-list",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 23,
      "name": "@Test4"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "set api endpoint",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "Delete this pet",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "Assert response code",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "Assert deletion",
  "keyword": "Then "
});
formatter.match({
  "location": "AdidasApiSteps.setGetPetsURI()"
});
formatter.result({
  "duration": 84899,
  "status": "passed"
});
formatter.match({
  "location": "AdidasApiSteps.deletePet()"
});
formatter.result({
  "duration": 662348238,
  "status": "passed"
});
formatter.match({
  "location": "AdidasApiSteps.assertResponseCode()"
});
formatter.result({
  "duration": 83507,
  "status": "passed"
});
formatter.match({
  "location": "AdidasApiSteps.assertDeletePet()"
});
formatter.result({
  "duration": 667430964,
  "status": "passed"
});
formatter.scenario({
  "line": 31,
  "name": "UI Navigate through product categories",
  "description": "",
  "id": ";ui-navigate-through-product-categories",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 30,
      "name": "@Test5"
    }
  ]
});
formatter.step({
  "line": 32,
  "name": "open demoblaze.com",
  "keyword": "Given "
});
formatter.step({
  "line": 33,
  "name": "Customer navigate to phone category",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "check products in Phone category are shown",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "navigate to Laptops category",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "check products in Laptops category are shown",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "navigate to Monitors category",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "check products in Monitors category are shown",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "Close demoblaza.com",
  "keyword": "And "
});
formatter.match({
  "location": "AdidasUISteps.openDemoblazeCom()"
});
formatter.result({
  "duration": 1545928812,
  "status": "passed"
});
formatter.match({
  "location": "AdidasUISteps.navigateToSections()"
});
formatter.result({
  "duration": 57944402,
  "status": "passed"
});
formatter.match({
  "location": "AdidasUISteps.checkProducts()"
});
formatter.result({
  "duration": 7735722321,
  "status": "passed"
});
formatter.match({
  "location": "AdidasUISteps.navigateToLaptopSections()"
});
formatter.result({
  "duration": 41697418,
  "status": "passed"
});
formatter.match({
  "location": "AdidasUISteps.checkProductsLaptop()"
});
formatter.result({
  "duration": 6317851611,
  "status": "passed"
});
formatter.match({
  "location": "AdidasUISteps.navigateToMonitorSections()"
});
formatter.result({
  "duration": 48063562,
  "status": "passed"
});
formatter.match({
  "location": "AdidasUISteps.checkProductsMonitors()"
});
formatter.result({
  "duration": 2120602463,
  "status": "passed"
});
formatter.match({
  "location": "AdidasUISteps.close()"
});
formatter.result({
  "duration": 70483680,
  "status": "passed"
});
formatter.scenario({
  "line": 42,
  "name": "UI Add to cart and purchase",
  "description": "",
  "id": ";ui-add-to-cart-and-purchase",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 41,
      "name": "@Test6"
    }
  ]
});
formatter.step({
  "line": 43,
  "name": "open demoblaze.com",
  "keyword": "Given "
});
formatter.step({
  "line": 44,
  "name": "Navigate to Laptop → Sony vaio i5 and click on Add to cart. Accept pop up confirmation",
  "keyword": "When "
});
formatter.step({
  "line": 45,
  "name": "Navigate to Laptop → Dell i7 8gb and click on Add to cart. Accept pop up confirmation",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "Navigate to Cart → Delete Dell i7 8gb from cart",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "Click on Place order",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "Fill in all web form fields",
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "Click on Purchase",
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "Capture and log purchase Id and Amount",
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "Assert purchase amount equals expected",
  "keyword": "Then "
});
formatter.step({
  "line": 52,
  "name": "click on OK",
  "keyword": "And "
});
formatter.match({
  "location": "AdidasUISteps.openDemoblazeCom()"
});
formatter.result({
  "duration": 1024153892,
  "status": "passed"
});
formatter.match({
  "location": "AdidasUISteps.choseLaptopSonyI5()"
});
formatter.result({
  "duration": 2267020050,
  "status": "passed"
});
formatter.match({
  "location": "AdidasUISteps.choseLaptopDellI7()"
});
formatter.result({
  "duration": 2570941902,
  "status": "passed"
});
formatter.match({
  "location": "AdidasUISteps.deleteFromTheCart()"
});
formatter.result({
  "duration": 3085359895,
  "status": "passed"
});
formatter.match({
  "location": "AdidasUISteps.clickOnPlaceOrders()"
});
formatter.result({
  "duration": 759002576,
  "status": "passed"
});
formatter.match({
  "location": "AdidasUISteps.addNameInTheForm()"
});
formatter.result({
  "duration": 556194045,
  "status": "passed"
});
formatter.match({
  "location": "AdidasUISteps.clickOnPurchaseButton()"
});
formatter.result({
  "duration": 80999742,
  "status": "passed"
});
formatter.match({
  "location": "AdidasUISteps.captureIdAndAmount()"
});
formatter.result({
  "duration": 671824017,
  "status": "passed"
});
formatter.match({
  "location": "AdidasUISteps.assertPurchase()"
});
formatter.result({
  "duration": 47819,
  "status": "passed"
});
formatter.match({
  "location": "AdidasUISteps.clickOK()"
});
formatter.result({
  "duration": 421515591,
  "status": "passed"
});
});