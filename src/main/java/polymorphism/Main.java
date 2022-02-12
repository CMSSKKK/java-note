package polymorphism;

public class Main {

    public static void main(String[] args) {
        Penguin pororo = new Penguin();

        pororo.name = "뽀로로";
        pororo.habitat = "남극";

        Animal pingu = new Penguin();

        pingu.name= "핑구";

        pororo.showName(); //안알랴줌ㅎㅎ
        pororo.showHabitat(); //나는 남극에 살아
        pororo.showName(pingu.name); //핑구 안녕, 내이름은 뽀로로야

        pingu.showName(); //안알랴줌ㅎㅎ
    }
}
