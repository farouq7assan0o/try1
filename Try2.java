 try{
         System.out.println("start");
         try{
         int x = 12,y=0;
         int res = x/y;
         }catch(NullPointerException e){
             System.out.println("A");
         }
         System.out.println("finish");
     }catch(ArithmeticException e){
         System.out.println("B");
     }

///////////////////////////////////////////////////  


 int res=0;
        for(int i=0;i<10;i++){
            try{
            res = i/(i-5);
            }catch(ArithmeticException e){
                System.out.println("Exception occured");
                res = 0;
            }
            System.out.println(res);
        }
/////////////////////////////////////////////////////
throw:

static void func1(){
        throw new ArithmeticException("demo");
                
    }
    public static void main(String[] args) {
        func1();
    }
}



///////////////////////////////////
throws:

if a method causes an exception, then it must specify
this behavior so that the callers of the method can gurd themselves.

 static void func1() throws Exception{
        throw new Exception("demo");
                
    }
    public static void main(String[] args)  {
       
        try {
            func1();
        } catch (Exception e) {
            System.out.println("exception occured");
        }
    }

/////////////////////////////
 static void func1() throws Exception{
        throw new Exception("demo");
                
    }
    static void func2()throws Exception{
       func1();
    }
    public static void main(String[] args)  {
      
         try {
             func2();
        } catch (Exception e) {
            System.out.println("exception occured");
        }
    }

//////////////////////////////////////////
 static void func1() throws StackOverflowException{
        throw new StackOverflowException("demo");
                
    }
    
    public static void main(String[] args)  {
      
         try {
             func1();
        } catch (StackOverflowException e) {
            System.out.println("exception occured");
        }
    }