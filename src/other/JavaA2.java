package other;

public class JavaA2  implements MyInterface{

    public String a2PublicString = "public string";
    protected String a2ProtectedString = "protected string";
    String a2DefaultString = "default string";
    private String a2PriString = "private string";


    public void test() {
        System.out.println(a2DefaultString);
    }


    @Override
    public void inPubMethod() {

    }//覆寫MyInterface的方法

    protected void protectedMethod() {

    }//protected方法

    void defaultmethod() {

    }//default方法

    private void privateMethod() {

    }//private方法


    //overload example
    public void overloadMethod() {

    }

    public void overloadMethod(int a) {

    }
}
