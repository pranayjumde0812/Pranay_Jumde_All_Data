package AnonymousClasses;

public class One {
    void show() {
        System.out.println("I am show method of One");
    }
}

class Two {

    One one = new One() {
        @Override
        void show() {
            System.out.println("I'm Show method of AIC in Two");
            display();
//            showingNewMethod();
        }

        void display() {
            System.out.println("Im display method in AIC in Two");
        }


        // if we define new method inside AIC then we can use that method only in same scope
        // display method is not directly available outside this scope
    };

    void showingNewMethod() {
        one.show();
    }
}

class MainAIC {
    public static void main(String[] args) {

        One one1 = new One();
        one1.show();


        Two two = new Two();
//        two.one.show();

        two.showingNewMethod();
    }
}