public class FizzBuzz {

    public String play(int adad) {
        String result = String.valueOf(adad);
        if (ayaBar_3_BakhshPazirHast(adad) && !ayaBar_5_BakhshPazirHast(adad)) {
            result = "Fizz";
        } else if (ayaBar_5_BakhshPazirHast(adad) && !ayaBar_3_BakhshPazirHast(adad)) {
            result = "Buzz";
        } else if (ayaBar_5_BakhshPazirHast(adad) && ayaBar_3_BakhshPazirHast(adad)) {
            result = "FizzBuzz";
        }
        return result;
    }

    private boolean ayaBar_5_BakhshPazirHast(int adad) {
        return adad % 5 == 0;
    }

    private boolean ayaBar_3_BakhshPazirHast(int adad) {
        return adad % 3 == 0;
    }

}
