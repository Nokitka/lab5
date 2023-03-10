package dragon;

public class DragonHead {
    private float eyesCount;
    private int toothCount;

    public DragonHead(float eyesCount, int toothCount) {
        this.eyesCount = eyesCount;
        this.toothCount = toothCount;
    }


    @Override
    public String toString() {
        return "DragonHead{" +
                "eyesCount : " + eyesCount +
                ", toothCount : " + toothCount +
                '}';
    }

    public float getEyesCount() {
        return eyesCount;
    }

    public void setEyesCount(float eyesCount) {
        this.eyesCount = eyesCount;
    }

    public int getToothCount() {
        return toothCount;
    }

    public void setToothCount(int toothCount) {
        this.toothCount = toothCount;
    }
}
