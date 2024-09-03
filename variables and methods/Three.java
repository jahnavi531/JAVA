class Test{
    static int x=100;
    int y=200;
    public static void main(String[] args){
        Test t = new Test();
        t.call(x:300);
    }
    public void call(int x){
        System.out.println(x);
        Test t = new Test();
        this.x = 101;
        y = 201;
        System.out.println(y);
         System.out.println(Test.x);
         System.out.println(t.x);
         System.out.println(t.y);  

    }
}