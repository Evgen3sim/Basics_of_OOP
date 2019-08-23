package by.epam.task5.entity;

import java.util.ArrayList;

public class FlowerComposition {

    ArrayList<Box> boxes = new ArrayList<>();

    public void addBox(Box box){
        if (box != null){
            boxes.add(box);
        }
    }

    public void removeBox(Box box){
        if (box != null){
            boxes.remove(box);
        }
    }

    public Box getBoxByName(String name){
        Box box = null;
        if (name != null){
            for (int i = 0; i < boxes.size(); i++){
                if (boxes.get(i).getNameBox().equals(name)){
                    box = boxes.get(i);
                }
            }
        }
        return box;
    }

    public ArrayList<Box> getBoxes() {
        return boxes;
    }

    public void setBoxes(ArrayList<Box> boxes) {
        this.boxes = boxes;
    }

    @Override
    public String toString() {
        return "FlowerComposition{" +
                "boxes=" + boxes +
                '}';
    }
}
