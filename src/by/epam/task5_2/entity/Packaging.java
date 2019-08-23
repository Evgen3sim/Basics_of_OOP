package by.epam.task5_2.entity;


import java.util.ArrayList;

public class Packaging {

    private String type;
    ArrayList<Sweets> sweets = new ArrayList<>();

    public Packaging(String type) {
        this.type = type;
    }

    public void addSweets(Sweets sweet){
        if (sweet != null){
            sweets.add(sweet);
        }
    }

    public void removeSweets(Sweets sweet){
        if (sweet != null){
            sweets.remove(sweet);
        }
    }

    public Sweets getSweetsByName(String name){
        Sweets sweet = null;
        if (sweet != null){
            for (int i = 0; i < sweets.size(); i++){
                if (sweets.get(i).getName().equals(name)){
                    sweet = sweets.get(i);
                    break;
                }
            }
        }

        return sweet;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ArrayList<Sweets> getSweets() {
        return sweets;
    }

    public void setSweets(ArrayList<Sweets> sweets) {
        this.sweets = sweets;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Packaging)) return false;

        Packaging packaging = (Packaging) o;

        if (!getType().equals(packaging.getType())) return false;
        return getSweets().equals(packaging.getSweets());
    }

    @Override
    public int hashCode() {
        int result = getType().hashCode();
        result = 31 * result + getSweets().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Packaging{" +
                "type='" + type + '\'' +
                ", sweets=" + sweets +
                '}';
    }
}
