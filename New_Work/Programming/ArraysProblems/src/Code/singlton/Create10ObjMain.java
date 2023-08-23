package Code.singlton;

public class Create10ObjMain {
    public static void main(String[] args) {
        try{
            CreateOnly10Objects obj1 = CreateOnly10Objects.getInstance();
            CreateOnly10Objects obj2 = CreateOnly10Objects.getInstance();
            CreateOnly10Objects obj3 = CreateOnly10Objects.getInstance();
            CreateOnly10Objects obj4 = CreateOnly10Objects.getInstance();
            CreateOnly10Objects obj5 = CreateOnly10Objects.getInstance();
            CreateOnly10Objects obj6 = CreateOnly10Objects.getInstance();
            CreateOnly10Objects obj7 = CreateOnly10Objects.getInstance();
            CreateOnly10Objects obj8 = CreateOnly10Objects.getInstance();
            CreateOnly10Objects obj9 = CreateOnly10Objects.getInstance();
            CreateOnly10Objects obj10 = CreateOnly10Objects.getInstance();

            System.out.println(obj1);
            System.out.println(obj2);
            System.out.println(obj3);
            System.out.println(obj4);
            System.out.println(obj5);
            System.out.println(obj6);
            System.out.println(obj7);
            System.out.println(obj8);
            System.out.println(obj9);
            System.out.println(obj10);
           CreateOnly10Objects obj11 = CreateOnly10Objects.getInstance();
            System.out.println(obj11);
//            CreateOnly10Objects obj12 = CreateOnly10Objects.getInstance();

        }catch (Exception e){
            System.out.println("10 Objects created");
        }
    }
}
