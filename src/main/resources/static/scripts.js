/**
 * 
 */

 // Create a request variable and assign a new XMLHttpRequest object to it.
 var request = new XMLHttpRequest(); // Open a new connecton, using the GET
										// request on the URL endpoint
 request.open('GET', 'http://localhost:8080/bill', true);
 
  request.onload = function() { // Begin accessing JSON data var data =
 JSON.parse(this.response);
 
 data.forEach(bill.foodItems=>{ 
	 console.log(foodItems);
 });
}
 

// Send request
request.send();

/*
 * //Replace ./data.json with your JSON feed fetch('http://localhost:8080/menu')
 * .then(response => { return response.json() }) .then(data => { // Work with
 * JSON data here console.log(data.id); console.log(data.description); })
 * .catch(err => { // Do something for an error here console.log('Error
 * encountered'); // console.log(err); })
 * 
 */



