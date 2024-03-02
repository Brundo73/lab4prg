public class Leica extends Person implements Radioman {
    public Leica() {
        super("Лейк");
    }

    public void autopsyPrep(Specimen specimen, Instrument instrument) {
        System.out.println(this.getName() + " подготовил к вскрытию: " + specimen.getName() + ", с помощью инструмента: " + instrument.getName());
        try {
            instrument.autopsy(specimen);
        } catch (NotEnoughDurabilityException e) {
            System.out.println(e.getMessage());
        }
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
    @Override
    public String getAnswer() {
        return "Получатель: " + this.getName();
    }
    class Instrument { //вложенный нестатичный класс
        final int durability;
        final String name;
        Instrument(String name, int durability) {
            this.durability = durability;
            this.name=name;
        }
        public int getDurability() {
            return this.durability;
        }
        public String getName() {
            return this.name;
        }
        public void autopsy(Specimen specimen) throws NotEnoughDurabilityException {
            if (specimen.getDurability()<this.getDurability()) {
                System.out.println("Вскрытие удалось");
            } else {
                throw new NotEnoughDurabilityException();
            }
        }

    }
}
