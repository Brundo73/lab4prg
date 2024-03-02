public class Main {
    public static void main(String[] args) {
        ArkhemStaff arkhemStaff = new ArkhemStaff();
        Dyer Dyer = new Dyer();
        Leica Leic = new Leica();
        Leica.Instrument autopsyInstuments = Leic.new Instrument("Инструменты для вскрытия", 70);
        Mactai Mactai = new Mactai();
        ArkhemRadioman radioArkhem = new ArkhemRadioman();
        Pebody Pebody = new Pebody();
        Sherman Sherman = new Sherman();
        Douglas Douglas = new Douglas();
        DogSled sled = new DogSled();
        CampStaff campStaff = new CampStaff();
        Specimen gymOldOne = new Specimen("Мускулистый", 100);
        Specimen disabledOldOne = new Specimen("Поврежденный", 65);

        campStaff.dig();
        Leic.say(" находке экземпляров. Описал их");
        Dyer.feel("чувства, которые тяжело описать словами");
        Pebody.feel("чувства, которые тяжело описать словами");
        arkhemStaff.rejoice();
        Leic.send(radioArkhem);
        Mactai.translate("английский");
        radioArkhem.send(Leic);
        Dyer.congrat(Leic, "находками");
        Sherman.congrat(Leic, "находками");
        Douglas.congrat(Leic, "находками");
        Dyer.say("находках");

        Radioman worldRadio = new Radioman() { //анонимный класс
            @Override
            public String getAnswer() {
                return "Получатель: Радист большого мира";
            }

            @Override
            public void send(Radioman gainer) {
                System.out.println(this.getAnswer()+" отправил сообщение. Получатель: " + gainer.getAnswer());
            }

            @Override
            public void gain() {
                System.out.println(this.getAnswer()+" получил сообщение");
            }
            {
                radioArkhem.send(this);
            }
        };

        try {
            Dyer.sleep();
        } catch (TooExitedToSleepException e) {
            System.out.println(e.getMessage());
        }
        Leic.say("доставке экземпляров в лагерь");
        Leic.send(radioArkhem);
        Leic.say("ухудшение погоды в горах");
        Leic.send(radioArkhem);
        Dyer.feel("разочарование");
        sled.transport(new String[]{"9 человек", "14 находок"});
        campStaff.build("укрытие из снега");
        Leic.say("перевозке находок в лагерь");
        Leic.send(radioArkhem);
        Dyer.feel("жгучий интерес");
        campStaff.place("на плотном снегу рядом с палатками", "Все экземпляры, кроме одного,");
        Leic.autopsyPrep(gymOldOne, autopsyInstuments);
        Leic.autopsyPrep(disabledOldOne, autopsyInstuments);
        DogSled.Dog.bark();
    }
}