package project6Code;

/*
 * a Parser module that parses the input
 * The main function of the parser is to break each assembly command into its underlying components (fields and symbols).
 */

 /**
 * @author Sami Cemek
 * @author Sebastian Mark
 * @date Nov 15 2022
 * @version 1.1
 */
public class Parser {

    // Constructor:  Opens the input file/stream and gets ready to parse it.
    Parser(){

    }
    
    // Are there more commands in the input?
    public boolean hasMoreCommands(){
        return false;
        
    }

    /**
     *   Reads the next command from
     *   the input and makes it the current
     *   command. Should be called only
     *   if hasMoreCommands() is true.
     *   Initially there is no current command.
     *
     */
    public void advance(){

    }

    // I'm not sure if the return type suppose to be String or Command
    /**
     * Returns the type of the current command:
     * @return A_COMMAND for @Xxx where Xxx is either a symbol or a decimal number
     * @return C_COMMAND for dest=comp;jump         
     * @return L_COMMAND (actually, pseudocommand) for (Xxx) where Xxx is a symbol.  
     */
    public String commandType(){
        return null;

    }

    /**
     * Returns the symbol or decimal
        Xxx of the current command
        Xxx or (Xxx). Should be called
        only when commandType() is
        A_COMMAND or L_COMMAND.
     * @return
     */
    public String symbol(){
        return null;

    }

    /**
     * Returns the dest mnemonic in
        the current C-command (8 possibilities). Should be called only
        when commandType() is C_COMMAND.
     * @return
     */
    public String dest(){
        return null;
        
    }

    /**
     * Returns the comp mnemonic in
        the current C-command (28 possibilities). Should be called only
        when commandType() is
        C_COMMAND
     * @return
     */
    public String comp(){
        return null;

    }

    /**
     * Returns the jump mnemonic in
     * the current C-command (8 possibilities). Should be called only
     * when commandType() is
     * C_COMMAND.
     * @return
     */
    public String jump(){
        return null;

    }
}
