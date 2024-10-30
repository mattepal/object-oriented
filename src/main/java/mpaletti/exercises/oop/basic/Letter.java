package mpaletti.exercises.oop.basic;

public class Letter {
    private final String from;
    private final String to;
    private final StringBuilder lines;

    public Letter(String from, String to) {
        this.from = from;
        this.to = to;
        this.lines= new StringBuilder();
    }
    public void addLine(String line){
        lines.append(line).append('\n');
    }
    public String getText(){
        return "dear"+ from +":\n\n"+ lines + "\nSincerely\n\n" +to;
    }
}
