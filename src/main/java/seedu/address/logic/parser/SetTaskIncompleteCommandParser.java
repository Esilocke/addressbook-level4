package seedu.address.logic.parser;

//@@author Esilocke

import static seedu.address.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;

import seedu.address.commons.core.index.Index;
import seedu.address.commons.exceptions.IllegalValueException;
import seedu.address.logic.commands.SetTaskIncompleteCommand;
import seedu.address.logic.parser.exceptions.ParseException;

/** Parses input arguments and returns a {@code SetTaskIncompleteCommand} that changes the state of the given command */
public class SetTaskIncompleteCommandParser implements Parser<SetTaskIncompleteCommand> {

    /**
     * Parses the given {@code String} of arguments in the context of the SetTaskIncompleteCommand
     * and returns an SetTaskIncompleteCommand object for execution.
     * @throws ParseException if the user input does not conform the expected format
     */
    public SetTaskIncompleteCommand parse(String args) throws ParseException {
        try {
            Index index = ParserUtil.parseIndex(args);
            return new SetTaskIncompleteCommand(index);
        } catch (IllegalValueException ive) {
            throw new ParseException(
                    String.format(MESSAGE_INVALID_COMMAND_FORMAT, SetTaskIncompleteCommand.MESSAGE_USAGE));
        }
    }
}
