import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GradebookTester  {
   private GradeBook g1;
   private GradeBook g2;

   @Before
   public void setUp() {
      g1 = new GradeBook(5);
      g2 = new GradeBook(5);
      g1.addScore(50);
      g1.addScore(75);
      g2.addScore(80);
      g2.addScore(95);
   }

   @After
   public void tearDown() {
      g1 = null;
      g2 = null;
   }

   @Test
   public void testAddScore() {
      assertTrue(g1.toString().equals("50.0 75.0 "));
      assertTrue(g2.toString().equals("80.0 95.0 "));
      assertEquals(2, g1.getScoresSize());
      assertEquals(2, g2.getScoresSize());
   }

   @Test
   public void testSum() {
      assertEquals(125.0, g1.sum(), 0.01);
      assertEquals(175.0, g2.sum(), 0.01);
   }

   @Test
   public void testMinimum() {
      assertEquals(50.0, g1.minimum(), 0.01);
      assertEquals(80.0, g2.minimum(), 0.01);
   }

   @Test
   public void testFinalScore() {
      assertEquals(75.0, g1.finalScore(), 0.01);
      assertEquals(95.0, g2.finalScore(), 0.01);
   }
}
