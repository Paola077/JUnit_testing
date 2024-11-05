import org.example.FizzBuzz;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
   @Test
   @DisplayName("Test si el número es divisible por 3")
    void test_whenTheNumberIsDivisibleByThree_thenReturnFizz(){
      //Given
       FizzBuzz fizzbuzz = new FizzBuzz();
      //When
       String results = fizzbuzz.checkNumber(9);
      //Then
       assertEquals("Fizz", results);

   }

   @Test
   @DisplayName("Test si el número es divisible por 5")
    void test_whenTheNumberIsDivisibleByFive_thenReturnBuzz() {
      //Given
      FizzBuzz fizzBuzz = new FizzBuzz();
      //When
      String results = fizzBuzz.checkNumber(10);
      //Then
      assertEquals("Buzz",results);
   }

   @Test
   @DisplayName("Test si el número es divisible por 5")
   void test_whenTheNumberIsDivisibleByThreeAndFive_thenReturnFizzBuzz() {
      //Given
      FizzBuzz fizzBuzz = new FizzBuzz();
      //When
      String results = fizzBuzz.checkNumber(15);
      //Then
      assertEquals("FizzBuzz",results);
   }

   @Test
   @DisplayName("Test si el número es divisible por 5")
   void test_whenTheNumberIsNotDivisibleByThreeAndFive_thenReturnTheNumber() {
      //Given
      FizzBuzz fizzBuzz = new FizzBuzz();
      //When
      String results = fizzBuzz.checkNumber(22);
      //Then
      assertEquals("22",results);
   }
}
