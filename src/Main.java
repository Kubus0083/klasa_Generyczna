public class Main {
    public static void main(String[] args) {
        Conteiner<Integer> intContainer = new Conteiner<>();
        intContainer.add(1);
        intContainer.add(2);
        intContainer.add(3);
        System.out.println(intContainer.toString());
        intContainer.remove(2);
        System.out.println(intContainer.toString());

        Conteiner<String> stringContainer = new Conteiner<>();
        stringContainer.add("Jeden");
        stringContainer.add("Dwa");
        System.out.println(stringContainer.toString());
        stringContainer.remove("Jeden");
        System.out.println(stringContainer.toString());

        MultiCon<Integer,String> Mul = new MultiCon<>();
        Mul.add(1,"Jeden");
        Mul.add(2,"Dwa");
        System.out.println(Mul.toString());
        Mul.remove(1);
        System.out.println(Mul.toString());
    }
}