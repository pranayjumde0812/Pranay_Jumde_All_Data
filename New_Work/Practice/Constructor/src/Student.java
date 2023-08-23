 class Student {

    String name;
    int age;

    Student(String name ){

//        this(age,name);
        this.name=name;
    }
     Student(int age, String name){
         this.age=age;
         this.name=name;
     }

     String showName(){
        return name;
     }

}
