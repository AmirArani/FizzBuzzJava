import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    // Make it works -> Sabet konim
    // Make it Clean
    // Make it Fast

    // Hop :
    // Agar adad bar 3 bakhsh pazir boud  -> Fizz
    // Agar adad bar 5 bakhsh pazir boud  -> Buzz
    // Agar adad ham bar 3 va ham bar 5 bakhsh pariz boud -> FizzBuzz

    // Test Driven Development (TDD) -> Shekastan moshkel be bakhsh haye kochek tar
    //                              -> agar code gherez shod bayad sabzesh konim
    //                              -> be mahze inke code sabz shod mirim ghemate badi
    //                              -> Ghanon 3 : vaghty 3 ta halat natije yeksan midan -> tamame halt haye baadi haman natije ra midahand
    // Rahat tarin halat kodom halate ? Use case
    @Test
    void should_return_1_given_1() {
        // Given
        FizzBuzz fizzBuzz = new FizzBuzz();

        // When
        String natije = fizzBuzz.play(1);

        // Then
        assertEquals("1", natije);
    }

    @Test
    void should_return_2_given_2() {
        // Given
        FizzBuzz fizzBuzz = new FizzBuzz();

        // When
        String natije = fizzBuzz.play(2);

        // Then
        assertEquals("2", natije);
    }

    @Test
    void should_return_4_given_4() {
        // Given
        FizzBuzz fizzBuzz = new FizzBuzz();

        // When
        String natije = fizzBuzz.play(4);

        // Then
        assertEquals("4", natije);
    }

    @Test
    void should_return_3_given_Fizz() {
        // Given
        FizzBuzz fizzBuzz = new FizzBuzz();

        // When
        String natije = fizzBuzz.play(3);

        // Then
        assertEquals("Fizz", natije);
    }

    @Test
    void should_return_6_given_Fizz() {
        // Given
        FizzBuzz fizzBuzz = new FizzBuzz();

        // When
        String natije = fizzBuzz.play(6);

        // Then
        assertEquals("Fizz", natije);
    }

    @Test
    void should_return_9_given_Fizz() {
        // Given
        FizzBuzz fizzBuzz = new FizzBuzz();

        // When
        String natije = fizzBuzz.play(9);

        // Then
        assertEquals("Fizz", natije);
    }

    @Test
    void should_return_5_given_Buzz() {
        // Given
        FizzBuzz fizzBuzz = new FizzBuzz();

        // When
        String natije = fizzBuzz.play(5);

        // Then
        assertEquals("Buzz", natije);
    }

    @Test
    void should_return_15_given_FizzBuzz() {
        // Given
        FizzBuzz fizzBuzz = new FizzBuzz();

        // When
        String natije = fizzBuzz.play(15);

        // Then
        assertEquals("FizzBuzz", natije);
    }

    @Test
    void should_return_30_given_FizzBuzz() {
        // Given
        FizzBuzz fizzBuzz = new FizzBuzz();

        // When
        String natije = fizzBuzz.play(30);

        // Then
        assertEquals("FizzBuzz", natije);
    }

}
