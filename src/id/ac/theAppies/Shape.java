package id.ac.theAppies;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Shape {
    protected int x;
    protected int y;
    protected int width;
    protected int height;
    protected boolean visible;
    protected Image image;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
        visible = true;
    }

    protected void loadImage(String imageName) {
        ImageIcon ii = new ImageIcon(imageName);
        image = ii.getImage();
    }
    
    protected void getImageDimensions() {
        width = image.getWidth(null);
        height = image.getHeight(null);
    }
    
    public void setX(int x) {
    	this.x=x;
    }
    
    public void setY(int y) {
    	this.y=y;
    }

    public int getWidth() {
		return this.width;
	}

	public int getHeight() {
		return this.height;
	}

    public void addX(int x) {
    	this.x+=x;
    }
    
    public void addY(int y) {
    	this.y+=y;
    }
    
	public Image getImage() {
        return image;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }
    
    public Shape clone() {
    	return new Shape(x,y);
    }
}
