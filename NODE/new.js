let i=0;
for(i;i<10;i++){
    console.log(i);

}
const newModule = require("./new1.js");//new1.js is the file we are importing
// This will import the value exported from new1.js
console.log(newModule);
// This will log the value 123
const f = require("fruits");
// This will import the array of fruits from the index.js file in the fruit.js directory

console.log(f);
// This will log an array of fruit objects with their propertie  
console.log(f[0].name); // Accessing the name property of the first fruit object
console.log(f[1].color); // Accessing the color property of the second fruit object