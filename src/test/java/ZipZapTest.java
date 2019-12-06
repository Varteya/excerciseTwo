import org.junit.Test;

import static org.junit.Assert.*;

public class ZipZapTest {

    //GIVEN
    ZipZap zipZap = new ZipZap();

    @Test
    public void shouldTestEmptyString() {
        //WHEN
        String answer = zipZap.zipZap("");

        //THEN
        assertEquals("", answer);
    }

    @Test (expected = IllegalArgumentException.class)
    public void shouldTestNull() {
        //WHEN
        String answer = zipZap.zipZap(null);

        //THEN
        fail("Expected IllegalArgumentException");
    }

    @Test
    public void shouldTestShortStrings() {
        //WHEN
        String answer1 = zipZap.zipZap("");
        String answer2 = zipZap.zipZap("z");
        String answer3 = zipZap.zipZap("zp");
        String answer4 = zipZap.zipZap("zz");
        String answer5 = zipZap.zipZap("pp");
        String answer6 = zipZap.zipZap("ap");
        String answer7 = zipZap.zipZap("za");
        String answer8 = zipZap.zipZap("sd");


        //THEN
        assertEquals("", answer1);
        assertEquals("z", answer2);
        assertEquals("zp", answer3);
        assertEquals("zz", answer4);
        assertEquals("pp", answer5);
        assertEquals("ap", answer6);
        assertEquals("za", answer7);
        assertEquals("sd", answer8);
    }

    @Test
    public void shouldDoZipZap() {
        //WHEN
        String answer1 = zipZap.zipZap("zzzp");
        String answer2 = zipZap.zipZap("zppppp");
        String answer3 = zipZap.zipZap("zip");
        String answer4 = zipZap.zipZap("zsaaszspz");
        String answer5 = zipZap.zipZap("zzpp");
        String answer6 = zipZap.zipZap("zipzipzip");
        String answer7 = zipZap.zipZap("zPtppztppp");

        //THEN
        assertEquals("zzp", answer1);
        assertEquals("zpppp", answer2);
        assertEquals("zp", answer3);
        assertEquals("zsaaszpz", answer4);
        assertEquals("zpp", answer5);
        assertEquals("zpzpzp", answer6);
        assertEquals("zPtppzppp", answer7);
    }

    @Test
    public void shouldNotDoZipZap() {
        //WHEN
        String answer1 = zipZap.zipZap("zzzffp");
        String answer2 = zipZap.zipZap("zaappppp");
        String answer3 = zipZap.zipZap("zpaaa");
        String answer4 = zipZap.zipZap("zsaaszsapz");
        String answer5 = zipZap.zipZap("zzaapp");
        String answer6 = zipZap.zipZap("zispzdipzgip");
        String answer7 = zipZap.zipZap("zPtppGYOztIUppp");

        //THEN
        assertEquals("zzzffp", answer1);
        assertEquals("zaappppp", answer2);
        assertEquals("zpaaa", answer3);
        assertEquals("zsaaszsapz", answer4);
        assertEquals("zzaapp", answer5);
        assertEquals("zispzdipzgip", answer6);
        assertEquals("zPtppGYOztIUppp", answer7);
    }

}