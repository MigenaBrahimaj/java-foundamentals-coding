import Perseritje.Human;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        Human human2=  new Human("Kevin");
        Human human3=new Human("j8e","Kevin",26);

        String emri = human.emri;
        human.emri ="Mario";
        System.out.println("Emri :"+ human2.emri);
        System.out.println("id : "+ human3.id);
        System.out.println("Emri :"+ human3.emri );
        System.out.println("Mosha:" + human3.mosha);
    }
}
