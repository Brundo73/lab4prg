public class CampStaff {
    public CampStaff() {}
    public void build(String building) {
        System.out.println("В лагере построили " + building);
    }
    public void place(String loc, String items) {
        System.out.println(items + " положили " + loc);
    }

    public void dig() {
        System.out.println("Рабочие готовятся бурить");
        {
            class Drill { //локальный класс
                public String name;
                public Drill(String name) {
                    this.name=name;
                }
                public void drilling() {
                    System.out.println(this.name + " бурит");
                }
            }
            Drill drill = new Drill("Бур Пэбоди");
            drill.drilling();
        }
        System.out.println("Рабочие пректратили бурить");

    }
}
