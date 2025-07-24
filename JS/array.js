let name=["shivam","kaushik","aaryan","shiva"];
console.log(name[0]);
console.log(name[1]);
console.log(name[2]);
console.log(name[3]);
console.log(name.length);
console.log(name[name.length-1]); // Accessing the last element
console.log(typeof name); // Checking the type of the array





//creatiom of array
let numbers = [1,2,3,4,5,6,7,8,9,10];
console.log(numbers);
//array methods
console.log(numbers.push(11));
console.log(numbers.pop()); // Removes the last element
console.log(numbers.shift()); // Removes the first element
console.log(numbers.unshift(1)); // Adds an element to the beginning
console.log(numbers);
console.log(numbers.indexOf(5)); // Returns the index of the first occurrence of 5
console.log(numbers.includes(5)); // Checks if 5 is present in the array
console.log(numbers.reverse());// Reverses the array
console.log(numbers.sort());// Sorts the array in ascending order
console.log(numbers.slice(2, 5)); // Returns a shallow copy of a portion of the array
console.log(numbers.splice(2, 3)); // Removes 3 elements starting from index 2
console.log(numbers);