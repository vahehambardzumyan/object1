public class Concole {
    String name;
    int year;
    String company;

    public Concole(String name, int year, String company) {
        this.name = name;
        this.year = year;
        this.company = company;
    }

    public int description(int count) {
        for (int i = 0; i <= count; i++) {
            System.out.println(name);
            System.out.println(year);
            System.out.println(company);
            year+=i;
        }
        return year;
    }

}
