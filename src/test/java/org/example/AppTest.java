package org.example;

import static org.example.StringUtils.removeAccents;
import static org.example.StringUtils.toSnakeCase;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testToSnakeCase()
    {
        String initial="azd Abézàç _c'f--g";
        String expected="azd_Abezac_c_f_g";
        assertEquals(expected,toSnakeCase(initial));
    }
    @Test
    public void testRemoveAccents()
    {
        String initial="āăąēîïĩíĝġńñšŝśûůŷ";
        String expected="aaaeiiiiggnnsssuuy";
        assertEquals(expected,removeAccents(initial));
    }
}
