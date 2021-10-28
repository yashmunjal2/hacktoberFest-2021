var url  = "https://jsonplaceholder.typicode.com/users";
fetch(url)
    // Handle success
    .then(response => response.json())  // convert to json
    .then(json => console.log(json))    //print data to console
    .catch(err => console.log('Request Failed', err)); // Catch errors

//this will all the demo api and print the data accordingly