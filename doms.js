class Hello{
    //class should contain only one constructor and it can have any no of classes
    constructor(fname, lname, age){
        this.fn=fname;
        this.ln=lname;
        this.a=age;


    }
    //inside class we should not write function keyword
    full_name()
    {
        return this.fn +' '+this.ln;
    }
}
let hello=new Hello('sindhura','Tallapaneni',22);
console.log('Fullname: '+hello.full_name());