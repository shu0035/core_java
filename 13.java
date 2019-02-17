class test 
{
int x,y;
test()
{
x=y=10;
}
void show()
{
system.out.println(x);
system.out.println(y);
}
public static void main(String...s)
{
test t1=new test();
t1.show();
test t2=new test();
t2.show();
}
}
