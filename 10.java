class emp
{
int eid;
string ename;
static String cname="tcs";
void input(int e,string en)
{
eid=e;
ename=en;
}
static void cchange(String cn)
{
cname=cn;
}
void show()
{
system.out.println(eid);
system.out.println(ename);
system.out.println(cname);
}
public static void main(String...S)
{
cchange("google");
emp e1=new emp();
e1.input(1,"amit");
e1.show();
emp e2=new emp();
e2.input(2);
}
}
