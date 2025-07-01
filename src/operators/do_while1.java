package operators;

public class do_while1 {
    public static void main(String[] args) {
        int i=1;
        do {
            System.out.println("This is a body and will be executed first");
            System.out.println(i);
            i++;
        } while(i<10);

    }
}
