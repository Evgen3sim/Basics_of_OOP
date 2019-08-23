package by.epam.task5_2.entity;


import java.util.ArrayList;

public class Gift {

    ArrayList<Packaging> packagings = new ArrayList<>();

    public void addPackagings(Packaging packaging){
        if (packaging != null){
           packagings.add(packaging);
        }
    }

    public void removePackagings(Packaging packaging){
        if (packaging != null){
            packagings.remove(packaging);
        }
    }

    public Packaging getPackingingByType(String name){
        Packaging packaging = null;
        if (name != null){
            for (int i = 0; i < packagings.size(); i++){
                if (packagings.get(i).getType().equals(name)){
                    packaging = packagings.get(i);
                }
            }
        }
        return packaging;
    }

    public ArrayList<Packaging> getPackagings() {
        return packagings;
    }

    public void setPackagings(ArrayList<Packaging> packagings) {
        this.packagings = packagings;
    }

    @Override
    public String toString() {
        return "Gift{" +
                "packagings=" + packagings +
                '}';
    }
}
