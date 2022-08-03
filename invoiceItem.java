package day4;

public class invoiceItem {

    String id;
    String desc;
    int qty;
    double unitprice;


    public void invoiceItem(String id, String desc, int qty, double unitprice){

    }

    public String getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public int getQty() {
        return qty;
    }

    public double getUnitprice() {
        return unitprice;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setUnitprice(double unitprice) {
        this.unitprice = unitprice;
    }

    @Override
    public String toString() {
        return "invoiceItem{" +
                "id='" + id + '\'' +
                ", desc='" + desc + '\'' +
                ", qty=" + qty +
                ", unitprice=" + unitprice +
                '}';
    }
    public double Total(int qty, double unitprice){

        return unitprice*qty;
    }
}
