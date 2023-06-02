package reflectionAPI;

public class MyClass {
        private String privateField;

        public MyClass() {
            this.privateField = "Hello, Reflection!";
        }

        private void privateMethod() {
            System.out.println("Private method invoked.");
        }
}
