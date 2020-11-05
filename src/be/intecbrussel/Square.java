package be.intecbrussel;

public class Square extends Rectangle {

    Square() {
    }

    public void setPosition(int pos) {
        setPosition(pos);
    }

    public void setHeight(int h) {
        setSide(h);

    }

    public void setWidth(int w) {
        setSide(w);
    }

    public void setxPos(int x) {
        setxPos(x);
    }

    public void setyPos(int y) {
        setyPos(y);
    }

    public void setSide(int side) {
        setHeight(side);
        setWidth(side);
    }


}
