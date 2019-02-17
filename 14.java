class emp
{
int eid;
String ename,cname;
{
this.eid=eid;
this.ename=ename;
this.cname=cname;
}
void showemp()
{
system.out.println(eid);
system.out.println(ename);
system.out.println(cname);
}
public static void main(String...s)
{
emp e1=new emp(1,"ram","tcs");
e1.showemp();
emp e2=new emp(2,"puja","tcs");
e2.showemp();
}
}

