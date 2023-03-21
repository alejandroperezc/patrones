class Computer {

    String HDD;
    String RAM;

    boolean isGraphicsCardEnabled;
    boolean isBluetoothEnabled;

    static class Builder{
        String HDD, RAM;
        boolean isGraphicsCardEnabled, isBluetoothEnabled;

        public Builder(String HDD, String RAM) {
            this.HDD = HDD;
            this.RAM = RAM;
        }

        Builder setIsGraphicsCardEnabled(boolean isGraphicsCardEnabled){
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this;
        }
        Builder setIsBluetoothEnabled(boolean isBluetoothEnabled){
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        Computer build(){
            Computer computer = new Computer();
            computer.HDD = this.HDD;
            computer.RAM = this.RAM;
            computer.isGraphicsCardEnabled = this.isGraphicsCardEnabled;
            computer.isBluetoothEnabled = this.isBluetoothEnabled;
            return computer;
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Computer computer = new Computer.Builder("5gb","24gb")
                .setIsBluetoothEnabled(true)
                .build();

        System.out.println(computer.HDD + computer.RAM + computer.isBluetoothEnabled + computer.isGraphicsCardEnabled);

    }
}