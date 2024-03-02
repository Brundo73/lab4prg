public abstract class Person  {
    private final String name;
    public Person(String name) {
        this.name = name;
    }
    public void say(String theme) {
        System.out.println(this.getName() + " сказал о " + theme);
    }

    public String getName() {
        return this.name;
    }
    @Override
    public String toString() {
        return this.getName();
    }
    @Override
    public int hashCode() {
        return super.hashCode() + this.getName().hashCode();
    }
    @Override
    public boolean equals(Object obj) {
        if (this.getClass() == obj.getClass()) {
            return obj.hashCode() == this.hashCode();
        } else {return false;}
    }
}