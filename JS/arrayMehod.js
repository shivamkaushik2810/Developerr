let arr=[1,2,3,4,5,8,10,12,15,20,25,30  ];
arr.forEach(element => {
    console.log(element); // Prints each element of the array
    
});


arr.map(element => {
    console.log(element * 2); // Prints each element multiplied by 2
});


//reduce method
// The reduce method executes a reducer function (that you provide) on each element of the array, resulting in a single output value.
 let finsl=arr.reduce((accumulator, currentValue) => (accumulator + currentValue) );
 console.log(finsl);

 //default parameter
 function add(a, b = 5) {
    return a + b;
}

//with array literal
let arr2 = [1, 2, 3, 4, 5];
let newarr=[...arr2];
console.log(newarr); // Prints [1, 2, 3, 4, 5]
//or
let arr3 = [1, 2, 3, 4, 5];
let newarry=[...arr3, 6, 7, 8];
console.log(newarr);


let st=[..."shivam"];
console.log(st); // Prints ['s', 'h', 'i', 'v', 'a', 'm']

//Using spread operator with objects
let obj={ name: "John", age: 30 };
let newObj = { ...obj, city: "New York" };
console.log(newObj); // Prints { name: 'John', age: 30, city: 'New York' }


//rest operator
function sum(...numbers) {
    return numbers.reduce((acc, curr) => acc + curr, 0);
}

//destructuring arrays
let tesr={
    name: "John",
    age: 30,
    city: "New York"        

};
let { name, age, city } = tesr;
console.log(name); // Prints 'John'
console.log(age); // Prints 30
console.log(city); // Prints 'New York' 
let{name: userName, age: userAge} = tesr;
console.log(userName); // Prints 'John'
console.log(userAge); // Prints 30  

//some method
// The some() method tests whether at least one element in the array passes the test implemented by the provided function.
// It returns a Boolean value.
[10, 20, 30].some((element) => {
    console.log(element); // Prints each element of the array
    return element  >   15; // Returns true if any element is greater than 15
});

//every method
// The every() method tests whether all elements in the array pass the test implemented by the provided function.
// It returns a Boolean value.  

[10, 20, 30].every((element) => {
    console.log(element); // Prints each element of the array
    return element < 40; // Returns true if all elements are less than 40
});

//filter method
// The filter() method creates a new array with all elements that pass the test implemented by the provided function.
let filteredArray = [10, 20, 30, 40, 50].filter((element) => {
    console.log(element); // Prints each element of the array
    return element > 25; // Returns elements greater than 25
});



//filter method 






    