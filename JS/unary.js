let a=10;
let b=20;
let c=a++;

console.log(c); // 1
let d=++a;
console.log(d); // 2
console.log(a); // 12
let m='10';
let n=10;
console.log(n==m); // true, loose equality
console.log(n===m);// false, strict equality
console.log(n!=m); // false, loose inequality
console.log(n!==m); // true, strict inequality
console.log(n<m); // false, less than
console.log(n>m); // false, greater than