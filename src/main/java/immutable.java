public class HelloWorld{
     int mut = 10;
     public int multiplyBy10 (int x) {
         return this.mut*x;
     }
     public String createSomething () {
         this.mut = 99;
         return "created something awesome!";
     }
     public static void main(String []args){
        HelloWorld hello = new HelloWorld();

        System.out.println(hello.multiplyBy10(5));
        System.out.println(hello.createSomething());
        System.out.println(hello.multiplyBy10(5));
     }
}