package day11;

public class Warehouse implements Worker {
    private  int countPickedOrders;
    private final int countDeliveredOrders;

    public Warehouse(int countPickedOrders, int countDeliveredOrders) {
        this.countPickedOrders = countPickedOrders;
        this.countDeliveredOrders = countDeliveredOrders;
    }
    @Override
    public int doWork() {
       return countPickedOrders++;
    }

    @Override
    public void bonus() {

    }

    @Override
    public String toString() {
        return "Заказаво собранно: " + countPickedOrders
                + "\nЗаказов доставленно: " + countDeliveredOrders;
    }

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }
}
