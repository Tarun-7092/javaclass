abstract class GraphicObject
{
    public abstract double CalculateArea();
}
class circle extends GraphicObject
{
    float radius;
    circle(float radius)
    {
        this.radius = radius;
    }
    @Override
    public double CalculateArea()
    {
        return 3.14f*radius*radius;
    }
}
class rectangle extends GraphicObject
{
    float length,breath;
    rectangle(float length,float breath)
    {
        this.length = length;
        this.breath = breath;
    }
    @Override
    public double CalculateArea()
    {
        return length*breath;
    }
}
class triangle extends GraphicObject
{
    float base,height;
    triangle(float base,float height)
    {
        this.base = base;
        this.height = height;
    }
    @Override
    public double CalculateArea()
    {
        return 0.5f*base*height;
    }
}
class shapes
{
    public static void main (String args[])
    {
        GraphicObject c = new circle(5);
        System.out.println(c.CalculateArea());
        GraphicObject r = new rectangle(5,10);
        System.out.println(r.CalculateArea());
        GraphicObject t = new triangle(5,10);
        System.out.println(t.CalculateArea());
    }
}