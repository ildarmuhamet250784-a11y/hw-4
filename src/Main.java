//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        var age=20;
        boolean adult=age>=18;
        if (adult){
            System.out.println("Если возраст человека равен 18 или больше, то он совершеннолетний");
        }else {
            System.out.println("Если возраст человека меньше 18, он не достиг совершеннолетия и нужно немного подождать");

        }


    }
}