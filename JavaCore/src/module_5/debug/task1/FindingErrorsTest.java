package module_5.debug.task1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

public class FindingErrorsTest {
    @Test
    public void testCalulate() {
        assertTrue(1.5 == FindingErrors.calculateLinearFunction(1, 2, 1, 1), "Not found");
    }

    @Test
    public void testRespond() {
        String x = "";
        x += 'H';
        x += "ello";

        assertTrue(FindingErrors.respond(x).equals("World!"), "Not found");
    }

    @Test
    public void testReverse() {
        try {
            FindingErrors.reverse("a");
        } catch (Exception e) {
            fail("Not found");
        }
    }

    @Test
    public void testFind42() {
        try {
            FindingErrors.findFirst42(new int[] { 1, 2, 3 });
        } catch (Exception e) {
            fail("Not found");
        }
    }

    @Test
    public void testCopyNonZeros() {
        int[] res = FindingErrors.copyNonZeros(new int[] { -1, 2, 0 });
        assertTrue(Arrays.equals(res, new int[] { -1, 2 }), "Not found");
    }

    @Test
    public void testPrime() {
        assertTrue(!FindingErrors.isPrime(4), "Not found");
    }

    @Test
    public void testCopyArrayFromTo() {
        try {
            FindingErrors.copyArrayFromTo(new int[] { 1, 2, 3 }, 5, 4);
        } catch (Exception e) {
            fail("Not found");
        }
    }

    @Test
    public void testFind42Again() {
        try {
            FindingErrors.findFirst42Again(new int[] { 1, 2, 3 });
        } catch (Exception e) {
            fail("Not found");
        }
    }

    @Test
    public void testFind42Or1337() {
        try {
            assertTrue(FindingErrors.findFirst42Or1337(new int[] { 1, 2, 42 }) == 2, "Not found");
        } catch (Exception e) {
            fail("Not found");
        }
    }

    @Test
    public void testReverseAgain() {
        try {
            FindingErrors.reverseAgain("a");
        } catch (Exception e) {
            fail("Not found");
        }
    }
}
