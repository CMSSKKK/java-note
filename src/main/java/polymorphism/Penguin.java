package polymorphism;

public class Penguin extends Animal{

    public String habitat;

    public void showHabitat() {
        System.out.printf("나는 %s에 살아\n",habitat);
    }

    @Override
    public void showName() {
        System.out.println("안알랴줌ㅎㅎ");
    }

    //오버로딩
    public void showName(String name) {
        System.out.printf("%s 안녕, 내이름은 %s야\n",name,this.name);
    }
}
