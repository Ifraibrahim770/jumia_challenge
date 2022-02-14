# jumia_challenge


## To deploy the project (Locally):<br>
 - Install Docker (get it from [HERE](https://docs.docker.com/get-docker/):  and make sure its added to the PATH
 - Navigate to the project's root directory
 - Open a terminal session using Windows Terminal, GitBash or any other CLI tool 
 - Run the command:<br>
   ```
   docker-compose up
   ``` 
 - Wait for the image to build and run on port 8080

## Project Endpoints:<br>
  ```
 http://127.0.0.1:8080/customers
 ```
   Returns a webpage with all customers (zero filters)
  ```
  http://127.0.0.1:8080/customers?country={Country}
   ```
   Returns a webpage with all customers filtered by the specified country e.g ```127.0.0.1:8080/customers?country=Morocco```<br>
   Options include: Cameroon,Ethiopia,Morocco,Mozambique, Uganda
   ```
  http://127.0.0.1:8080/customers?state={State}
   ```
   Returns a webpage with all customers filtered by the specified state e.g  ```127.0.0.1:8080/customers?state=VALID```<br>
   Options include: VALID,INVALID
   
   ```
  http://127.0.0.1:8080/customers?state={State}&country={Country}
   ```
   Returns a webpage with all customers filtered by the specified state and country e.g  ```127.0.0.1:8080/customers?country=Morocco&state=VALID```
   

