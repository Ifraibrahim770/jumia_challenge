# jumia_challenge


To deploy the project (Locally):<br>
 - Install Docker (get it from here: https://docs.docker.com/get-docker/)
 - Navigate to the project's root directory
 - run the command: <strong>docker-compose up </strong> on the terminal
 - Wait for the image to build and run on port 8080

Project Endpoints:<br>
 - 127.0.0.1:8080/customers<br>
   Returns a webpage with all customers (zero filters)
 - 127.0.0.1:8080/customers?country={Country}<br>
   returns a webpage with all customers filtered by the specified country e.g  127.0.0.1:8080/customers?country=Morocco<br>
   Options include: Cameroon,Ethiopia,Morocco,Mozambique, Uganda
   
 - 127.0.0.1:8080/customers?state={State}<br>
   returns a webpage with all customers filtered by the specified state e.g  127.0.0.1:8080/customers?state=VALID<br>
   Options include: VALID,INVALID
   
   
 - 127.0.0.1:8080/customers?state={State}&country={Country}<br>
   returns a webpage with all customers filtered by the specified state and country e.g  127.0.0.1:8080/customers?country=Morocco&state=VALID
