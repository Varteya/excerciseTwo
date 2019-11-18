import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZipZapTest {

    @Test
    public void shouldTestExtremeValues() {
        //GIVEN
        ZipZap zipZap = new ZipZap();

        //WHEN
        String answer1 = zipZap.zipZap("");
        String answer2 = zipZap.zipZap("z");
        String answer3 = zipZap.zipZap("zp");
        String answer4 = zipZap.zipZap("zz");
        String answer5 = zipZap.zipZap("pp");


        //THEN
        assertEquals("", answer1);
        assertEquals("z", answer2);
        assertEquals("zp", answer3);
        assertEquals("zz", answer4);
        assertEquals("pp", answer5);
    }

    @Test
    public void shouldDoZipZap() {
        //GIVEN
        ZipZap zipZap = new ZipZap();

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
        //GIVEN
        ZipZap zipZap = new ZipZap();

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