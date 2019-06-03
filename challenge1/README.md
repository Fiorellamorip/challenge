************************************************************************
challenge
************************************************************************
To try this application you can run Principal.java and write it: http://localhost:8080/api/v1/messages/6f9c15fa-ef51-4415-afab-36218d76c2df
on an Internet browser, then you can check the json response with the decrypted coordinates or In http://localhost:8080/swagger-ui.htm you can check the api documentation generated using swagger and you can execute the api.
 
Another way to try it is to execute the tests located in com.challenge.apirest.controller  package
this application use spring boot and doesn't use database because is not neccesary to save the coordinates, it only needs a get method to calculate the decrypted cordinates so we have omitted the Message class MensejaRepository. 
