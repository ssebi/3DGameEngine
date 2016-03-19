package base.engine;

import org.lwjgl.input.Keyboard;

public class Game
{
    private Mesh mesh;
    private Shader shader;

    public Game()
    {
	mesh = new Mesh();
	shader = new Shader();

	Vertex[] data = new Vertex[] {  new Vertex(new Vector3f(-1, -1, 0)),
					new Vertex(new Vector3f(0, 1, 0)),
					new Vertex(new Vector3f(1, -1, 0)), };
	mesh.addVertices(data);
	
	shader.addVertexShader(ResourceLoader.loadShader("basicVertex.vs"));
	shader.addFragmentShader(ResourceLoader.loadShader("basicFragment.fs"));
	shader.compileShader();
    }

    public void input()
    {
	if (Input.getKeyDown(Keyboard.KEY_UP))
	    System.out.println("Up pressed");
	if (Input.getKeyUp(Keyboard.KEY_UP))
	    System.out.println("Up released");
	
	if (Input.getMouseDown(1))
	    System.out.println("Mouse pressed" + Input.getMousePosition().toString());
	if (Input.getMouseUp(1))
	    System.out.println("Mouse released" + Input.getMousePosition().toString());
    }

    public void update()
    {

    }

    public void render()
    {
	shader.bind();
	mesh.draw();
    }
}
