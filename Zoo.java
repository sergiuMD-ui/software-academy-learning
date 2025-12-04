public class Zoo {
    public void openZoo(Number time){
        if(time instanceof Integer){
            System.out.println(time + " o'clock");
        }
        else{
            System.out.println("Not integer");
        }

    }
}
