package com.github.jitpack;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AppTest 
{
    App app = new App();

    @Test
    public void testApp()
    {
        assertEquals("Hello Jenkins!", app.greet("Jenkins"));

    }

    @Test
    public void testTrue()
    {
        assertTrue( true );
    }
}
