package other;

public interface MyInterface {

    public String inPubString = "public string in interface";
    String inDefString = "default string in interface";
//    protected String inProString = "proteceted string in interface";//嘗試protected修飾子
//    private String inPriString = "private string in interface";//嘗試private修飾子


    //嘗試取得A2的屬性
    JavaA2 a2 = new JavaA2();
    String pubStrFromA2 = a2.a2PublicString;
    String proStrFromA2 = a2.a2ProtectedString;
    String defStrFromA2 = a2.a2DefaultString;
    // String priStrFromA2 = a2.priString;  //嘗試取得private string



    void inPubMethod();

    default void deMethod() {
        System.out.println("default method in MyInterface");
    }



}
