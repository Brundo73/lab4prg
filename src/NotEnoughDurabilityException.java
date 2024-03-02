public class NotEnoughDurabilityException extends Exception{
    NotEnoughDurabilityException () {
        super("Для вскрытия не хватает прочности инструмента");
    }

}
