import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.List;
import java.util.ArrayList;

public abstract class Actor {
  Color color;
  Cell loc;
  List<Polygon> display;

  List<Item> requiredItems;
  List<Item> inventory;
  
protected Actor(){}
  protected Actor(List<Item> requiredItems){
    this.requiredItems = requiredItems;
    this.inventory = new ArrayList<>();
  }


  public void paint(Graphics g) {
    for(Polygon p: display) {
      g.setColor(color);
      g.fillPolygon(p);
      g.setColor(Color.GRAY);
      g.drawPolygon(p);
    }
  }

}
