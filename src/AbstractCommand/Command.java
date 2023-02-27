package AbstractCommand;

/**
 * Interface use method execute
 */
@FunctionalInterface
interface Command {
    /**
     * Method for executing command
     */
    void execute();
}