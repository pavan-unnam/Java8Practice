package innerClass.nested;

public class OuterAnonymousExample {

    void  print () {
        System.out.println("iam in method of outer class");
    }
}

class AnonymousClass {
    static OuterAnonymousExample out = new OuterAnonymousExample () {
        @Override
        void print() {
            System.out.println("iam in method of sub anonymus class");
            super.print();
        }
    };
}
