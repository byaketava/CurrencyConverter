# Currency Converter

>This is a simple currency converter project that converts a certain amount of currency from one to another using an API from [currency.getgeoapi.com](https://currency.getgeoapi.com/). 

## Technologies Used
- Java 17
- Spring Boot
- Maven

## Getting Started
To get started with this project, you need to use your own API key from Geo API. You can sign up for an API key [here](https://currency.getgeoapi.com/).

## Installation
1. Clone the repository
2. Create an application.properties file and add the following line:
```properties
api.key=YOUR_API_KEY_HERE
```
3. Build the project and run the application
The application will start on `http://localhost:8080`

## API Endpoints
---
### Сonvert a certain amount of currency
#### Request
* Structure:
`localhost:8080/convert/{fromCurrency}/{toCurrency}/{amount}`

* Example:
`localhost:8080/convert/BYN/USD/1`
#### JSON response
```JSON
{
    "status": "success",
    "updated_date": "2024-02-28",
    "base_currency_code": "BYN",
    "amount": 1.0,
    "base_currency_name": "Belarusian ruble",
    "rates": {
        "USD": {
            "currency_name": "United States dollar",
            "rate": "0.3087",
            "rate_for_amount": "0.3087"
        }
    }
}
```
---
