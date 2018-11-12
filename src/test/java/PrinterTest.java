import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void before(){
        printer = new Printer(10, 20);
    }

    @Test
    public void hasSheetsOfPaper(){
        assertEquals(10, printer.getSheetsOfPaper());
    }

    @Test
    public void hasTonerVolume(){
        assertEquals(20, printer.getTonerVolume());
    }

    @Test
    public void canPrint(){
        printer.print(3, 2);
        assertEquals(4, printer.getSheetsOfPaper());
        assertEquals(14, printer.getTonerVolume());
    }

    @Test
    public void canRefillPaper(){
        printer.refill(15);
        assertEquals(25, printer.getSheetsOfPaper());
    }



}
