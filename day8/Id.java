public class Id {

    private String id;
    private int turn;
    private int stage;

    public Id(String id, int turn, int stage){
        this.id = id;
        this.turn = turn;
        this.stage = stage;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return id;
    }
    public void setTurn(int turn) {
        this.turn = turn;
    }
    public int getTurn(){
        return turn;
    }
    public void setStage(int stage){
        this.stage = stage;
    }
    public int getStage(){
        return stage;
    }
}
