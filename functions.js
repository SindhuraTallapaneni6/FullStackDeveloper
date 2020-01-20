// function add(a,b=1){
//     return a+b;
// }
// console.log('Sum :'+add());

// function fun(...p){
//     console.log(p.length)
// }
// fun();
// fun(1, 3);

//FUNCTION CONSTRUCTOR...
//  var fun=new Function("a" ,"b" ,"return a*b;");
//  function product()
//  {
//      var result=fun(3,4);
//      console.log(result);
//  }
// product();

// //RECURSIVE FUNCTION
//  function factorial(num){
//      if(num<=0)
//      {
//          return 1;
//      }
//      else{
//          return (num*factorial(num-1));
//      }

// }
// console.log(factorial(6));

//ANONYMOUS RECURSIVE FUNCTION
// (function(){
//     var msg="hello";
//     console.log(msg);
// }())

//LAMBDA EXPRESSION//single line
// var foo= (x) =>10+x
// console.log(foo(10));

//LAMBDA STATEMENT// no parameters
// var ex= ()=>{
//     console.log('hello');
// }
// ex();

//IIFE

// var main = function() { 
//     var loop = function() { 
//        for(var x = 0;x<5;x++) {
//           console.log(x); 
//        } 
//     }(); //immediately invoked function
//    // console.log("x can not be accessed outside the block scope x value is :"+x); 
//  } 
//  main();
 
