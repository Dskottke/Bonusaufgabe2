import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class MainTest {
    @Test
    public void tenIsError(){
        //given
        int number = 10;
        //when
        String actual = Main.getNumberString(number);
        //then
        assertEquals("error",actual);
    }
    @Test
    public void nullIsError(){
        //given
        int number = 0;
        //when
        String actual = Main.getNumberString(number);
        //then
        assertEquals("error",actual);
    }
    @Test
    public void oneIs1(){
        //given
        int number = 1;
        //when
        String actual = Main.getNumberString(number);
        //then
        assertEquals("one",actual);
    }
    @Test
    public void twoIs2(){
        //given
        int number = 2;
        //when
        String actual = Main.getNumberString(number);
        //then
        assertEquals("two",actual);
    }
    @Test
    public void threeIs3(){
        //given
        int number = 3;
        //when
        String actual = Main.getNumberString(number);
        //then
        assertEquals("three",actual);
    }
    @Test
    public void fourIs4(){
        //given
        int number = 4;
        //when
        String actual = Main.getNumberString(number);
        //then
        assertEquals("four",actual);
    }
    @Test
    public void fiveIs5(){
        //given
        int number = 5;
        //when
        String actual = Main.getNumberString(number);
        //then
        assertEquals("five",actual);
    }
    @Test
    public void SixIs6(){
        //given
        int number = 6;
        //when
        String actual = Main.getNumberString(number);
        //then
        assertEquals("six",actual);
    }
    @Test
    public void SevenIs7(){
        //given
        int number = 7;
        //when
        String actual = Main.getNumberString(number);
        //then
        assertEquals("seven",actual);
    }
    @Test
    public void eightIs8(){
        //given
        int number = 8;
        //when
        String actual = Main.getNumberString(number);
        //then
        assertEquals("eight",actual);
    }
    @Test
    public void nineIs9(){
        //given
        int number = 9;
        //when
        String actual = Main.getNumberString(number);
        //then
        assertEquals("nine",actual);
    }



}