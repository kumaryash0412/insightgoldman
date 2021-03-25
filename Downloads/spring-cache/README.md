##Project Description
A Spring Boot micro-service that completes the following:

1. Receives string input over an API (http://localhost:8080/palindrome/{inputString})
2. If the output exists in in-memory Cache and H2 database, then it retrieves the output without further calculation
3. Otherwise, it uses an algorithm to calculate the longest palindrome and saves the output in in-memory Cache and H2 database
3. Retrieves the stored palindrome over an API





