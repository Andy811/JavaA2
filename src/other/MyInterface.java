package other;

public interface MyInterface {
    JavaA2 a2 = new JavaA2();


    String pubStrFromA2 = a2.a2PublicString;
    String proStrFromA2 = a2.a2ProtectedString;
    String defStrFromA2 = a2.a2DefaultString;
   // String priStrFromA2 = a2.priString;  //嘗試取得private string





    String IndefString = "default string in interface";

     default void deMethod(){
         System.out.println("default method in MyInterface");
     };

     void pubMethod();

}
