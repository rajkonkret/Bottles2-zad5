class MyWater {
    private static int smallCapacity;
    private static int midCapacity;
    private static int largeCapacity;
    private int smallCounter;
    private int midCounter;
    private int largeCounter;

    MyWater() {
    }

    void addLarge(int large) {
        largeCounter = largeCounter + large;
        System.out.println(largeCounter);
    }

    void addSmall(int small) {
        smallCounter = smallCounter + small;
        System.out.println(smallCounter);
    }

    void addMid(int mid) {
        midCounter = midCounter + mid;
        System.out.println(midCounter);
    }

    static void setLargeCapacity(int largeCapacity) {
        MyWater.largeCapacity = largeCapacity;
    }

    static void setMidCapacity(int midCapacity) {
        MyWater.midCapacity = midCapacity;
    }

    static void setSmallCapacity(int smallCapacity) {
        MyWater.smallCapacity = smallCapacity;
    }

    static int getLargeCapacity() {
        return largeCapacity;
    }
    static int getSmallCapacity(){
        return smallCapacity;
    }

    static int getMidCapacity() {
        return midCapacity;
    }

    int getSmallCounter() {
        return smallCounter;
    }

    int getLargeCounter() {
        return largeCounter;
    }

    int getMidCounter() {
        return midCounter;
    }
}
