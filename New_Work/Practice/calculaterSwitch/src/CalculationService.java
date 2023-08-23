public class CalculationService  {


    public void Calculate(String operator) {

        switch (operator){

            case "+":
                AddDouble addDouble=new AddDouble();
                addDouble.getCAlculatedValue(3,4);
                break;
            case "-":
               SubDouble subDouble= new SubDouble();
               subDouble.getCAlculatedValue(7,2);
                break;
            case "*":
                MultiDouble multiDouble = new MultiDouble();

                multiDouble.getCAlculatedValue(7,2);
                break;
        }
        }


    }

