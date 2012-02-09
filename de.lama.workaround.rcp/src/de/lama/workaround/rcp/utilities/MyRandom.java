package de.lama.workaround.rcp.utilities;

import java.util.Random;

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;

public class MyRandom
{

    public static Color color()
    {
        int red = generate8BitInteger();
        int green = generate8BitInteger();
        int blue = generate8BitInteger();
        return new Color(null, new RGB(red, green, blue));
    }

    private static int generate8BitInteger()
    {
        Random generate = new Random();
        return generate.nextInt(256);
    }

}
