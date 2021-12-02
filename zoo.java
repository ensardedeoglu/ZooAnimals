class Dog implements iAnimal{
    String AnimalType;
    int IdTag;
    int MinTemperature;
    int MaxTemperature;

    Dog(){
        MinTemperature = 10;
        MaxTemperature = 25;
        AnimalType = "Dog";
    }

    public String getAnimalType() {
        return AnimalType;
    }
    public int getIdTag() {
        return IdTag;
    }
    public void setIdTag(int anIdTag) {
        IdTag = anIdTag;
    }
    public int getMinTemperature() {
        return MinTemperature;  
    }
    public int getMaxTemperature() {
        return MaxTemperature;
    }
}
