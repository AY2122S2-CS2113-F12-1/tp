package commands;

import common.Messages;
import manager.RecordManager;
import data.record.Record;

import java.util.List;

import static ui.TextUi.DISPLAYED_INDEX_OFFSET;

/**
 * Represents an executable command.
 */
public class Command {
    protected RecordManager recordMgr;
    private int index = -1;

    public Command() {
    }

    /**
     * Constructs a feedback message to summarise an operation that displayed a listing of records.
     *
     * @param recordsDisplayed used to generate summary
     * @return summary message for records displayed
     */
    public static String getMessageForRecordListSummary(List<Record> recordsDisplayed) {
        return String.format(Messages.MESSAGE_PERSONS_LISTED_OVERVIEW, recordsDisplayed.size());
    }

    /**
     * Executes the command and returns the result.
     */
    public CommandResult execute() {
        throw new UnsupportedOperationException("This method is to be implemented by child classes");
    };

    /**
     * Supplies the data the command will operate on.
     */
    public void setData(RecordManager recordMgr) {
        this.recordMgr = recordMgr;
    }
}