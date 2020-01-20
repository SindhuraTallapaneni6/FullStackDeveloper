//OBJECT INITIALIZERS

// var person={
//     fname:"sindhura",
//     lname:"Tallapaneni",
//     fun:function(){
//         return "hello";
//     }
// };
// console.log(person.fname);
// console.log(person.lname);
// console.log(person.fun());

//OBJECT CONSTRUCTORS
// var myCar=new Object();
// myCar.type="BMW";
// myCar.colour="black";
// myCar.year=2019;
// console.log(myCar["type"]);
// console.log(myCar["colour"]);
// console.log(myCar["year"]);

var myCar = new Object()  
var propertyName = "make"; 
myCar[propertyName] = "Ford"; 
console.log(myCar.make)