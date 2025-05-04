class Solution {
    public int result(int n,int m,char op)
    {
        int res=0;
       switch(op)
       {
          case '+':res=n+m;
          break;
          case '-': res=n-m;
          break;
          case '*':res=n*m;
          break;
          case '/': {
            if(m==0)
            {
                return 0;
            }
            res=n/m;
            break;
          }
          default: break;
       }
       return res;
    }
    public int evalRPN(String[] tokens) {
        Stack<String> stack=new Stack<>();
        int res=0;
        int finalResult=0;
      for(int i=0;i<tokens.length;i++)
      {
         String token = tokens[i];
         if(token.equals("+")||token.equals("-")||token.equals("*")||token.equals("/"))
         {
            int num1=Integer.valueOf(stack.pop());
            int num2=Integer.valueOf(stack.pop());
            res=result(num2,num1,token.charAt(0));
           stack.push( String.valueOf(res));
         }
         else
         {
            stack.push(token);
         }
      }
      finalResult= Integer.valueOf(stack.pop());
      return finalResult;
    }
}