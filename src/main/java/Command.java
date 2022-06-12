public interface Command {

    RowManager rowManager = new RowManager();

    void execute(String[] parameters);

}
