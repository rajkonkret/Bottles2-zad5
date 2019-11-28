class MyWater {
    private static double smallCapacity;
    private static double midCapacity;
    private static double largeCapacity;
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

    double getWater() {
        return largeCounter * largeCapacity + smallCounter * smallCapacity + midCounter * midCapacity;
    }

    static void setLargeCapacity(double largeCapacity) {
        MyWater.largeCapacity = largeCapacity;
    }

    static void setMidCapacity(double midCapacity) {
        MyWater.midCapacity = midCapacity;
    }

    static void setSmallCapacity(double smallCapacity) {
        MyWater.smallCapacity = smallCapacity;
    }

    static double getLargeCapacity() {
        return largeCapacity;
    }

    static double getSmallCapacity() {
        return smallCapacity;
    }

    static double getMidCapacity() {
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
