package racingcar.Model;

import racingcar.Util;

public class Car {
    private String name;
    private int position = 0;

    public Car(String name){
        this.name = name;
    }

    public int getPosition(){
        return position;
    }

    public String getName(){
        return name;
    }

    public void go(){
        if( Util.getRandomNum() >= 4){
            position++;
        }
    }

    public boolean isWinner(int winDistance){
        return position == winDistance;
    }

    @Override
    public String toString() {
        return name + " : "
                + "-".repeat(Math.max(0, position));
    }
}
