public class Main
{

	   
static void push(char x,char stack[], int top)
{
    stack[++top] = x;
    //return 1;
    System.out.print(stack[top]);
}
 
static char pop(char stack[] ,int top )
{
    char r;
    if(top == -1)
    {
    System.out.println("underflow");
        return 0;
    }
    else
    {
         r= pop(stack ,top--);
         System.out.println(r);
        return r;
    }
}
static void conv(int stack[] ,char temp[] , int top)
{
    for(int i = 0;i<=stack.length-1;i++)
    {
    if(stack[i] >= 'a' && stack[i] <='z' || stack[i] >='A' && stack[i] <='z')
    {
        temp[i]=stack[i];
    }
    else if(stack[i]=='(')
    {
        
        {
            push(x ,stack , top );
        }
        else if(stack[i]==')')
        {
            while(stack[top]!=')')
            {
            pop(stack , stack.length-1);
            }
        }
        else if(stack[top]==-1){
            System.out.println("invalid expression");
        }
        else 
        {
            pop()
        }
    }
    else
    {
    //////precedence code write here
    }
    }
    
}


	public static void main(String[] args) {
char stack[]= new char[20];
char temp[] = new char[stack.length-1];
int top = -1;
char x = 'a';
char y = 'b';
char z='c';
push(x,stack,top);
push(y,stack,top);
push(z,stack,top);
pop(stack ,top);
	}
}
