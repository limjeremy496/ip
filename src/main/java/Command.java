import java.io.IOException;

public abstract class Command {
    public abstract void execute(TaskList tasks, Ui ui, Storage storage) throws VinegarException, IOException;
    public boolean isExit() {
        return false;
    }
}
