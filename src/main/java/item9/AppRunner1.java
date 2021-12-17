package item9;

public class AppRunner1 {

    public static void main(String[] args) {
        MyResource myResource = new MyResource();

        try {
            myResource.doSomething();
            MyResource myResource1 = null;
            try {
                myResource1 = new MyResource();
                myResource1.doSomething();
            } finally {
                if(myResource1 != null) {
                    myResource1.close();
                }
            }
        } finally {
            myResource.close();
        }
    }
}
