public abstract interface Vehicle {
    String modelName = null;
    int wheelsCount = 0;

    public default void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public default String getModelName() {
        return modelName;
    }

    public default void setModelName(String modelName) {
        modelName = modelName;
    }

    public default int getWheelsCount() {
        return wheelsCount;
    }

    public default void setWheelsCount(int wheelsCount) {
        wheelsCount = wheelsCount;
    }
}
