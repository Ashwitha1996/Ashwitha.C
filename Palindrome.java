class Palindrome
{
public static void main(String args[]){
int r=454,sum=0,temp,t;
t=r;
while(r>0)
{
temp=r%10;
sum=(sum*10)+temp;
r=r/10;
}
if(t==sum)
System.out.println("palindrome number");
else
System.out.println("not palindrome");
}
}