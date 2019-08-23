package by.epam.task5_2.entity;

public class Sweets {

    private String name;

    public Sweets(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sweets sweets = (Sweets) o;

        return name != null ? name.equals(sweets.name) : sweets.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Sweets{" +
                "name='" + name + '\'' +
                '}';
    }
}
