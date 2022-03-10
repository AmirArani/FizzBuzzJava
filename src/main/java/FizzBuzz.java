public class FizzBuzz {

    public String play(int adad) {

        if (adad % 3 == 0){
            if (adad % 5 == 0){
                return "FizzBuzz";
            }
            return "Fizz";
        }else if (adad % 5 == 0){
            return "Buzz";
        }

        return String.valueOf(adad);
    }

}
