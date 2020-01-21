class Rectangle{
    constructor(height, width){
        this.height=height;
        this.width=width;
    }
    test(){
        console.log('height of the rectangle is: ',+this.height);
        console.log('width of the rectangle is: ',+this.width);
    }
}
let rectobj=new Rectangle(10, 20);
rectobj.test();
