package Java8Practice.nested;


public class AnonymusMain {

    public static void main(String[] args) {

        //anonymus examples
       OuterAnonymousExample out = new OuterAnonymousExample() {
            @Override
            void print() {
                super.print();
            }
        };
        out.print();

    }
}

