package asd;

public class Klient {
    private int id;
    private String name;
    private String surname;
    private String selection;
    private String sumOfCredit;

    public Klient() {
    }

    public Klient(int id, String name, String surname, String selection, String sumOfCredit) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.selection = selection;
        this.sumOfCredit = sumOfCredit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSelection() {
        return selection;
    }

    public void setSelection(String selection) {
        this.selection = selection;
    }

    public String getSumOfCredit() {
        return sumOfCredit;
    }

    public void setSumOfCredit(String sumOfCredit) {
        this.sumOfCredit = sumOfCredit;
    }

    @Override
    public String toString() {
        return "Klient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", selection='" + selection + '\'' +
                ", sumOfCredit='" + sumOfCredit + '\'' +
                '}';
    }
}
