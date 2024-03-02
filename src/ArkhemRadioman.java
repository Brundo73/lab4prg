public class ArkhemRadioman extends Person implements Radioman {
    public ArkhemRadioman() {super("Радист с Аркхема");}
    @Override
    public String getAnswer() {
        return "Получатель: " + this.getName();
    }

    @Override
    public void send(Radioman gainer) {
        System.out.println(this.getName()+ " отправил сообщение. " + gainer.getAnswer());
        gainer.gain();
    }

    @Override
    public void gain() {
        System.out.println(this.getName() + " получил сообщение");
    }


}
