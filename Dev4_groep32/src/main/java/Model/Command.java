//code by Ashley Hart

/*
Voor al de code dat de Command pattern betreft is bijna alles veranderd 
om te kunnen passen aan het onderwerp. De User classe werd verwijderd 
en er zijn geen Delete, Edit en Show commands meer omdat ik na reflectie verkend heb dat deze pattern daar niet bij paste.
In de plaats hebben we nu gewoon AddCommand en SubtractCommand
Het enige wat gehouden werd is de Command interface 
maar deze werd gewijzigd met een extra undo().
*/

package Model;

public interface Command {
    void execute();
    void undo();
}
