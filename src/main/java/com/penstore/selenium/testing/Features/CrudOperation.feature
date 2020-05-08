Feature: API Testing for Petstore

Scenario:Creating new Customer for Petstore
Given API is Up and Running
When Send Post request with new Customer Id and Content type
Then New Customer Created with Response status code 200 and body "true"