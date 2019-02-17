class test
{
test()
{
this (10);
system.out .println("default constructor call");
}
test(int x)
{
this(10,20);
system.out.println(x);
}
test(int x,int y)
{
system.out.println(x+y);
}
public static void main()
{
new test();
}
}
