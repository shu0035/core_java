class test 
{
int x,y;
test(int x,int y)
{
this.x=x;
this.y=y;
}
test(test z)
{
this.x=z.x;
this.y=z.y;
}
void show()
{
system.out.println(x);
system.out.println(y);
}
public static void main(String...s)
{
test t1=new test(10,20);
t1.show();
test t2=new test(t1);
t2.show();
}
}
