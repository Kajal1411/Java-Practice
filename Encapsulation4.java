import java.util.Scanner;
class Login
{
private char[] email=new char[20]; 
private char[] password=new char[20]; 
boolean flag=false;
int i,j;

public void setter(char[] email,char[] password)
{

for(i=0;i<((email.length)-10);i++)
{
 if((email[i]>='A'&&email[i]<='Z')||(email[i]>='a'&&email[i]<='z')||(email[i]>='0'&&email[i]<='9'))
 {
   flag=true;
 }
 else
 {
   flag=false;
   break;
 }
}

if(flag==true)
{
j=(email.length)-10;
if(email[j]=='@')
{
j++;
flag=true;
}
else
flag=false;
if(email[j]=='g'&&flag==true)
{
j++;
flag=true;
}
else
flag=false;
if(email[j]=='m'&&flag==true)
{
j++;
flag=true;
}
else
flag=false;
if(email[j]=='a'&&flag==true)
{
j++;
flag=true;
}
else
flag=false;
if(email[j]=='i'&&flag==true)
{
j++;
flag=true;
}
else
flag=false;
if(email[j]=='l'&&flag==true)
{
j++;
flag=true;
}
else
flag=false;
if(email[j]=='.'&&flag==true)
{
j++;
flag=true;
}
else
flag=false;
if(email[j]=='c'&&flag==true)
{
j++;
flag=true;
}
else


flag=false;
if(email[j]=='o'&&flag==true)
{
j++;
flag=true;
}
else
flag=false;
if(email[j]=='m'&&flag==true)
{
flag=true;
}
}

if(flag==true)
{
System.out.println("Valid email:");
this.email=email;
}
else
{
System.out.println("Invalid email:");
}


flag=false;
for(i=0;i<password.length;i++)
{
 if((password[i]>='A'&&password[i]<='Z')||(password[i]>='a'&&password[i]<='z')||(password[i]>='0'&&password[i]<='9')||password[i]=='$'||password[i]=='*'||password[i]=='#')
 {
   flag=true;
 }
 else
 {
   flag=false;
   break;
 }
}
if(flag==true)
{
this.password=password;
System.out.println("Valid password");

}
else
{
System.out.println("Invalid password");
}
}


public void getter()
{
System.out.println("Email:"+String.valueOf(email));
System.out.println("Password:"+String.valueOf(password));
}
}
class Encapsulation4
{
public static void main(String args[])
{
char[] mailId2=new char[15];
char[] pass2=new char[4];
Scanner sc=new Scanner(System.in);
System.out.println("Enter email:");
String mailId1=sc.next();
mailId2 = mailId1.toCharArray();
System.out.println("Enter password:");
String pass1=sc.next();
pass2=pass1.toCharArray();
Login a=new Login();
a.setter(mailId2,pass2);
a.getter();
}
}























