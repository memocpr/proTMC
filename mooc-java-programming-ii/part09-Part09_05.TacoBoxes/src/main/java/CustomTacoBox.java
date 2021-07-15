public class CustomTacoBox implements TacoBox{

    private int tacos;

    public CustomTacoBox(int customTacos){

        this.tacos=customTacos;

    }

    @Override
    public int tacosRemaining() {
        return tacos;
    }

    @Override
    public void eat() {

        if(tacos-1>=0){
            tacos--;
        }
    }
}
