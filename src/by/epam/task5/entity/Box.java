package by.epam.task5.entity;

import java.util.ArrayList;

public class Box {

    private String nameBox;
    ArrayList<Flower> flowers = new ArrayList<>();

    public Box(String nameBox) {
        this.nameBox = nameBox;
    }

    public void addFlower(Flower flower){
        if (flower != null){
            flowers.add(flower);
        }
    }

    public void renameFlower(Flower flower){
        if (flower != null){
            flowers.remove(flowers);
        }
    }

    public Flower getFlowerByName(String name){
        Flower flower = null;
        if (name != null){
            for (int i = 0; i < flowers.size(); i++){
                if (flowers.get(i).getName().equals(name)){
                    flower = flowers.get(i);
                    break;
                }
            }
        }
        return flower;
    }

    public String getNameBox() {
        return nameBox;
    }

    public void setNameBox(String nameBox) {
        this.nameBox = nameBox;
    }

    public ArrayList<Flower> getFlowers() {
        return flowers;
    }

    public void setFlowers(ArrayList<Flower> flowers) {
        this.flowers = flowers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Box)) return false;

        Box box = (Box) o;

        if (getNameBox() != null ? !getNameBox().equals(box.getNameBox()) : box.getNameBox() != null) return false;
        return getFlowers() != null ? getFlowers().equals(box.getFlowers()) : box.getFlowers() == null;
    }

    @Override
    public int hashCode() {
        int result = getNameBox() != null ? getNameBox().hashCode() : 0;
        result = 31 * result + (getFlowers() != null ? getFlowers().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Box{" +
                "nameBox='" + nameBox + '\'' +
                ", flowers=" + flowers +
                '}';
    }
}
