# jumia_challenge


To deploy the project (Locally):<br>
 - Install Docker 
 - Navigate to the project's root directory
 - run the command: <strong>docker-compose up --build</strong> on the terminal
 - Once the image is succesfully created, run the command  <strong>docker run -e SERVER_PORT=8080 -p 8080:8080 jumia_api</strong> (this will initialize the application on port 8080)

Project Endpoints:<br>
 - 127.0.0/1:8080/customers<br>
   Returns a webpage with all customers (zero filters)
 - 127.0.0.1:8080/customers?country={Country}<br>
   returns a webpage with all customers filtered by the specified country e.g  127.0.0.1:8080/customers?country=Morocco<br>
   Options include: Cameroon,Ethiopia,Morocco,Mozambique, Uganda
   
 - 127.0.0.1:8080/customers?state={State}<br>
   returns a webpage with all customers filtered by the specified state e.g  127.0.0.1:8080/customers?state=VALID<br>
   Options include: VALID,INVALID
   
   
 - 127.0.0.1:8080/customers?state={State}&country={Country}<br>
   returns a webpage with all customers filtered by the specified state and country e.g  127.0.0.1:8080/customers?country=Morocco&state=VALID
