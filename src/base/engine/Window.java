package base.engine;

import org.lwjgl.LWJGLException;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

/**
 * @author Sebastian
 *	The Window class takes care of a Window.
 */
public class Window
{

    /**
     * 	Creates a Window with the specified width, height and title.
     * @param width	The width of the Window.
     * @param height	The height of the Window.
     * @param title	The title of the Window.
     */
    public static void createWindow(int width, int height, String title)
    {
	Display.setTitle(title);
	try
	{
	    Display.setDisplayMode(new DisplayMode(width, height));
	    Display.create();
	    Keyboard.create();
	    Mouse.create();
	} catch (LWJGLException e)
	{
	    e.printStackTrace();
	}
    }

    public static void render()
    {
	Display.update();
    }

    public static void dispose()
    {
	Display.destroy();
	Keyboard.destroy();
	Mouse.destroy();
    }

    public static boolean isCloseRequested()
    {
	return Display.isCloseRequested();
    }

    public static int getWidth()
    {
	return Display.getHeight();
    }

    public static int getHeight()
    {
	return Display.getHeight();
    }

    public static String getTitle()
    {
	return Display.getTitle();
    }
}
