# OOP-Spring-Boot-Backend-Frontend-Project

Simple Project written mostly in Java

- Backend (Spring Boot Java) 
- Frontend (HTML/CSS/JS)+ PostgreSQL Database
- For DATABASE (tested on macOS Ventura 13.3)

---
## Installation and Setup

### macOS
- InteliJ IDEA Community/Ultimate

- for DB (macOS)
```
brew install postgresql@15
```

- After installing with homebrew, you will need to export the bin path in zshell or smth xd, on my machine it was in cellar
```
export PATH=$PATH:/usr/local/Cellar/postgresql@15/15.2_3/bin
```
- Postgres.app (macOS only)

GET and POST ENDPOINTS (FOR POSTMAN/INSOMINA Users) :

- POST
```
http://localhost:8080/api/v1/user + JSON BODY
```

- JSON BODY
```json
{
		"name": "nameOfSubscriber",
		"subscriptionDate": "2023-04-16",
		"subscriptionLocalTime": "18:55:41",
		"preferredWorkoutLocalTime": "15:00:00",
		"ipAddr": "123.123.123.55",
		"attendanceStatus": "GOING",
		"subscribed": true
}
```

- GET (List of subscribed users)
```
http://localhost:8080/api/v1/user/subscribers
```


## LICENSE
MIT
- The logo is public domain (see the html comment for more info).
