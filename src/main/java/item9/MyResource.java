package item9;
// 백기선님 강의 코드
public class MyResource implements AutoCloseable{

    public void doSomething() throws FirstError {
        System.out.println("do something");
        throw new FirstError();
    }

    @Override
    public void close() throws SecondError {
        System.out.println("close my resource");
        throw new SecondError();
    }
}
