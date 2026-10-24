abstract class shape {
    abstract void area();
}
class circle extends shape{
    double radius;
circle(double r){
    this.radius=r;
}
    void area()
    {
        System.out.println("Area of circle is : "+(3.14*radius*radius));
    }
}
class rectangle extends shape{
    double length,breadth;
    rectangle(double l,double b){
        this.length=l;
        this.breadth=b;
    }
    void area()
    {
        System.out.println("Area of rectangle is : "+(length*breadth));
    }
}
class triangle extends shape{
    double base,height;
    triangle(double b,double h){
        this.base=b;
        this.height=h;
    }
    void area()
    {
        System.out.println("Area of triangle is : "+(base*height)/2);
    }
}
class p_5a {
    public static void main(String[] args) {
        shape arr[]=
                {
                        new circle(5),
                        new rectangle(10,5),
                        new triangle(2,6),
                };
        for(shape s:arr){
            s.area();
        }
    }
}

